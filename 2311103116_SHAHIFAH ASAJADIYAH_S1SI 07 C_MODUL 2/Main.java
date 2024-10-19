/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanP4Shahifah;
import java.util.Scanner;

/**
 *
 * @author Shahifah Sajadiyah
 * 2311103116
 * SI 07 C
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pesanan pesanan = new Pesanan(10); // Maksimal 10 pesanan
        char tambahPesanan;

        // Perulangan untuk menambah pesanan
        do {
            System.out.print("Masukkan nama item: ");
            String namaItem = scanner.nextLine();
            System.out.print("Masukkan harga item: ");
            double hargaItem = scanner.nextDouble();
            
            // Validasi input kategori
            int kategoriItem;
            do {
                System.out.print("Masukkan kategori (1: Pembuka, 2: Utama, 3: Minuman): ");
                kategoriItem = scanner.nextInt();
                if (kategoriItem < 1 || kategoriItem > 3) {
                    System.out.println("Kategori tidak valid. Silakan masukkan angka 1, 2, atau 3.");
                }
            } while (kategoriItem < 1 || kategoriItem > 3);

            scanner.nextLine();
            Menu item = new Menu(namaItem, hargaItem, kategoriItem);
            pesanan.tambahPesanan(item);

            System.out.print("Apakah ingin menambah pesanan lagi? (y/n): ");
            tambahPesanan = scanner.next().charAt(0);
            scanner.nextLine(); 
        } while (tambahPesanan == 'y' || tambahPesanan == 'Y');

        // Tampilkan pesanan dan hitung diskon
        pesanan.tampilkanPesanan();
        double diskon = pesanan.hitungDiskon();
        if (diskon > 0) {
            System.out.println("Anda mendapatkan diskon 10% sebesar Rp " + diskon);
        }

        // Hitung pajak 10% setelah diskon
        double totalSetelahDiskon = pesanan.totalHarga - diskon;
        double pajak = totalSetelahDiskon * 0.10;
        System.out.println("Pajak 10%: Rp " + pajak);

        // Hitung total yang harus dibayar setelah pajak
        double totalBayar = totalSetelahDiskon + pajak;
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
    }
}
