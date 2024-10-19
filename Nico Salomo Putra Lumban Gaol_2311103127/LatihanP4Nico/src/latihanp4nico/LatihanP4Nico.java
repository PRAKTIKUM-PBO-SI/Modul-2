/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp4nico;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class LatihanP4Nico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
Pesanan pesanan = new Pesanan(10); // Maksimal 10 pesanan 
char tambahPesanan; 
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
System.out.println("Kategori tidak valid! Silakan masukkan angka 1, 2, atau 3."); 
} 
} while (kategoriItem < 1 || kategoriItem > 3); 
scanner.nextLine(); // Bersihkan buffer 
Menu item = new Menu(namaItem, hargaItem, kategoriItem); 
pesanan.tambahPesanan(item); 
System.out.print("Apakah ingin menambah pesanan lagi? (y/n):"); 
tambahPesanan = scanner.next().charAt(0); 
scanner.nextLine(); // Bersihkan buffer 
} while (tambahPesanan == 'y' || tambahPesanan == 'Y'); 
// Tampilkan pesanan dan hitung diskon 
pesanan.tampilkanPesanan(); 
double diskon = pesanan.hitungDiskon(); 
double hargaSetelahDiskon = pesanan.totalHarga - diskon; 
// Hitung dan tampilkan pajak 
double pajak = hargaSetelahDiskon * 0.10; 
double totalAkhir = hargaSetelahDiskon + pajak; 
// Tampilkan rincian pembayaran 
        System.out.println("\nRincian Pembayaran:"); 
        System.out.println("Total Pesanan: Rp " + pesanan.totalHarga); 
        if (diskon > 0) { 
            System.out.println("Diskon (10%): Rp " + diskon); 
            System.out.println("Harga Setelah Diskon: Rp " + 
hargaSetelahDiskon); 
        } 
        System.out.println("Pajak (10%): Rp " + pajak); 
        System.out.println("Total yang harus dibayar: Rp " + totalAkhir); 
    } 
}