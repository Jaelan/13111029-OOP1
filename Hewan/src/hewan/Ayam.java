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
public class Ayam extends Hewan{

    @Override
    public void berburu() {
        super.berburu(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void makan() {
        super.makan(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void bertelur(){
        System.out.println("Ayam dapat bertelur");
    }
    
    public void lari(){
        System.out.println("Ayam dapat berlari");
    }
    
}