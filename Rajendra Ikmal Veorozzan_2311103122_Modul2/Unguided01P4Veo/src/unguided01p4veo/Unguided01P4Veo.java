
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unguided01p4veo;
import java.util.Scanner;
/**
 * @author Rajendra Veo ikmal veorozzan
 * 2311103122
 * SI07C
 */
public class Unguided01P4Veo {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Pesanan pesanan = new Pesanan(10);
        boolean tambahPesanan;

        do {
            System.out.print("Masukkan nama Item: ");
            String namaItem = scanner.nextLine();
            System.out.print("Masukkan harga Item: ");
            double hargaItem = validasiInputHarga(scanner);

            int kategoriItem = validasiInputKategori(scanner);
            
            Menu item = new Menu(namaItem, hargaItem, kategoriItem);
            pesanan.tambahPesanan(item);

            tambahPesanan = tanyaTambahPesanan(scanner);

        } while (tambahPesanan);

        pesanan.tampilkanPesanan();
        double diskon = pesanan.hitungDiskon();
        if (diskon > 0) {
            System.out.println("Anda mendapatkan diskon 10% sebesar Rp." + diskon);
        }
        System.out.println("Total yang harus dibayar: Rp." + (pesanan.totalHarga - diskon));
    }

   
    public static double validasiInputHarga(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Harga harus berupa angka. Silakan coba lagi.");
            scanner.next(); 
        }
        return scanner.nextDouble();
    }

    
    public static int validasiInputKategori(Scanner scanner) {
        int kategoriItem;
        do {
            System.out.print("Masukkan kategori (1: Pembuka, 2: Utama, 3: Minuman): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Input harus berupa angka. Masukkan angka 1, 2, atau 3.");
                scanner.next(); 
            }
            kategoriItem = scanner.nextInt();
            if (kategoriItem < 1 || kategoriItem > 3) {
                System.out.println("Kategori tidak valid. Masukkan angka 1, 2, atau 3.");
            }
        } while (kategoriItem < 1 || kategoriItem > 3);
        scanner.nextLine(); 
        return kategoriItem;
    }

    
    public static boolean tanyaTambahPesanan(Scanner scanner) {
        char tambahPesanan;
        do {
            System.out.print("Apakah ingin menambah pesanan lagi (Y/N): ");
            tambahPesanan = scanner.next().charAt(0);
            scanner.nextLine(); 
            if (tambahPesanan != 'y' && tambahPesanan != 'Y' && tambahPesanan != 'n' && tambahPesanan != 'N') {
                System.out.println("Input tidak valid. Harap masukkan Y atau N.");
            }
        } while (tambahPesanan != 'y' && tambahPesanan != 'Y' && tambahPesanan != 'n' && tambahPesanan != 'N');
        
        return (tambahPesanan == 'y' || tambahPesanan == 'Y');
    }
}