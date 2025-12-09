#  Sistem Manajemen Penumpang Bus – OOP

Nama : Muhammad Razi Siregar

NPM : 2408107010101

Proyek ini merupakan implementasi program **manajemen penumpang bus** menggunakan konsep **Object-Oriented Programming (OOP)**.  
Program berjalan melalui **menu interaktif**, mendukung:

- naik / turun penumpang  
- pengecekan ID unik  
- prioritas otomatis  
- sistem pembayaran ongkos  
- tampilan daftar penumpang

##  Fitur Utama

###  Sistem Menu Interaktif

===== BUS TRANS KOETARADJA ======

MENU :
1. Naikkan Penumpang
2. Turunkan Penumpang
3. Lihat Penumpang
4. Keluar


###  Naikkan Penumpang
- input ID, umur, status hamil  
- validasi ID tidak duplikat  
- penentuan otomatis BIASA / PRIORITAS  
- otomatis bayar ongkos (via interface)  

###  Turunkan Penumpang
- menghapus penumpang berdasarkan ID

###  Lihat Daftar Penumpang
Format: [PRIORITAS] 34 (umur: 4, hamil: false, saldo: 8000)

###  Prioritas Otomatis
Penumpang di-set PRIORITAS jika:
- umur > 60  
- hamil = true  

##  Contoh Output Program
===== BUS TRANS KOETARADJA ======

MENU :
1. Naikkan Penumpang
2. Turunkan Penumpang
3. Lihat Penumpang
4. Keluar

Pilih menu: 1

Masukkan ID Penumpang: 34

Masukkan umur: 4

Apakah hamil? (true/false): false

✔ Penumpang berhasil naik!

===== DAFTAR PENUMPANG =====

[PRIORITAS] 34 (umur: 4, hamil: false, saldo: 8000)
