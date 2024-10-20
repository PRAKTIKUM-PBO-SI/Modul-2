/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguidedke2modul2mv;

/**
 *
 * @author MARSYA VALERIA
 * 2311103105
 * 7C
 */
public class PesananUnguided2 {
    MenuUnguided2[] daftarPesanan;
    int jumlahPesanan;
    double totalHarga;

    public PesananUnguided2(int kapasitas) {
        daftarPesanan = new MenuUnguided2[kapasitas];
        jumlahPesanan = 0;
        totalHarga = 0;
    }

    // Tambah pesanan dan hitung total harga
    public void tambahPesananUnguided2(MenuUnguided2 item) {
        if (jumlahPesanan < daftarPesanan.length) {
            daftarPesanan[jumlahPesanan] = item;
            totalHarga += item.harga;
            jumlahPesanan++;
        } else {
            System.out.println("Pesanan penuh! Tidak bisa menambah pesanan lagi.");
        }
    }

    // Tampilkan daftar pesanan
    public void tampilkanPesananUnguided2() {
        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            daftarPesanan[i].tampilkanInfo();
        }
        System.out.println("Total Harga: Rp " + totalHarga);
    }

    // Hitung diskon 10% jika total harga lebih dari Rp 200.000
    public double hitungDiskon() {
        if (totalHarga > 200000) {
            return totalHarga * 0.10;
        } else {
            return 0;
        }
    }

    // Hitung pajak 10% dari total setelah diskon
    public double hitungPajak(double totalSetelahDiskon) {
        return totalSetelahDiskon * 0.10;
    }
}

