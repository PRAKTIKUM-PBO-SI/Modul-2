/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp4daffazachari;

/**
 *
 * @author Daffa Zachari 
 * 2311103118
 * S1SI-07-C
 */

class Pesanan {
    Menu[] daftarPesanan;
    int jumlahPesanan;
    double totalHarga;

    public Pesanan(int kapasitas) {
        daftarPesanan = new Menu[kapasitas];
        jumlahPesanan = 0;
        totalHarga = 0;
    }

    // Method untuk menambahkan pesanan
    public void tambahPesanan(Menu item) {
        daftarPesanan[jumlahPesanan] = item;
        totalHarga += item.harga;
        jumlahPesanan++;
    }

    // Method untuk menampilkan semua pesanan
    public void tampilkanPesanan() {
        System.out.println("Daftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            daftarPesanan[i].tampilkanInfo();
        }
        System.out.println("Total Harga: Rp " + totalHarga);
    }

    // Method untuk menghitung diskon jika total melebihi 200.000
    public double hitungDiskon() {
        if (totalHarga > 200000) {
            return totalHarga * 0.10; // Diskon 10%
        } else {
            return 0;
        }
    }

    // Method baru untuk menghitung pajak
    public double hitungPajak(double totalSetelahDiskon) {
        return totalSetelahDiskon * 0.10; // Pajak 10%
    }
}
