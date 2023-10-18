/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
public class dataBarang extends javax.swing.JFrame {

    /**
     * Creates new form dataBarang
     */
    public dataBarang() {
        initComponents();
        String [] judul ={" Kode Kegiatan "," Kegiatan ","Fasilitas","HTM","HTM Fasilitas"};
        model= new DefaultTableModel(judul, 0);
        tTabel.setModel(model);
        tampilkan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    DefaultTableModel model;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nKode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nNabar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tTabel = new javax.swing.JTable();
        bInput = new javax.swing.JButton();
        bSave = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nJumlah = new javax.swing.JTextField();
        nHarga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nSatuan = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Kode kegiatan");

        jLabel2.setText("Keperluan");

        jLabel3.setText("Fasilitas ");

        tTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tTabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tTabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tTabel);

        bInput.setBackground(new java.awt.Color(0, 204, 255));
        bInput.setText("Input");
        bInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInputActionPerformed(evt);
            }
        });

        bSave.setBackground(new java.awt.Color(0, 204, 102));
        bSave.setText("save");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        bEdit.setBackground(new java.awt.Color(255, 255, 0));
        bEdit.setText("Edit");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });

        bDelete.setBackground(new java.awt.Color(204, 204, 0));
        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bExit.setBackground(new java.awt.Color(255, 0, 0));
        bExit.setText("Exit");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel4.setText("Input data LOG Kegiatan ");

        jLabel5.setText("HTM");

        jLabel7.setText("HTM Fasilitas");

        nSatuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Tenda", "Rumah Liliput" }));
        nSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nSatuanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(nHarga))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nKode, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(nNabar))
                        .addGap(267, 267, 267))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bInput, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bSave, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185)
                        .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nNabar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bInput)
                    .addComponent(bSave)
                    .addComponent(bEdit)
                    .addComponent(bDelete)
                    .addComponent(bExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInputActionPerformed
        nKode.setEditable(true);
        nNabar.setEditable(true);
        nSatuan.setEditable(true);
        nJumlah.setEditable(true);
        nHarga.setEditable(true);
       
        
        nNabar.requestFocus();
    }//GEN-LAST:event_bInputActionPerformed

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_bExitActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/magang","root","");
            cn.createStatement().executeUpdate("insert into keperluan values "+"('"+nKode.getText()+"','"+nNabar.getText()+"','"+nSatuan.getSelectedItem()+"','"+nJumlah.getText()+"','"+nHarga.getText()+"')");
           
            tampilkan();
            reset();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Simpan gagal");
            System.err.println("eror : " + ex.getMessage());
        }
         
    }//GEN-LAST:event_bSaveActionPerformed

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
      
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/magang","root","");
            cn.createStatement().executeUpdate("update keperluan set Keterangan ='"+nNabar.getText()+"',Fasilitas ='"+nSatuan.getSelectedItem()+"',HTM ='"+nJumlah.getText()+"',HTMF='"+nHarga.getText()+"' where Kode='"+nKode.getText()+"'");
            tampilkan();
            reset();
            JOptionPane.showMessageDialog(null, "Edit Data Berhasil");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Edit Data gagal");
            Logger.getLogger(dataBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        aturLebar();
    }//GEN-LAST:event_bEditActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/magang","root","");
            cn.createStatement().executeUpdate("delete from keperluan where Kode ='"+nKode.getText()+"' ");
            tampilkan();
            reset();
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hapus Data gagal");
             Logger.getLogger(dataBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void tTabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tTabelMouseClicked
            int i =tTabel.getSelectedRow();
            if(i>-1){
            nKode.setText(model.getValueAt(i, 0).toString());
            nNabar.setText(model.getValueAt(i, 1).toString());
            nSatuan.setSelectedItem(model.getValueAt(i, 2).toString());
            nJumlah.setText(model.getValueAt(i, 3).toString());
            nHarga.setText(model.getValueAt(i, 4).toString());
            }
      
        
    }//GEN-LAST:event_tTabelMouseClicked

    private void nSatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nSatuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nSatuanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bInput;
    private javax.swing.JButton bSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nHarga;
    private javax.swing.JTextField nJumlah;
    private javax.swing.JTextField nKode;
    private javax.swing.JTextField nNabar;
    private javax.swing.JComboBox<String> nSatuan;
    private javax.swing.JTable tTabel;
    // End of variables declaration//GEN-END:variables

    private void nonaktifkan(){
        nKode.setEditable(false);
        nNabar.setEditable(false);
        nSatuan.setEditable(false);
        nJumlah.setEditable(false);
        nHarga.setEditable(false);
    }
    
    private void reset(){
        nKode.setText(null);
        nNabar.setText(null);
        nSatuan.getSelectedItem();
        nJumlah.setText(null);
        nHarga.setText(null);
    }
    
    private void aturLebar(){
        TableColumn column;
        tTabel.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        column=tTabel.getColumnModel().getColumn(0);
        column.setPreferredWidth(80);
        column=tTabel.getColumnModel().getColumn(1);
        column.setPreferredWidth(200);
        column=tTabel.getColumnModel().getColumn(2);
        column.setPreferredWidth(100);
        column=tTabel.getColumnModel().getColumn(3);
        column.setPreferredWidth(80);
        column=tTabel.getColumnModel().getColumn(4);
        column.setPreferredWidth(100);
    }
    
    private void tampilkan() {
     int row = tTabel.getRowCount();
     for(int a=0; a<row; a++){
         model.removeRow(0);
     }
        try {
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/magang","root","");
           ResultSet rs = cn.createStatement().executeQuery("SELECT * from keperluan");
           while(rs.next()){
               String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)};
               model.addRow(data);
           }
        } catch (SQLException ex) {
            Logger.getLogger(dataBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
      nonaktifkan();
      aturLebar();
    }


}

