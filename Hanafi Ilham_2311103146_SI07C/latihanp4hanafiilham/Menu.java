/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanp4hanafiilham;

/**
 *
 * @author hanaf
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
            case 1 -> jenis = "Pembuka";
            case 2 -> jenis = "Utama";
            case 3 -> jenis = "Minuman";
        }
        System.out.println(namaItem + " - Kategori: " + jenis + " - Harga: Rp " + harga);
    }
}
