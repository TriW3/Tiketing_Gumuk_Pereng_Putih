
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class koneksi {
    Connection con = null;
    String driver="com.mysql.jdbc.Driver";
    String url="jdbc:mysql://localhost:3306/magang";
    String user ="root";
    String pass="";

    public koneksi() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        con=DriverManager.getConnection(url, user, pass);
        System.out.println("Koneksi sukses slur");
        
    }
    public Connection getConnection()
    {
        return con;
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        koneksi kon = new koneksi();
    }
    
}
