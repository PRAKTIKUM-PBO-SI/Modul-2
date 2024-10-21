package Unguided1Zoe;
// Zoe Satrian / 2311103141
// S1SI07C

import java.util.Scanner;

public class Unguided1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pesanan pesanan = new Pesanan(10);
        char tambahPesanan;
        
        do{
            System.out.print("Masukkan nama item : ");
            String namaItem = scanner.nextLine();
            System.out.print("Masukkan harga item : ");
            double hargaItem = scanner.nextDouble();
            
            int kategoriItem = 0;
            boolean kategori = false;
            while(kategori == false){
                System.out.print("Masukkan kategori (1: Pembuka, 2: Utama, 3: Minuman) : ");
                kategoriItem = scanner.nextInt();
                
                if(kategoriItem <= 3){
                    kategori = true;
                }else{
                    System.out.println("Kategori salah input");
                }
            }
            scanner.nextLine();
            Menu item = new Menu(namaItem, hargaItem, kategoriItem);
            pesanan.tambahPesanan(item);
            System.out.print("Apakah ingin menambah pesanan lagi (Y/N) : ");
            tambahPesanan = scanner.next().charAt(0);
            scanner.nextLine();
        }while(tambahPesanan == 'y' || tambahPesanan == 'Y');
        
        System.out.println("");
        pesanan.tampilkanPesanan();
        
        double diskon = pesanan.hitungDiskon();
        if(diskon > 0){
            System.out.println("Anda mendapatkan diskon 10% sebesar Rp." + diskon);
        }
        System.out.println("Total yang harus dibayar: Rp." + (pesanan.totalHarga - diskon));
    }
}