/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kondisonal1;

import latihanp4izmasyabrian.*;

/**
 *
 * @author Izma Syabrian
 * 2311103148
 * 07C
 */
public class CekBilangan {
    int bilangan;
    
    void periksaGenapGanjil(){
        if (bilangan % 2 == 0){
            System.out.println(bilangan+" adalah genap");
        }else{
            System.out.println(bilangan+" adalah ganjil");
        }
        
    }
}
