package latihanp4geordysiphosamueldamanik;

/**
 *
 * @author Geordy Sipho Samuel Damanik
 * 2311103112
 * S1SI-07-C
 */
public class Menu {
    String namaItem;
    double harga;
    int kategori; // 1: Pembuka, 2: Utama, 3: Minuman

    public Menu(String namaItem, double harga, int kategori) {
        this.namaItem = namaItem;
        this.harga = harga;
        this.kategori = kategori;
    }
// Method untuk menampilkan informasi menu

    public void tampilkanInfo() {
        String jenis = "";
        switch (kategori) {
            case 1:
                jenis = "Pembuka";
                break;
            case 2:
                jenis = "Utama";
                break;
            case 3:
                jenis = "Minuman";
                break;
        }
        System.out.println(namaItem + " - Kategori: " + jenis + " - Harga: Rp " + harga);
    }
}

