/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kondisional2;

/**
 *
 * @author Izma Syabrian
 * 2311103148
 * 07C
 */
public class Hari {
    int hari;
    
    void pilihHari(){
        switch (hari){
            case 1: System.out.println("Minggu"); break;
            case 2: System.out.println("Senin"); break;
            case 3: System.out.println("Selasa"); break;
            case 4: System.out.println("Rabu"); break;
            case 5: System.out.println("Kamis"); break;
            case 6: System.out.println("Jumat"); break;
            case 7: System.out.println("Sabtu"); break;
            default: System.out.println("Hari tidak valid"); break;
            
        }
    }
}
