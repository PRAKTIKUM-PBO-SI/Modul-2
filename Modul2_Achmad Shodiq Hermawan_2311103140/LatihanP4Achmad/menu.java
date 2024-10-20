/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanP4Achmad;

/**
 *
 * @author User
 */
public class menu {
    String namaItem;
    double harga;
    int kategori;

 public menu(String namaItem, double harga, int kategori){
this.namaItem = namaItem;
this.harga= harga;
this.kategori= kategori;
}
public void tampilkanInfo(){
    String jenis = "";
    switch (kategori){
        case 1 : jenis ="Pembuka";
        break;
        case 2: jenis ="Utama";
        break;
        case 3 : jenis ="Minuman"; 
        break;
    }
    System.out.println (namaItem+ " - kategori:" + jenis+"- Harga: Rp"+harga);
}
}