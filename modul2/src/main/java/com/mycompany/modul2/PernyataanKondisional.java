/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul2;

/**
 *
 * @author ACER NITRO
 */
public class PernyataanKondisional {
    public static void main(String[] args) {
        int nilai = 85;

        // If-else statement
        if (nilai >= 90) {
            System.out.println("Nilai A");
        } else if (nilai >= 80) {
            System.out.println("Nilai B");
        } else if (nilai >= 70) {
            System.out.println("Nilai C");
        } else {
            System.out.println("Nilai D");
        }

        // Switch statement
        int pilihan = 2;
        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih 1");
                break;
            case 2:
                System.out.println("Anda memilih 2");
                break;
            case 3:
                System.out.println("Anda memilih 3");
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}

