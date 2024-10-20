/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanP4NajwaD;

import java.util.Scanner;

/**
 *
 * @author Najwa Darmawan
 * 2311103108
 * S1SI07C
 * 
 */
public class LatihanP4Nada {
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
            
            int kategoriItem;
            do {
                System.out.print("Masukkan kategori (1: Pembuka, 2: Utama, 3: Minuman): ");
                kategoriItem = scanner.nextInt();
                scanner.nextLine(); // Bersihkan buffer
                
                if (kategoriItem < 1 || kategoriItem > 3) {
                    System.out.println("Kategori tidak valid. Silakan masukkan 1, 2, atau 3.");
                }
            } while (kategoriItem < 1 || kategoriItem > 3);
            
            Menu item = new Menu(namaItem, hargaItem, kategoriItem);
            pesanan.tambahPesanan(item);
            
            System.out.print("Apakah ingin menambah pesanan lagi? (y/n): ");
            tambahPesanan = scanner.next().charAt(0);
            scanner.nextLine(); // Bersihkan buffer
        } while (tambahPesanan == 'y' || tambahPesanan == 'Y');

        // Tampilkan pesanan dan hitung diskon
        pesanan.tampilkanPesanan();
        double diskon = pesanan.hitungDiskon();
        double totalSetelahDiskon = pesanan.totalHarga - diskon;
        
        if (diskon > 0) {
            System.out.println("Anda mendapatkan diskon 10% sebesar Rp " + diskon);
            System.out.println("Total setelah diskon: Rp " + totalSetelahDiskon);
        }
        
        // Hitung pajak 10%
        double pajak = totalSetelahDiskon * 0.1;
        double totalAkhir = totalSetelahDiskon + pajak;
        
        System.out.println("Pajak 10%: Rp " + pajak);
        System.out.println("Total yang harus dibayar (termasuk pajak): Rp " + totalAkhir);
    }
}