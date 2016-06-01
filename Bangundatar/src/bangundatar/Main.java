/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author jay
 */
public class Main {
    
    public static void main(String[] args){
        System.out.println("Persegipanjang");
        PersegiPanjang luas = new PersegiPanjang();
        
        System.out.println(luas.Hitungkeliling(5,5,5) + " Cm ");
        System.out.println(luas.Hitungluas(5,5) + " Cm ");
        
        System.out.println("");
        System.out.println("Segitiga ");
        Segitiga kel = new Segitiga();
       
        System.out.println(kel.Hitungkeliling(6,6) + " Cm ");
        System.out.println(kel.Hitungluas(6,8) + " Cm ");
        
        
    }
    
}
