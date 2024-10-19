/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp4izmasyabrian;

/**
 *
 * @author Izma Syabrian
 * 2311103148
 * 07C
 */
public class Menu {
    String namaItem;     double harga; 
    int kategori;  // 1: Pembuka, 2: Utama, 3: Minuman 
    
    public Menu(String namaItem, double harga, int kategori) {
        this.namaItem = namaItem;
        this.harga = harga;
    this.kategori = kategori;
    }
// Method untuk menampilkan informasi menu
    public void tampilkanInfo() {
        String jenis = "";
        switch (kategori) {
            case 1: jenis = "Pembuka"; break;
            case 2: jenis = "Utama"; break;
            case 3: jenis = "Minuman"; break;
        }
        System.out.println(namaItem + " - Kategori: " + jenis + " - Harga:Rp " + harga);
    }

}
