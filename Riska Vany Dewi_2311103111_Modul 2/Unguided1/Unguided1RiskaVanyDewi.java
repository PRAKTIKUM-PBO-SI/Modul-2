/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided1RiskaVanyDewi;

/**
 * @author Riska Vany Dewi
 * 2311103111
 * S1SI07C
 */

import java.util.Scanner;

public class Unguided1RiskaVanyDewi {

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

           if (kategoriItem >= 1 && kategoriItem <= 3) {
           break;
           } else { 
            System.out.println("Input tidak valid. Silakan masukkan angka 1, 2, atau 3.");
            }
           }
           scanner.nextLine();
       
            Menu item = new Menu(namaItem, hargaItem, kategoriItem);
            pesanan.tambahPesanan(item);

            System.out.print("Apakah ingin menambah pesanan lagi? (y/n): ");
            tambahPesanan = scanner.next().charAt(0);
            scanner.nextLine(); 
            
        } while (tambahPesanan == 'y' || tambahPesanan == 'Y');

        pesanan.tampilkanPesanan();
        double diskon = pesanan.hitungDiskon();
        if (diskon > 0) {
            System.out.println("Anda mendapatkan diskon 10% sebesar Rp " + diskon);
        }
        System.out.println("Total yang harus dibayar: Rp " + (pesanan.totalHarga - diskon));
    }
}