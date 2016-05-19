/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

/**
 *
 * @author jay
 */
public class Main {
    
    public static void main (String[] args){
        Hewan dapat = new Hewan();
        dapat.makan();
        dapat.berburu();
        
        Ayam ayam = new Ayam();
        ayam.bertelur();
        
        Polymorp pol = new Polymorp();
        pol.testpoly(new Ayam());
                
    }
    
}
