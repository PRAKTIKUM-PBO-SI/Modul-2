/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguidedmodul2mv;

/**
 *
 * @author MARSYA VALERIA
 * 2311103105
 * 07C
 */
public class pesanan {
    menuUnguided[] daftarPesanan;
    int jumlahPesanan;
    double totalHarga;

    public pesanan(int kapasitas) {
        daftarPesanan = new menuUnguided[kapasitas];
        jumlahPesanan = 0;
        totalHarga = 0;
    }

    // Tambah pesanan dan hitung total harga
    public void tambahpesanan(menuUnguided item) {
        if (jumlahPesanan < daftarPesanan.length) {
            daftarPesanan[jumlahPesanan] = item;
            totalHarga += item.harga;
            jumlahPesanan++;
        } else {
            System.out.println("Pesanan penuh! Tidak bisa menambah pesanan lagi.");
        }
    }

    // Tampilkan daftar pesanan
    public void tampilkanpesanan() {
        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            daftarPesanan[i].tampilkanInfo();
        }
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}

