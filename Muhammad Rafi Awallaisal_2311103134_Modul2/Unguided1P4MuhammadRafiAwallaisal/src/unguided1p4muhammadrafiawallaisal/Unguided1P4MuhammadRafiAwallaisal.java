/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unguided1p4muhammadrafiawallaisal;
import java.util.Scanner;
/**
 *
 * @author Muhammad Rafi Awallaisal;
 * 2311103134
 * 07C
 */
public class Unguided1P4MuhammadRafiAwallaisal {

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
            scanner.nextLine(); // Bersihkan buffer
            
            int kategoriItem = 0;
            boolean validKategori = false;
            
            do {
                System.out.print("Masukkan kategori (1: Pembuka, 2: Utama, 3: Minuman): ");
                if (scanner.hasNextInt()) {
                    kategoriItem = scanner.nextInt();
                    if (kategoriItem >= 1 && kategoriItem <= 3) {
                        validKategori = true;
                    } else {
                        System.out.println("Kategori tidak valid. Harap masukkan 1, 2, atau 3.");
                    }
                } else {
                    System.out.println("Input tidak valid. Harap masukkan angka.");
                    scanner.next(); // Bersihkan input yang tidak valid
                }
                scanner.nextLine(); // Bersihkan buffer
            } while (!validKategori);
            
            Menu item = new Menu(namaItem, hargaItem, kategoriItem);
            pesanan.tambahPesanan(item);
            
            System.out.print("Apakah ingin menambah pesanan lagi? (y/n): ");
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