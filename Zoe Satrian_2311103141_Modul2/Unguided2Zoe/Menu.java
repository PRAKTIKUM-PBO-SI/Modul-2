package Unguided2Zoe;
// Zoe Satrian / 2311103141
// S1SI-07-C

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