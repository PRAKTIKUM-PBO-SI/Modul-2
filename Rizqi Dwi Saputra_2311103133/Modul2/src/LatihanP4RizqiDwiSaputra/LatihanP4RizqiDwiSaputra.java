/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanP4RizqiDwiSaputra;
//@author Rizqi Dwi Saputra / 2311103133

import java.util.Scanner;

public class LatihanP4RizqiDwiSaputra {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pesanan pesanan = new Pesanan(10);
        char tambahPesanan;
        
        do{
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
        }while(tambahPesanan == 'y' || tambahPesanan == 'Y');
        
        pesanan.tampilkanPesanan();
        
        double diskon = pesanan.hitungDiskon();
        if(diskon > 0){
            System.out.println("Anda mendapatkan diskon 10% sebesar Rp." + diskon);
        }
        System.out.println("Total yang harus dibayar: Rp." + (pesanan.totalHarga - diskon));
    }
}
