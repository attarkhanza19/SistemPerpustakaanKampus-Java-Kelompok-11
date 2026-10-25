#  Sistem Manajemen Perpustakaan Kampus

##  Deskripsi Proyek

**Sistem Manajemen Perpustakaan Kampus** merupakan aplikasi berbasis Java yang dikembangkan untuk membantu proses pengelolaan perpustakaan di lingkungan kampus.

Aplikasi ini berjalan melalui **Command Line Interface (CLI)** atau terminal dengan menyediakan berbagai fitur pengelolaan data buku, kategori buku, jumlah peminjaman, lokasi penyimpanan, riwayat transaksi, serta antrean mahasiswa.

Proyek ini dibuat sebagai bentuk implementasi materi pemrograman Java dan penerapan berbagai struktur data, yaitu **Array 1 Dimensi, Array 2 Dimensi, Array 3 Dimensi, ArrayList, Stack, dan Queue**.

---

##  Tugas Pemrograman Java

| Keterangan | Informasi |
|---|---|
| **Mata Kuliah** | Pemrograman Berorientasi Objek |
| **Dosen Pengampu** | M. Ibadurrahman Arrasyid Supriyanto, M.Kom. |
| **Program Studi** | Sistem Informasi |
| **Angkatan** | 2025 |
| **Kelompok** | 8 |
| **Bahasa Pemrograman** | Java |
| **IDE** | Apache NetBeans |

---

##  Anggota Kelompok 8

| No. | Nama Lengkap | NIM | Kelas |
|:---:|---|---|:---:|
| 1 | **Muhammad Attar Khanza Habibillah** | 2509116000 | A |
| 2 | **Evan Setiwawa** | 2509116000 | A |
| 3 | **Az-Zahra Imsawati Sugianto** | 2509116062 | B |
| 4 | **Arizky Saputra** | 2509116000 | C |

---

##  Fitur Aplikasi

Aplikasi menyediakan enam menu utama sebagai berikut.

### 1.  Kelola Kategori Buku (Array 1 Dimensi)

Menu ini menggunakan **Array 1 Dimensi** untuk menyimpan daftar kategori buku perpustakaan.

Kategori yang tersedia:
- Pemrograman
- Matematika
- Jaringan Komputer
- Basis Data

**Fitur:**
- Menampilkan seluruh kategori buku.
- Menampilkan indeks setiap kategori.
- Mengubah nama kategori berdasarkan indeks.

**Implementasi:**
```java
String[] kategoriBuku = new String[4];
```

### 2.  Data Jumlah Peminjaman Mingguan (Array 2 Dimensi)

Menu ini menggunakan **Array 2 Dimensi** untuk menyimpan data jumlah peminjaman buku berdasarkan kategori dan hari.

Data disimpan dalam bentuk tabel dengan 4 kategori dan 7 hari.

**Fitur:**
- Menampilkan tabel jumlah peminjaman mingguan.
- Menambahkan jumlah peminjaman berdasarkan kategori dan hari.
- Menghitung total peminjaman pada setiap kategori.

**Implementasi:**
```java
int[][] dataPeminjaman = new int[4][7];
```

### 3.  Lokasi Penyimpanan Buku (Array 3 Dimensi)

Menu ini menggunakan **Array 3 Dimensi** untuk menyimpan lokasi buku berdasarkan lantai, rak, dan posisi.

Struktur penyimpanan:
- 2 lantai
- 3 rak pada setiap lantai
- 4 posisi pada setiap rak

**Fitur:**
- Menampilkan seluruh lokasi penyimpanan buku.
- Menambahkan atau menempatkan buku pada lokasi tertentu.
- Mencari lokasi buku berdasarkan judul.
- Menampilkan lokasi yang masih kosong.

**Implementasi:**
```java
String[][][] lokasiBuku = new String[2][3][4];
```

### 4.  Kelola Koleksi Buku Dinamis (ArrayList)

Menu ini menggunakan **ArrayList** untuk mengelola koleksi buku yang jumlahnya dapat berubah secara dinamis.

**Fitur:**
- Menampilkan seluruh koleksi buku.
- Menambahkan buku baru.
- Mengubah judul buku.
- Menghapus buku dari daftar koleksi.
- Menghitung jumlah buku yang tersimpan.

**Implementasi:**
```java
ArrayList<String> daftarBuku = new ArrayList<>();
```

Method yang digunakan:

| Method | Fungsi |
|---|---|
| `.add()` | Menambahkan buku |
| `.get()` | Mengakses data buku |
| `.set()` | Mengubah data buku |
| `.remove()` | Menghapus data buku |
| `.size()` | Menghitung jumlah buku |
| `.isEmpty()` | Memeriksa apakah daftar kosong |

### 5.  Riwayat Transaksi Peminjaman (Stack - LIFO)

Menu ini menggunakan **Stack** untuk menyimpan riwayat transaksi peminjaman buku.

Stack menerapkan prinsip **Last In First Out (LIFO)**, yaitu data yang terakhir dimasukkan akan menjadi data pertama yang dikeluarkan.

**Fitur:**
- Melihat transaksi peminjaman terakhir.
- Menampilkan seluruh riwayat transaksi.
- Menghapus transaksi terakhir dari Stack.

**Implementasi:**
```java
Stack<String> riwayatTransaksi = new Stack<>();
```

Method yang digunakan:
- `.push()` untuk menambahkan transaksi.
- `.peek()` untuk melihat transaksi terakhir.
- `.pop()` untuk mengeluarkan transaksi terakhir.

### 6.  Antrean Peminjaman Mahasiswa (Queue - FIFO)

Menu ini menggunakan **Queue** untuk mengelola antrean mahasiswa yang ingin meminjam buku.

Queue menerapkan prinsip **First In First Out (FIFO)**, yaitu mahasiswa yang pertama masuk antrean akan dilayani terlebih dahulu.

**Fitur:**
- Menambahkan mahasiswa ke antrean.
- Menampilkan daftar mahasiswa dalam antrean.
- Melihat mahasiswa pada antrean terdepan.
- Memproses peminjaman mahasiswa.
- Memperbarui data jumlah peminjaman.
- Menambahkan transaksi ke dalam Stack.

**Implementasi:**
```java
Queue<String> antreanMahasiswa = new LinkedList<>();
```

Method yang digunakan:
- `.add()` untuk menambahkan antrean.
- `.peek()` untuk melihat antrean terdepan.
- `.poll()` untuk mengambil dan menghapus antrean terdepan.

---

##  Struktur File Proyek

Struktur proyek menggunakan format standar Maven pada Apache NetBeans.

```text
PerpustakaanKampus-Java-Kelompok-8/
│
├── README.md
│
├── pom.xml
│
├── .gitignore
│
└── src/
    └── main/
        └── java/
            └── com/
                └── mycompany/
                    └── sistemperpustakaankampus/
                        └── SistemPerpustakaanKampus.java
```

**Keterangan:**

| File / Folder | Fungsi |
|---|---|
| `README.md` | Dokumentasi dan penjelasan proyek |
| `pom.xml` | Konfigurasi proyek Maven |
| `.gitignore` | Mengabaikan file yang tidak perlu diunggah |
| `src/main/java/` | Direktori source code Java |
| `SistemPerpustakaanKampus.java` | File utama aplikasi perpustakaan |

---

##  Tampilan Program

### 1. Tampilan Menu Utama

Program menampilkan enam pilihan menu utama yang dapat diakses oleh pengguna.

```text
=======================================================
       SISTEM MANAJEMEN PERPUSTAKAAN KAMPUS
=======================================================
1. Kelola Kategori Buku (Array 1 Dimensi)
2. Data Jumlah Peminjaman Mingguan (Array 2 Dimensi)
3. Lokasi Penyimpanan Buku (Array 3 Dimensi)
4. Kelola Koleksi Buku Dinamis (ArrayList)
5. Riwayat Transaksi Peminjaman (Stack - LIFO)
6. Antrean Peminjaman Mahasiswa (Queue - FIFO)
0. Keluar Program
=======================================================
Pilih menu (0-6):
```

**[MASUKKAN GAMBAR 1: Screenshot tampilan menu utama program saat dijalankan di NetBeans.]**

### 2. Tampilan Array 1 Dimensi

Menampilkan daftar kategori buku beserta indeks masing-masing kategori.

**[MASUKKAN GAMBAR 2: Screenshot hasil menjalankan Menu 1, Sub-menu 1, yaitu daftar kategori buku.]**

### 3. Tampilan Array 2 Dimensi

Menampilkan tabel jumlah peminjaman mingguan berdasarkan kategori buku dan hari.

**[MASUKKAN GAMBAR 3: Screenshot hasil menjalankan Menu 2, Sub-menu 1, yaitu tabel peminjaman mingguan.]**

### 4. Tampilan Array 3 Dimensi

Menampilkan lokasi penyimpanan buku berdasarkan lantai, rak, dan posisi.

**[MASUKKAN GAMBAR 4: Screenshot hasil menjalankan Menu 3, Sub-menu 1, yaitu lokasi penyimpanan buku.]**

### 5. Tampilan ArrayList

Menampilkan koleksi buku yang tersimpan dalam ArrayList.

**[MASUKKAN GAMBAR 5: Screenshot hasil menjalankan Menu 4, Sub-menu 1, yaitu daftar koleksi buku.]**

### 6. Tampilan Stack (LIFO)

Menampilkan riwayat transaksi peminjaman dari yang terbaru hingga terlama.

**[MASUKKAN GAMBAR 6: Screenshot hasil menjalankan Menu 5, Sub-menu 2, yaitu riwayat transaksi.]**

### 7. Tampilan Queue (FIFO)

Menampilkan antrean mahasiswa yang ingin melakukan peminjaman buku.

**[MASUKKAN GAMBAR 7: Screenshot hasil menjalankan Menu 6, Sub-menu 2, yaitu daftar antrean mahasiswa.]**

---

##  Alur Kerja Program

Secara umum, alur kerja Sistem Manajemen Perpustakaan Kampus adalah sebagai berikut:

```text
                +----------------------+
                |     Mulai Program    |
                +----------+-----------+
                           |
                           v
                +----------------------+
                | Inisialisasi Data    |
                | Array, ArrayList,    |
                | Stack, dan Queue     |
                +----------+-----------+
                           |
                           v
                +----------------------+
                | Tampilkan Menu Utama |
                +----------+-----------+
                           |
                           v
                +----------------------+
                | Pilih Menu (0 - 6)   |
                +----------+-----------+
                           |
              +------------+------------+
              |                         |
              v                         v
      +---------------+         +---------------+
      | Menu 1 - 6    |         |    Menu 0     |
      | Proses Data   |         | Keluar Program|
      +-------+-------+         +-------+-------+
              |                         |
              v                         v
      +---------------+         +---------------+
      | Tampilkan     |         |    Selesai    |
      | Hasil Proses  |         +---------------+
      +-------+-------+
              |
              v
      +---------------+
      | Kembali ke    |
      | Menu Utama    |
      +---------------+
```
