/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unguidedke2modul2mv;
import java.util.Scanner;
/**
 *
 * @author MARSYA VALERIA
 * 2311103105
 * 7C
 */
public class Unguidedke2Modul2MV {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        PesananUnguided2 pesanan = new PesananUnguided2(10); // Maksimal 10 pesanan
        char tambahPesanan;

        // Perulangan untuk menambah pesanan
        do {
            System.out.print("Masukkan nama item: ");
            String namaItem = scanner.nextLine();

            System.out.print("Masukkan harga item: ");
            double hargaItem = scanner.nextDouble();

            // Validasi kategori, hanya menerima input 1, 2, atau 3
            int kategoriItem;
            while (true) {
                System.out.print("Masukkan kategori (1: Pembuka, 2: Utama, 3: Minuman): ");
                kategoriItem = scanner.nextInt();
                if (kategoriItem >= 1 && kategoriItem <= 3) break;
                System.out.println("Kategori tidak valid. Silakan masukkan ulang.");
            }

            scanner.nextLine(); // Bersihkan buffer

            // Buat objek Menu baru dan tambahkan ke pesanan
            MenuUnguided2 item = new MenuUnguided2(namaItem, hargaItem, kategoriItem);
            pesanan.tambahPesananUnguided2(item);

            System.out.print("Apakah ingin menambah pesanan lagi? (y/n): ");
            tambahPesanan = scanner.next().charAt(0);
            scanner.nextLine(); // Bersihkan buffer
        } while (tambahPesanan == 'y' || tambahPesanan == 'Y');

        // Tampilkan semua pesanan
        pesanan.tampilkanPesananUnguided2();

        // Hitung diskon dan pajak
        double diskon = pesanan.hitungDiskon();
        double totalSetelahDiskon = pesanan.totalHarga - diskon;
        double pajak = pesanan.hitungPajak(totalSetelahDiskon);
        double totalAkhir = totalSetelahDiskon + pajak;

        // Tampilkan detail harga
        if (diskon > 0) {
            System.out.println("Anda mendapatkan diskon 10% sebesar Rp " + diskon);
        }
        System.out.println("Pajak 10%: Rp " + pajak);
        System.out.println("Total yang harus dibayar: Rp " + totalAkhir);
    }
}  