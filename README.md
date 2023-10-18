## APLIKASI PENGELOLAAN TIKET BUMI PERKEMAHAN GUMUK PERENG PUTIH<br>
### prolog<br>
aplikasi ini saya buat saat menjalankan program magang atau kerja praktek dikampus saya pada tanggal 17 maret 2022. karena saat itu sedang pandemi Covid19 dan pemerintah mengumumkan lockdown dari bulan maret serta mewajibkan untuk WFH maka kegiatan kerja praktek saya tidak diharuskan untuk apply pada instansi, perusahaan atau starup, dan diperbolehkan untuk masuk pada UMKM lokal, dan saya memilih tempat wisata bumi perkemahan Gumuk Pereng Putih karena tempat ini baru saja dibangun, belum dibuka secara resmi, dan saat itu pandemi Covid jadi sudah pasti tempat wisata akan sepi dan aman dari persebaran virus Covid19. <br>
### Latar Belakang <br> 
Gumuk Pereng Putih dikelola oleh para pemuda setempat dengan penanggung jawab Bapak RW 06 lingkungan Piyoto, dan dengan peluang yangbegitu besar untuk bertumbuh,proses bisnis yang ada di sana masih sangatlah tradisional dan tidak memadai, saat saya meminta ijin kepada Bapak RW setempat selaku pengelola beliau mengutarakan bahwa membutuhkan sebuah sistem untuk dapat mengelola keuangan dan mampu mengelola pelaporan secara terkomputerisasi dan murah biaya. <br> 
![Bapak Rw](https://github.com/TriW3/Tiketing_Gumuk_Pereng_Putih/assets/100888453/1cec21ae-575b-4beb-a62c-c4b266ae7b47)<br>
![perancangan](https://github.com/TriW3/Tiketing_Gumuk_Pereng_Putih/assets/100888453/1cbd8e4c-9045-48c5-914e-ece4b09a4921)<br>

### solusi <br> 
untuk menjawab kebutuhan tersebut saya bersama penyelia berdiskusi dan memutuskan untuk membuat sebuah program aplikasi berbasis Dekstop sehingga menggunakan server database lokal untuk menyimpan data, serta mudah dioperasikan karena memiliki user interface yang mudah dipahami, serta tidak memerlukan maintenence yang berkelanjutan untuk memastikan aplikasi tersebut tetap berjalan sebagai mana mestinya. <br> 
## Aplikasi <br> 
aplikasi ini saya buat menjadi 3 sub aplikasi, yaitu  :<br> 
1. aplikasi input pelanggan<br>
   berfungsi untuk melakukan input data pelanggan, dapat juga untuk melakukan reservasi sebelumnya, yang nantinya akan di ambil datanya pada interface utama.<br>
   ![form pelanggan](https://github.com/TriW3/Tiketing_Gumuk_Pereng_Putih/assets/100888453/42eae8e4-534e-43d7-a67c-f2dc10877f79)<br>
2. aplikasi input log kegiatan<br>
   berfungsi untuk menginput daftar paket wisata yang tersedia beserta fasilitas yang disewa sehingga memungkinkan untuk mengetahui siapa yang bertanggung jawab untuk barang yang disewa tersebut seperti tenda, rumah liliput, dan gardu pandang.<br>
   ![log kegiatan](https://github.com/TriW3/Tiketing_Gumuk_Pereng_Putih/assets/100888453/00aba73e-d224-4777-9a5d-e2930c8dcd84)<br>

3. aplikasi interface tiketing<br>
   berfungsi untuk melakukan pemrosesan regristasi pelanggan, mulai dari mencetak tiket serta mencetaklaporan keuangan.<br>
   ![interface](https://github.com/TriW3/Tiketing_Gumuk_Pereng_Putih/assets/100888453/6c62a0b8-c4f8-430c-ae89-d863dd7042b8)<br>
   aplikasi ini bekerja dengan hanya menginputkan kode yang telah dibuat sebelumnya, contoh pada form pelanggan telah ada kode 01 bernama ayuk permatasari, maka jika diinputkan kode 01 pada kode pelanggan dan ditekan enter, semua data pada form transaksi akan otomatis terisi sesuai data yang diinputkan pada form pelanggan sebelumnya. begitu juga pada form log kegiatan. <br>

### tiketing 
berikut adalah tiket asli Gumuk Pereng Putih <br>
![tiket asli](https://github.com/TriW3/Tiketing_Gumuk_Pereng_Putih/assets/100888453/6906ec6d-c1fe-4282-9a66-a7134e935ce7)<br> 
dan berikut merupakan tiket yang dicetak oleh sistem <br> 
![pereng cetak](https://github.com/TriW3/Tiketing_Gumuk_Pereng_Putih/assets/100888453/33659cc6-7c40-4483-8d33-d92678352608)<br>



### pelaporan 
untuk pelaporan saya menggunakan plugin jasper report yang tersedia di java.<br> 
![print laporan](https://github.com/TriW3/Tiketing_Gumuk_Pereng_Putih/assets/100888453/395bb95e-b3fc-4d1d-aa25-4d8055a58ff6)<br> 
untuk hasilnya adalah sebagai berikut yang dapat disimpan di dalam bentuk exel. <br>
![hasil laporan exel](https://github.com/TriW3/Tiketing_Gumuk_Pereng_Putih/assets/100888453/5ab80e65-24b0-4045-aef0-c4eea8913467)<br>

### dokumentasi 
1. pos jaga tiket <br>
![WhatsApp Image 2022-03-18 at 16 14 09 (8)](https://github.com/TriW3/Tiketing_Gumuk_Pereng_Putih/assets/100888453/8185a83a-87b1-4eb1-af4d-a60ec044f4af)<br>
2. rumah liliput <br>
![liliput](https://github.com/TriW3/Tiketing_Gumuk_Pereng_Putih/assets/100888453/3d11b021-c3cb-4b59-a175-5520264a24f6)<br>
3. gardu pandang <br>
![gardu pandang](https://github.com/TriW3/Tiketing_Gumuk_Pereng_Putih/assets/100888453/f48c4811-53f6-4083-bf30-ea019cb5f7d5)<br>
4. penyelia <br> 
![WhatsApp Image 2022-03-17 at 17 50 52 (1)](https://github.com/TriW3/Tiketing_Gumuk_Pereng_Putih/assets/100888453/a7fb1c5f-ba67-46b3-967c-27de7d6cd165)<br>
![dokumentasi 2](https://github.com/TriW3/Tiketing_Gumuk_Pereng_Putih/assets/100888453/07efdab2-1f0e-4ba5-bd63-a5c28f7224a3)<br> 
...terimakasih...<br>






