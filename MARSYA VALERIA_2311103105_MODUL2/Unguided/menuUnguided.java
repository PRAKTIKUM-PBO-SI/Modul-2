/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguidedmodul2mv;

/**
 *
 * @author MARSYA VALERIA MV
 * 2311103105
 * 7C
 */
public class menuUnguided {
    String namaItem;
    double harga;
    int kategori; // 1: Pembuka, 2: Utama, 3: Minuman

    public menuUnguided(String namaItem, double harga, int kategori) {
        this.namaItem = namaItem;
        this.harga = harga;
        this.kategori = kategori;
    }

    // Menampilkan informasi menu
    public void tampilkanInfo() {
        String jenis = switch (kategori) {
            case 1 -> "Pembuka";
            case 2 -> "Utama";
            case 3 -> "Minuman";
            default -> "Tidak Diketahui";
        };
        System.out.println(namaItem + " - Kategori: " + jenis + " - Harga: Rp " + harga);
    }
}
