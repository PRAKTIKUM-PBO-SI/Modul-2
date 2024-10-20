package LatihanP4TegarFerdian;
//@author Tegar Ferdian (2311103123)

import java.util.Scanner;

public class Unguided1 {

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
            int kategoriItem;

            // Validasi input kategori
            while (true) {
                System.out.print("Masukkan kategori (1: Pembuka, 2: Utama, 3: Minuman): ");
                kategoriItem = scanner.nextInt();
                if (kategoriItem >= 1 && kategoriItem <= 3) {
                    break; // keluar dari loop jika input valid
                } else {
                    System.out.println("Input tidak valid! Silakan masukkan 1, 2, atau 3.");
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
        if (diskon > 0) {
            System.out.println("Anda mendapatkan diskon 10% sebesar Rp " + diskon);
        }
        System.out.println("Total yang harus dibayar: Rp " + (pesanan.totalHarga - diskon));
    }
}
