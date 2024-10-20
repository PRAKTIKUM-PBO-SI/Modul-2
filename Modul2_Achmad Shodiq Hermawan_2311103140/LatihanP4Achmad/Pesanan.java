/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanP4Achmad;

/**
 *
 * @Achmad Shodiq /2311103140
 */
public class Pesanan {
menu[]daftarPesanan;  
int jumlahPesanan; 
double totalHarga;

public Pesanan (int kapasitas ){
    daftarPesanan = new menu[kapasitas];
    jumlahPesanan=0;
    totalHarga=0;
}
public void tambahPesanan (menu item){
    daftarPesanan[jumlahPesanan]=item;
    totalHarga+=item.harga;
    jumlahPesanan++;
}

public void tampilkanPesanan(){
    System.out.println("Daftar Pesanan:");
    for (int i =0; i < jumlahPesanan; i++){
        daftarPesanan[i].tampilkanInfo();
    }
    System.out.println("Total Harga: Rp."+totalHarga);
}
public double hitungDiskon(){
    if(totalHarga>20000){
        return totalHarga *0.10;
       
    }else{
        return 0;
    }
}
}