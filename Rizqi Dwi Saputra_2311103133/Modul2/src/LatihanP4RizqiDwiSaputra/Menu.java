/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LatihanP4RizqiDwiSaputra;
//@author Rizqi Dwi Saputra / 2311103133

public class Menu {

    String namaItem;
    double harga;
    int kategori;
    
    public Menu(String namaItem, double harga, int kategori){
        this.namaItem = namaItem;
        this.harga = harga;
        this.kategori = kategori;
    }
    
    public void tampilkanInfo(){
        String jenis = "";
        
        switch (kategori){
            case 1: jenis = "Pembuka";
            break;
            
            case 2: jenis = "Utama";
            break;
            
            case 3: jenis = "Minuman";
            break;
        }
        System.out.println(namaItem + " - Kategori: " + jenis + " - Harga: Rp." + harga);
    }
}
