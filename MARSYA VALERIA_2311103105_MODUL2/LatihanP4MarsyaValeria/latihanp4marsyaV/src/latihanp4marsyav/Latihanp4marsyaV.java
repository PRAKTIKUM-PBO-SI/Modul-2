/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp4marsyav;
import java.util.Scanner;

/**
 *
 * @author Marsya Valeria
 * 2311103105
 * 07C
 */
public class Latihanp4marsyaV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pesanan pesanan = new pesanan(10); // Maksimal 10 pesanan
        char tambahPesanan;
// Perulangan untuk menambah pesanan
        do {
            System.out.print("Masukkan nama item: ");
            String namaItem = scanner.nextLine();
            System.out.print("Masukkan harga item: ");
            double hargaItem = scanner.nextDouble();
            System.out.print("Masukkan kategori (1: Pembuka, 2: Utama, 3: Minuman): ");
            int kategoriItem = scanner.nextInt();
            scanner.nextLine(); // Bersihkan buffer
            menuNew item = new menuNew(namaItem, hargaItem, kategoriItem);
            pesanan.tambahPesanan(item);
            System.out.print("Apakah ingin menambah pesanan lagi? (y/n):");
            tambahPesanan = scanner.next().charAt(0);
            scanner.nextLine(); // Bersihkan buffer
        } while (tambahPesanan == 'y' || tambahPesanan == 'Y');
// Tampilkan pesanan dan hitung diskon
        pesanan.tampilkanPesanan();
        double diskon = pesanan.hitungDiskon();
        if (diskon > 0) {
            System.out.println("Anda mendapatkan diskon 10% sebesar Rp " + diskon);
        }
        System.out.println("Total yang harus dibayar: Rp " + (pesanan.totalHarga - diskon));
    }
}
