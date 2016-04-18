/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsip;

import java.util.Scanner;

/**
 *
 * @author jay
 */
public class Utsip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        float ip  ;
        int lulus , valid=0, jumlah, bil = 0, tidaklulus, rata, nilaiMin=(int) 2.75;
        
        Utsip range = new Utsip();
        
        System.out.println(range.isWithinRange(4, 0, 4));
        
        ip = input.nextFloat();
        while (ip != -999){
            ip = input.nextFloat();
            if (isWithinRange(ip, 0, 4) == 1){
                valid++;
            }
            if (ip == -999){
                System.out.println("Masukan Jumlah IP Mahasiswa yang palid");  
                jumlah= input.nextInt(); 
                lulus = input.nextInt();
                tidaklulus = input.nextInt();
                
            }
        }
        
        
        
        
        
        
    }

    public static int isWithinRange(float x, float min, float max) {
    if (x <= max && x >=min){       
        return 1;
    } else {
        return 0;
    }
        
    }
    }
   

