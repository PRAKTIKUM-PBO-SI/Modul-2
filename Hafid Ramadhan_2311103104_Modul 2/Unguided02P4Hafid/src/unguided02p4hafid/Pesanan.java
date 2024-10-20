/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided02p4hafid;

/**
 *
 * @author Hafid Ramadhan
 * 2311103104
 * SI07C
 */
public class Pesanan {
    Menu[] daftarPesanan;
    int jumlahPesanan;
    double totalHarga;

    public Pesanan(int kapasitas) {
        daftarPesanan = new Menu[kapasitas];
        jumlahPesanan = 0;
        totalHarga = 0;
    }

    public void tambahPesanan(Menu item) {
        daftarPesanan[jumlahPesanan] = item;
        totalHarga += item.harga;
        jumlahPesanan++;
    }

    public void tampilkanPesanan() {
        System.out.println("Daftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            daftarPesanan[i].tampilkanInfo();
        }
        System.out.println("Total Harga: Rp." + totalHarga);
    }

    public double hitungDiskon() {
        if (totalHarga > 200000) {
            return totalHarga * 0.10;
        } else {
            return 0;
        }
    }

    public double hitungPajak(double hargaPajak) {
        return hargaPajak * 0.10;
    }
}
