/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemperpustakaankampus;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

/**
 *
 * @author ACER
 */
public class SistemPerpustakaanKampus {

public static void main(String[] args) {
        // Deklarasi Scanner untuk menerima input dari pengguna (Sesuai Modul Pertemuan 1)
        Scanner scanner = new Scanner(System.in);

        // =====================================================================
        // 1. ARRAY 1 DIMENSI (1D): Menyimpan daftar kategori buku & nama hari
        // =====================================================================
        String[] kategoriBuku = new String[4];
        kategoriBuku[0] = "Pemrograman";
        kategoriBuku[1] = "Matematika";
        kategoriBuku[2] = "Jaringan Komputer";
        kategoriBuku[3] = "Basis Data";

        String[] daftarHari = {
            "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"
        };

        // =====================================================================
        // 2. ARRAY 2 DIMENSI (2D): Menyimpan jumlah peminjaman [4 Kategori][7 Hari]
        // =====================================================================
        int[][] dataPeminjaman = new int[4][7];
        // Data awal jumlah peminjaman buku
        dataPeminjaman[0][0] = 3; // Kategori Pemrograman, Hari Senin
        dataPeminjaman[1][1] = 2; // Kategori Matematika, Hari Selasa
        dataPeminjaman[2][2] = 1; // Kategori Jaringan Komputer, Hari Rabu
        dataPeminjaman[3][4] = 4; // Kategori Basis Data, Hari Jumat

        // =====================================================================
        // 3. ARRAY 3 DIMENSI (3D): Lokasi penyimpanan [2 Lantai][3 Rak][4 Posisi]
        // =====================================================================
        String[][][] lokasiBuku = new String[2][3][4];
        // Data awal lokasi penyimpanan buku
        lokasiBuku[0][0][0] = "Pemrograman Dasar Java";
        lokasiBuku[0][1][0] = "Kalkulus dan Aljabar";
        lokasiBuku[1][0][1] = "Jaringan Komputer Dasar";
        lokasiBuku[1][2][0] = "Pengantar Basis Data";

        // =====================================================================
        // 4. ARRAYLIST: Mengelola daftar buku secara dinamis
        // =====================================================================
        ArrayList<String> daftarBuku = new ArrayList<>();
        daftarBuku.add("Pemrograman Dasar Java");
        daftarBuku.add("Kalkulus dan Aljabar");
        daftarBuku.add("Jaringan Komputer Dasar");
        daftarBuku.add("Pengantar Basis Data");

        // =====================================================================
        // 5. STACK (LIFO): Menyimpan riwayat transaksi peminjaman buku
        // =====================================================================
        Stack<String> riwayatTransaksi = new Stack<>();
        riwayatTransaksi.push("Andi meminjam buku 'Pemrograman Dasar Java' (Kategori: Pemrograman, Hari: Senin)");

        // =====================================================================
        // 6. QUEUE (FIFO): Mengelola antrean mahasiswa yang ingin meminjam buku
        // =====================================================================
        Queue<String> antreanMahasiswa = new LinkedList<>();
        antreanMahasiswa.add("Budi Santoso");
        antreanMahasiswa.add("Siti Aminah");

        int pilihanMenu = 0;

        // Perulangan do-while untuk menampilkan menu interaktif
        do {
            System.out.println("\n=======================================================");
            System.out.println("       SISTEM MANAJEMEN PERPUSTAKAAN KAMPUS");
            System.out.println("=======================================================");
            System.out.println("1. Kelola Kategori Buku (Array 1 Dimensi)");
            System.out.println("2. Data Jumlah Peminjaman Mingguan (Array 2 Dimensi)");
            System.out.println("3. Lokasi Penyimpanan Buku (Array 3 Dimensi)");
            System.out.println("4. Kelola Koleksi Buku Dinamis (ArrayList)");
            System.out.println("5. Riwayat Transaksi Peminjaman (Stack - LIFO)");
            System.out.println("6. Antrean Peminjaman Mahasiswa (Queue - FIFO)");
            System.out.println("0. Keluar Program");
            System.out.println("=======================================================");
            System.out.print("Pilih menu (0-6): ");
            pilihanMenu = scanner.nextInt();
            scanner.nextLine(); // Membersihkan sisa baris (newline)

            switch (pilihanMenu) {

                // =============================================================
                // MENU 1: ARRAY 1 DIMENSI (KATEGORI BUKU)
                // =============================================================
                case 1:
                    System.out.println("\n--- [1. ARRAY 1 DIMENSI: KATEGORI BUKU] ---");
                    System.out.println("1. Tampilkan Daftar Kategori Buku");
                    System.out.println("2. Ubah Nama Kategori Berdasarkan Indeks");
                    System.out.print("Pilih sub-menu (1-2): ");
                    int subMenu1 = scanner.nextInt();
                    scanner.nextLine();

                    if (subMenu1 == 1) {
                        System.out.println("\nKapasitas Array Kategori: " + kategoriBuku.length);
                        for (int i = 0; i < kategoriBuku.length; i++) {
                            System.out.println("Kategori ke-" + (i + 1) + " (Indeks " + i + "): " + kategoriBuku[i]);
                        }
                    } else if (subMenu1 == 2) {
                        System.out.print("Masukkan nomor kategori yang ingin diubah (1-" + kategoriBuku.length + "): ");
                        int nomorKat = scanner.nextInt();
                        scanner.nextLine();

                        int indeksKat = nomorKat - 1;
                        if (indeksKat >= 0 && indeksKat < kategoriBuku.length) {
                            System.out.print("Masukkan nama kategori baru: ");
                            String namaBaru = scanner.nextLine();
                            kategoriBuku[indeksKat] = namaBaru;
                            System.out.println("Berhasil mengubah kategori ke-" + nomorKat + " menjadi: " + kategoriBuku[indeksKat]);
                        } else {
                            System.out.println("Nomor kategori tidak valid!");
                        }
                    } else {
                        System.out.println("Pilihan sub-menu tidak valid!");
                    }
                    break;

                // =============================================================
                // MENU 2: ARRAY 2 DIMENSI (JUMLAH PEMINJAMAN KATEGORI x HARI)
                // =============================================================
                case 2:
                    System.out.println("\n--- [2. ARRAY 2 DIMENSI: DATA PEMINJAMAN MINGGUAN] ---");
                    System.out.println("1. Tampilkan Tabel Jumlah Peminjaman");
                    System.out.println("2. Input / Tambah Jumlah Peminjaman");
                    System.out.print("Pilih sub-menu (1-2): ");
                    int subMenu2 = scanner.nextInt();
                    scanner.nextLine();

                    if (subMenu2 == 1) {
                        System.out.println("\nData Jumlah Peminjaman Buku (Kategori x Hari):");
                        System.out.print("Kategori \\ Hari\t\t");
                        for (int h = 0; h < daftarHari.length; h++) {
                            System.out.print(daftarHari[h] + "\t");
                        }
                        System.out.println("Total");
                        System.out.println("--------------------------------------------------------------------------------");

                        for (int i = 0; i < dataPeminjaman.length; i++) {
                            System.out.print(kategoriBuku[i] + "\t\t");
                            if (kategoriBuku[i].length() < 12) {
                                System.out.print("\t");
                            }
                            int totalPerKategori = 0;
                            for (int j = 0; j < dataPeminjaman[i].length; j++) {
                                System.out.print(dataPeminjaman[i][j] + "\t");
                                totalPerKategori = totalPerKategori + dataPeminjaman[i][j];
                            }
                            System.out.println(totalPerKategori);
                        }
                    } else if (subMenu2 == 2) {
                        System.out.println("\nDaftar Kategori:");
                        for (int i = 0; i < kategoriBuku.length; i++) {
                            System.out.println((i + 1) + ". " + kategoriBuku[i]);
                        }
                        System.out.print("Pilih nomor kategori (1-4): ");
                        int pilihKat = scanner.nextInt() - 1;

                        System.out.println("\nDaftar Hari:");
                        for (int j = 0; j < daftarHari.length; j++) {
                            System.out.println((j + 1) + ". " + daftarHari[j]);
                        }
                        System.out.print("Pilih nomor hari (1-7): ");
                        int pilihHari = scanner.nextInt() - 1;

                        System.out.print("Masukkan jumlah peminjaman yang ditambahkan: ");
                        int jumlahTambah = scanner.nextInt();
                        scanner.nextLine();

                        if (pilihKat >= 0 && pilihKat < 4 && pilihHari >= 0 && pilihHari < 7 && jumlahTambah > 0) {
                            dataPeminjaman[pilihKat][pilihHari] = dataPeminjaman[pilihKat][pilihHari] + jumlahTambah;
                            System.out.println("Data peminjaman kategori " + kategoriBuku[pilihKat]
                                    + " pada hari " + daftarHari[pilihHari] + " berhasil diperbarui!");
                        } else {
                            System.out.println("Input kategori, hari, atau jumlah tidak valid!");
                        }
                    } else {
                        System.out.println("Pilihan sub-menu tidak valid!");
                    }
                    break;

                // =============================================================
                // MENU 3: ARRAY 3 DIMENSI (LOKASI PENYIMPANAN BUKU)
                // =============================================================
                case 3:
                    System.out.println("\n--- [3. ARRAY 3 DIMENSI: LOKASI PENYIMPANAN BUKU] ---");
                    System.out.println("1. Tampilkan Seluruh Lokasi Penyimpanan (Lantai, Rak, Posisi)");
                    System.out.println("2. Simpan Buku ke Lokasi Rak Tertentu");
                    System.out.println("3. Cari Lokasi Penyimpanan Berdasarkan Judul Buku");
                    System.out.print("Pilih sub-menu (1-3): ");
                    int subMenu3 = scanner.nextInt();
                    scanner.nextLine();

                    if (subMenu3 == 1) {
                        for (int lantai = 0; lantai < lokasiBuku.length; lantai++) {
                            System.out.println("\n=== LANTAI " + (lantai + 1) + " ===");
                            for (int rak = 0; rak < lokasiBuku[lantai].length; rak++) {
                                System.out.println("  Nomor Rak " + (rak + 1) + ":");
                                for (int posisi = 0; posisi < lokasiBuku[lantai][rak].length; posisi++) {
                                    if (lokasiBuku[lantai][rak][posisi] == null) {
                                        System.out.println("    Posisi " + (posisi + 1) + ": [Kosong]");
                                    } else {
                                        System.out.println("    Posisi " + (posisi + 1) + ": " + lokasiBuku[lantai][rak][posisi]);
                                    }
                                }
                            }
                        }
                    } else if (subMenu3 == 2) {
                        System.out.print("Masukkan Lantai (1-2): ");
                        int l = scanner.nextInt() - 1;
                        System.out.print("Masukkan Nomor Rak (1-3): ");
                        int r = scanner.nextInt() - 1;
                        System.out.print("Masukkan Posisi Buku (1-4): ");
                        int p = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (l >= 0 && l < 2 && r >= 0 && r < 3 && p >= 0 && p < 4) {
                            System.out.print("Masukkan Judul Buku yang akan ditempatkan: ");
                            String judulSimpan = scanner.nextLine();
                            lokasiBuku[l][r][p] = judulSimpan;

                            // Jika buku belum ada di ArrayList, tambahkan juga agar terintegrasi
                            boolean sudahAda = false;
                            for (int i = 0; i < daftarBuku.size(); i++) {
                                if (daftarBuku.get(i).equalsIgnoreCase(judulSimpan)) {
                                    sudahAda = true;
                                }
                            }
                            if (!sudahAda) {
                                daftarBuku.add(judulSimpan);
                            }

                            System.out.println("Buku '" + judulSimpan + "' berhasil disimpan di Lantai "
                                    + (l + 1) + ", Rak " + (r + 1) + ", Posisi " + (p + 1) + "!");
                        } else {
                            System.out.println("Lokasi lantai, rak, atau posisi tidak valid!");
                        }
                    } else if (subMenu3 == 3) {
                        System.out.print("Masukkan judul buku yang dicari lokasinya: ");
                        String judulCari = scanner.nextLine();
                        boolean ditemukan = false;

                        for (int l = 0; l < lokasiBuku.length; l++) {
                            for (int r = 0; r < lokasiBuku[l].length; r++) {
                                for (int p = 0; p < lokasiBuku[l][r].length; p++) {
                                    if (lokasiBuku[l][r][p] != null && lokasiBuku[l][r][p].equalsIgnoreCase(judulCari)) {
                                        System.out.println("Buku '" + lokasiBuku[l][r][p] + "' berada di: Lantai "
                                                + (l + 1) + ", Rak " + (r + 1) + ", Posisi " + (p + 1));
                                        ditemukan = true;
                                    }
                                }
                            }
                        }
                        if (!ditemukan) {
                            System.out.println("Buku tidak ditemukan di rak penyimpanan.");
                        }
                    } else {
                        System.out.println("Pilihan sub-menu tidak valid!");
                    }
                    break;

                // =============================================================
                // MENU 4: ARRAYLIST (DAFTAR BUKU DINAMIS)
                // =============================================================
                case 4:
                    System.out.println("\n--- [4. ARRAYLIST: KELOLA DAFTAR BUKU DINAMIS] ---");
                    System.out.println("1. Tampilkan Daftar Buku (.size() & .get())");
                    System.out.println("2. Tambah Buku Baru (.add())");
                    System.out.println("3. Ubah Judul Buku (.set())");
                    System.out.println("4. Hapus Buku (.remove())");
                    System.out.print("Pilih sub-menu (1-4): ");
                    int subMenu4 = scanner.nextInt();
                    scanner.nextLine();

                    if (subMenu4 == 1) {
                        System.out.println("\nJumlah Koleksi Buku Saat Ini: " + daftarBuku.size());
                        if (daftarBuku.isEmpty()) {
                            System.out.println("Daftar buku masih kosong.");
                        } else {
                            for (int i = 0; i < daftarBuku.size(); i++) {
                                System.out.println("Buku ke-" + (i + 1) + ": " + daftarBuku.get(i));
                            }
                        }
                    } else if (subMenu4 == 2) {
                        System.out.print("Masukkan judul buku baru: ");
                        String bukuBaru = scanner.nextLine();
                        daftarBuku.add(bukuBaru);
                        System.out.println("Buku '" + bukuBaru + "' berhasil ditambahkan ke ArrayList!");
                    } else if (subMenu4 == 3) {
                        for (int i = 0; i < daftarBuku.size(); i++) {
                            System.out.println("Buku ke-" + (i + 1) + ": " + daftarBuku.get(i));
                        }
                        System.out.print("Pilih nomor buku yang ingin diubah (1-" + daftarBuku.size() + "): ");
                        int noUbah = scanner.nextInt();
                        scanner.nextLine();

                        int idxUbah = noUbah - 1;
                        if (idxUbah >= 0 && idxUbah < daftarBuku.size()) {
                            System.out.print("Masukkan judul buku pengganti: ");
                            String judulPengganti = scanner.nextLine();
                            daftarBuku.set(idxUbah, judulPengganti);
                            System.out.println("Judul buku berhasil diubah!");
                        } else {
                            System.out.println("Nomor buku tidak valid!");
                        }
                    } else if (subMenu4 == 4) {
                        for (int i = 0; i < daftarBuku.size(); i++) {
                            System.out.println("Buku ke-" + (i + 1) + ": " + daftarBuku.get(i));
                        }
                        System.out.print("Pilih nomor buku yang ingin dihapus (1-" + daftarBuku.size() + "): ");
                        int noHapus = scanner.nextInt();
                        scanner.nextLine();

                        int idxHapus = noHapus - 1;
                        if (idxHapus >= 0 && idxHapus < daftarBuku.size()) {
                            String bukuDihapus = daftarBuku.get(idxHapus);
                            daftarBuku.remove(idxHapus);

                            // Hapus juga dari lokasi rak Array 3D jika ada
                            for (int l = 0; l < lokasiBuku.length; l++) {
                                for (int r = 0; r < lokasiBuku[l].length; r++) {
                                    for (int p = 0; p < lokasiBuku[l][r].length; p++) {
                                        if (lokasiBuku[l][r][p] != null && lokasiBuku[l][r][p].equalsIgnoreCase(bukuDihapus)) {
                                            lokasiBuku[l][r][p] = null;
                                        }
                                    }
                                }
                            }
                            System.out.println("Buku '" + bukuDihapus + "' berhasil dihapus dari ArrayList!");
                        } else {
                            System.out.println("Nomor buku tidak valid!");
                        }
                    } else {
                        System.out.println("Pilihan sub-menu tidak valid!");
                    }
                    break;

                // =============================================================
                // MENU 5: STACK - LIFO (RIWAYAT TRANSAKSI)
                // =============================================================
                case 5:
                    System.out.println("\n--- [5. STACK (LIFO): RIWAYAT TRANSAKSI] ---");
                    System.out.println("1. Lihat Transaksi Terakhir (.peek())");
                    System.out.println("2. Tampilkan Semua Riwayat Transaksi");
                    System.out.println("3. Batalkan Transaksi Terakhir (.pop())");
                    System.out.print("Pilih sub-menu (1-3): ");
                    int subMenu5 = scanner.nextInt();
                    scanner.nextLine();

                    if (subMenu5 == 1) {
                        if (riwayatTransaksi.isEmpty()) {
                            System.out.println("Riwayat transaksi masih kosong.");
                        } else {
                            System.out.println("Transaksi Terakhir (Paling Atas / Peek): ");
                            System.out.println("-> " + riwayatTransaksi.peek());
                        }
                    } else if (subMenu5 == 2) {
                        if (riwayatTransaksi.isEmpty()) {
                            System.out.println("Riwayat transaksi masih kosong.");
                        } else {
                            System.out.println("\nDaftar Riwayat Transaksi (Urutan LIFO - Terbaru ke Terlama):");
                            for (int i = riwayatTransaksi.size() - 1; i >= 0; i--) {
                                System.out.println((riwayatTransaksi.size() - i) + ". " + riwayatTransaksi.get(i));
                            }
                        }
                    } else if (subMenu5 == 3) {
                        if (riwayatTransaksi.isEmpty()) {
                            System.out.println("Tidak ada transaksi yang dapat dibatalkan (Stack kosong).");
                        } else {
                            String transaksiBatal = riwayatTransaksi.pop();
                            System.out.println("Transaksi berikut berhasil dibatalkan (Pop Stack):");
                            System.out.println("-> " + transaksiBatal);
                        }
                    } else {
                        System.out.println("Pilihan sub-menu tidak valid!");
                    }
                    break;

                // =============================================================
                // MENU 6: QUEUE - FIFO (ANTREAN MAHASISWA PEMINJAM BUKU)
                // =============================================================
                case 6:
                    System.out.println("\n--- [6. QUEUE (FIFO): ANTREAN MAHASISWA] ---");
                    System.out.println("1. Tambah Mahasiswa ke Antrean (.add())");
                    System.out.println("2. Tampilkan Daftar Antrean Mahasiswa");
                    System.out.println("3. Proses / Layani Antrean Terdepan (.poll())");
                    System.out.print("Pilih sub-menu (1-3): ");
                    int subMenu6 = scanner.nextInt();
                    scanner.nextLine();

                    if (subMenu6 == 1) {
                        System.out.print("Masukkan Nama Mahasiswa: ");
                        String namaMhs = scanner.nextLine();
                        antreanMahasiswa.add(namaMhs);
                        System.out.println("Mahasiswa '" + namaMhs + "' berhasil masuk ke dalam antrean!");
                    } else if (subMenu6 == 2) {
                        if (antreanMahasiswa.isEmpty()) {
                            System.out.println("Antrean mahasiswa saat ini kosong.");
                        } else {
                            System.out.println("Mahasiswa Terdepan Saat Ini (.peek()): " + antreanMahasiswa.peek());
                            System.out.println("\nDaftar Seluruh Antrean (Urutan FIFO):");
                            int nomorUrut = 1;
                            for (String mhs : antreanMahasiswa) {
                                System.out.println(nomorUrut + ". " + mhs);
                                nomorUrut++;
                            }
                        }
                    } else if (subMenu6 == 3) {
                        if (antreanMahasiswa.isEmpty()) {
                            System.out.println("Antrean kosong! Tidak ada mahasiswa yang dilayani.");
                        } else if (daftarBuku.isEmpty()) {
                            System.out.println("Koleksi buku di ArrayList kosong! Tidak dapat meminjam.");
                        } else {
                            // Mengambil mahasiswa paling depan dari antrean (FIFO - poll)
                            String mhsDilayani = antreanMahasiswa.poll();
                            System.out.println("\nMelayani mahasiswa terdepan: " + mhsDilayani);

                            // Menampilkan daftar buku dari ArrayList
                            System.out.println("Pilih buku yang ingin dipinjam:");
                            for (int i = 0; i < daftarBuku.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarBuku.get(i));
                            }
                            System.out.print("Nomor buku (1-" + daftarBuku.size() + "): ");
                            int idxBukuPinjam = scanner.nextInt() - 1;

                            // Menampilkan kategori buku dari Array 1D
                            System.out.println("Pilih kategori buku:");
                            for (int i = 0; i < kategoriBuku.length; i++) {
                                System.out.println((i + 1) + ". " + kategoriBuku[i]);
                            }
                            System.out.print("Nomor kategori (1-" + kategoriBuku.length + "): ");
                            int idxKatPinjam = scanner.nextInt() - 1;

                            // Menampilkan hari peminjaman
                            System.out.println("Pilih hari peminjaman:");
                            for (int j = 0; j < daftarHari.length; j++) {
                                System.out.println((j + 1) + ". " + daftarHari[j]);
                            }
                            System.out.print("Nomor hari (1-7): ");
                            int idxHariPinjam = scanner.nextInt() - 1;
                            scanner.nextLine();

                            if (idxBukuPinjam >= 0 && idxBukuPinjam < daftarBuku.size()
                                    && idxKatPinjam >= 0 && idxKatPinjam < kategoriBuku.length
                                    && idxHariPinjam >= 0 && idxHariPinjam < daftarHari.length) {

                                String judulDipinjam = daftarBuku.get(idxBukuPinjam);

                                // Update Array 2D: tambah jumlah peminjaman pada kategori & hari terkait
                                dataPeminjaman[idxKatPinjam][idxHariPinjam]++;

                                // Simpan riwayat peminjaman ke Stack (LIFO - push)
                                String detailTransaksi = mhsDilayani + " meminjam buku '" + judulDipinjam
                                        + "' (Kategori: " + kategoriBuku[idxKatPinjam]
                                        + ", Hari: " + daftarHari[idxHariPinjam] + ")";
                                riwayatTransaksi.push(detailTransaksi);

                                System.out.println("\nPeminjaman Berhasil Diproses!");
                                System.out.println("-> Detail: " + detailTransaksi);
                                System.out.println("-> Data peminjaman (Array 2D) dan Riwayat Transaksi (Stack) telah diperbarui.");
                            } else {
                                System.out.println("Pilihan buku, kategori, atau hari tidak valid!");
                            }
                        }
                    } else {
                        System.out.println("Pilihan sub-menu tidak valid!");
                    }
                    break;

                case 0:
                    System.out.println("\nTerima kasih telah menggunakan Sistem Manajemen Perpustakaan Kampus!");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid! Silakan masukkan angka 0-6.");
                    break;
            }

        } while (pilihanMenu != 0);

        scanner.close();
    }
}