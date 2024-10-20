package LatihanP4LevinaMaheswari;
import java.util.Scanner;
/**
 * @author Levina Maheswari
 * 2311103110/S1SI07C
 */
public class Main {
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
            
            // Validasi input kategori
            int jenisItem;
            do {
                System.out.print("Masukkan kategori (1: Pembuka, 2: Utama, 3: Minuman): ");
                jenisItem = scanner.nextInt();
                if (jenisItem < 1 || jenisItem > 3) {
                    System.out.println("Kategori tidak valid.Silakan ulangi lagi");
                }
            } while (jenisItem < 1 || jenisItem > 3);
            scanner.nextLine();
            Menu item = new Menu(namaItem, hargaItem, jenisItem);
            pesanan.tambahPesanan(item);

            System.out.print("Apakah ingin menambah pesanan lagi? (y/n): ");
            tambahPesanan = scanner.next().charAt(0);
            scanner.nextLine(); 
        } while (tambahPesanan == 'y' || tambahPesanan == 'Y');
        // Tampilkan pesanan dan hitung diskon
        pesanan.tampilkanPesanan();
        double diskon = pesanan.hitungDiskon();
        if (diskon > 0) {
            System.out.println("Anda mendapatkan diskon 10% sebesar Rp " + diskon);
        }
        // Hitung pajak
        double hargaAkhir = pesanan.totalHarga - diskon;
        double pajak = hargaAkhir * 0.10;
        System.out.println("Pajak 10%: Rp " + pajak);
        // Harga akhir
        double totalBayar = hargaAkhir + pajak;
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
    }
}