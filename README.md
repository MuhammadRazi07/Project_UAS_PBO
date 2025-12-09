Sistem Manajemen Penumpang Bus – OOP

  Proyek ini merupakan implementasi program manajemen penumpang bus menggunakan konsep Object-Oriented Programming (OOP). Program dijalankan melalui menu interaktif, mendukung fitur naik/turun penumpang, pengecekan ID, prioritas, dan sistem pembayaran otomatis.

Fitur Utama
1. Sistem Menu Interaktif

===== BUS TRANS KOETARADJA ======
MENU :
1. Naikkan Penumpang
2. Turunkan Penumpang
3. Lihat Penumpang
4. Keluar

2. Naikkan Penumpang
- Input ID, umur, dan status hamil
- Sistem menentukan tipe penumpang (BIASA / PRIORITAS)
- Otomatis memotong saldo ongkos bus
- Validasi: tidak boleh ID duplikat

3. Turunkan Penumpang
- Menghapus penumpang berdasarkan ID

4. Lihat Semua Penumpang
- Menampilkan daftar penumpang dengan format: [PRIORITAS] 34 (umur: 4, hamil: false, saldo: 8000)

5. Priotitas Otomatis
Aturan prioritas:
- Umur > 60  
- Ibu hamil

6. Contoh Output Program
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
