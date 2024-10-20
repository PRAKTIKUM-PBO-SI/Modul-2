/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unguidedmodul2mv;
import java.util.Scanner;
/**
 *
 * @author Marsya Valeria MV
 * 2311103105
 * 7C
 */
public class UnguidedModul2MV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pesanan pesanan = new pesanan(10); // Maksimal 10 pesanan
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
            menuUnguided item = new menuUnguided(namaItem, hargaItem, kategoriItem);
            pesanan.tambahpesanan(item);

            System.out.print("Apakah ingin menambah pesanan lagi? (y/n): ");
            tambahPesanan = scanner.next().charAt(0);
            scanner.nextLine(); // Bersihkan buffer
        } while (tambahPesanan == 'y' || tambahPesanan == 'Y');

        // Tampilkan semua pesanan
        pesanan.tampilkanpesanan();
    }
}