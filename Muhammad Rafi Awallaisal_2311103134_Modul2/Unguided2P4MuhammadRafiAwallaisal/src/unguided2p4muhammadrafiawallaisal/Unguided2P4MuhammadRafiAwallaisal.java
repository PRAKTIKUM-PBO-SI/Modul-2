/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unguided2p4muhammadrafiawallaisal;
import java.util.Scanner;
/**
 *
 * @author Muhammad Rafi Awallaisal;
 * 2311103134
 * 07C
 */
public class Unguided2P4MuhammadRafiAwallaisal {


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
            System.out.print("Masukkan kategori (1: Pembuka, 2: Utama, 3: Minuman): ");
            int kategoriItem = scanner.nextInt();
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
        if (diskon > 0) {
            System.out.println("Anda mendapatkan diskon 10% sebesar Rp " + diskon);
        }
        
        // Hitung total setelah diskon
        double totalSetelahDiskon = pesanan.totalHarga - diskon;
        System.out.println("Total setelah diskon: Rp " + totalSetelahDiskon);
        
        // Hitung pajak 10% dari total setelah diskon
        double pajak = totalSetelahDiskon * 0.10;
        System.out.println("Pajak 10%: Rp " + pajak);
        
        // Hitung total yang harus dibayar setelah pajak
        double totalSetelahPajak = totalSetelahDiskon + pajak;
        System.out.println("Total yang harus dibayar: Rp " + totalSetelahPajak);
    }
}
