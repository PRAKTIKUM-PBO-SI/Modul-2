/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kondisional2;

import java.util.Scanner;

/**
 *
 * @author Izma Syabrian
 * 2311103148
 * 07C
 */
public class LatihanP42IzmaSyabrian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Hari ph = new Hari();
        
        System.out.println("Masukkan angka (1-7): ");
        ph.hari = input.nextInt();
        ph.pilihHari();
    }
    
}
