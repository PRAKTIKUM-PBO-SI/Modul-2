/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp4rajendraikmalveorozzan;

import java.util.Scanner;

/**
 *
 * @author Rajendra Ikmal Veorozzan 
 * 2311103122
 * S1SI07C
 */
public class LatihanP4RajendraIkmalVeorozzan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pesanan pesanan = new Pesanan(10);
        char tambahPesanan;

        do {
            System.out.print("Masukkan nama item : ");
            String namaItem = scanner.nextLine();
            System.out.print("Masukkan harga item : ");
            double hargaItem = scanner.nextDouble();
            System.out.print("Masukkan kategori (1: Pembuka, 2: Utama, 3: Minuman) : ");
            int kategoriItem = scanner.nextInt();
            scanner.nextLine();
            Menu item = new Menu(namaItem, hargaItem, kategoriItem);
            pesanan.tambahPesanan(item);
            System.out.print("Apakah ingin menambah pesanan lagi (Y/N) : ");
            tambahPesanan = scanner.next().charAt(0);
            scanner.nextLine();
        } while (tambahPesanan == 'y' || tambahPesanan == 'Y');

        pesanan.tampilkanPesanan();
        double diskon = pesanan.hitungDiskon();
        if (diskon > 0) {
            System.out.println("Anda mendapatkan diskon 10% sebesar Rp." + diskon);
        }
        System.out.println("Total yang harus dibayar: Rp." + (pesanan.totalHarga - diskon));
    }
}
