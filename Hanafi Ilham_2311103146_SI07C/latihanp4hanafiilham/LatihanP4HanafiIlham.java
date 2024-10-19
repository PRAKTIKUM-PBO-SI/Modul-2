/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.latihanp4hanafiilham;
/**
 *
 * @author hanaf
 */
import java.util.Scanner;
public class LatihanP4HanafiIlham {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pesanan pesanan = new Pesanan(10); // Maksimal 10 pesanan
        char tambahPesanan;
        
        // Perulangan untuk menambah pesanan
        do {
            System.out.print("Masukkan nama item: ");
            String namaItem = scanner.nextLine();
            
            System.out.print("Masukkan harga item: ");
            double hargaItem = Double.parseDouble(scanner.nextLine());
            
            int kategoriItem = 0;
            boolean kategoriValid = false;
            while (!kategoriValid) {
                System.out.print("Masukkan kategori (1: Pembuka, 2: Utama, 3: Minuman): ");
                String inputKategori = scanner.nextLine();
                try {
                    kategoriItem = Integer.parseInt(inputKategori);
                    if (kategoriItem >= 1 && kategoriItem <= 3) {
                        kategoriValid = true;
                    } else {
                        System.out.println("Kategori tidak valid. Silakan masukkan 1, 2, atau 3.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Silakan masukkan angka 1, 2, atau 3.");
                }
            }
            
            Menu item = new Menu(namaItem, hargaItem, kategoriItem);
            pesanan.tambahPesanan(item);
            
            System.out.print("Apakah ingin menambah pesanan lagi? (y/n): ");
            tambahPesanan = scanner.nextLine().charAt(0);
        } while (tambahPesanan == 'y' || tambahPesanan == 'Y');
        
        // Tampilkan pesanan dan hitung diskon
        pesanan.tampilkanPesanan();
        double diskon = pesanan.hitungDiskon();
        if (diskon > 0) {
            System.out.println("Anda mendapatkan diskon 10% sebesar Rp " + diskon);
        }
        System.out.println("Total yang harus dibayar: Rp " + (pesanan.totalHarga - diskon));
        
        // Hitung dan tampilkan pajak
        double totalSetelahDiskon = pesanan.totalHarga - diskon;
        double pajak = pesanan.hitungPajak(totalSetelahDiskon);
        System.out.println("Pajak 10%: Rp " + pajak);
        System.out.println("Total akhir yang harus dibayar: Rp " + (totalSetelahDiskon + pajak));
    }
}