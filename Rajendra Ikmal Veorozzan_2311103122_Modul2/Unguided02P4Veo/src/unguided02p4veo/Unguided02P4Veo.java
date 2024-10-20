/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unguided02p4veo;

import java.util.Scanner;

/**
 *
 * @author Rajendra Ikmal Veorozzan 
 * 2311103122
 * S1SI07C
 */
public class Unguided02P4Veo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pesanan pesanan = new Pesanan(10);
        char tambahPesanan;
        System.out.print("=== Struk Pesanan === ");
        scanner.nextLine();
        System.out.print("=== Rajendra === ");
        scanner.nextLine();
        
        do {
            System.out.print("Masukkan nama item : ");
            String namaItem = scanner.nextLine();
            System.out.print("Masukkan harga item : ");
            double hargaItem = scanner.nextDouble();

            int kategoriItem = 0;
            boolean kategori = false;
            while (kategori == false) {
                System.out.print("Masukkan kategori (1: Pembuka, 2: Utama, 3: Minuman) : ");
                kategoriItem = scanner.nextInt();

                if (kategoriItem <= 3) {
                    kategori = true;
                } else {
                    System.out.println("Kategori salah input");
                }
            }
            scanner.nextLine();
            Menu item = new Menu(namaItem, hargaItem, kategoriItem);
            pesanan.tambahPesanan(item);
            System.out.print("Apakah ingin menambah pesanan lagi (Y/N) : ");
            tambahPesanan = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.println("");
        } while (tambahPesanan == 'y' || tambahPesanan == 'Y');

        System.out.println("");
        pesanan.tampilkanPesanan();
        double diskon = pesanan.hitungDiskon();
        if (diskon > 0) {
            System.out.println("Anda mendapatkan diskon 10% sebesar Rp." + diskon);
        }

        double hargaDiskon = pesanan.totalHarga - diskon;
        double pajak = pesanan.hitungPajak(hargaDiskon);
        System.out.println("Pajak 10% Rp." + pajak);
        System.out.println("");
        System.out.println("Total yang harus dibayar (Sudah termasuk pajak): Rp."+ (hargaDiskon + pajak));
    }
}