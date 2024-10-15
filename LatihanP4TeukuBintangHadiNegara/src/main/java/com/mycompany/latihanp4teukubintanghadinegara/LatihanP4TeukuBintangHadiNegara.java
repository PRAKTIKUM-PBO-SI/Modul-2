/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanp4teukubintanghadinegara;

import java.util.Scanner;

/**
 *
 * @author TeukuBintangHadiNegara
 */
public class LatihanP4TeukuBintangHadiNegara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pesanan pesanan = new Pesanan(10); 
        char tambahPesanan;

        do {
            System.out.print("Masukkan nama item: ");
            String namaItem = scanner.nextLine();
            System.out.print("Masukkan harga item: ");
            double hargaItem = scanner.nextDouble();
            int kategoriItem;

            while (true) {
                System.out.print("Masukkan kategori (1: Pembuka, 2: Utama, 3: Minuman): ");
                kategoriItem = scanner.nextInt();
                if (kategoriItem == 1 || kategoriItem == 2 || kategoriItem == 3) {
                    break; // Kategori valid, keluar dari loop
                } else {
                    System.out.println("Input tidak valid. Silakan masukkan 1, 2, atau 3.");
                }
            }
            scanner.nextLine(); // Bersihkan buffer
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

        // Hitung pajak
        double pajak = totalSetelahDiskon * 0.10;

        if (diskon > 0) {
            System.out.println("Anda mendapatkan diskon 10% sebesar Rp " + diskon);
        }
        System.out.println("Pajak 10% sebesar: Rp " + pajak);
        System.out.println("Total yang harus dibayar: Rp " + (totalSetelahDiskon + pajak));
    }
}


