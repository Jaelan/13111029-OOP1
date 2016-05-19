/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polyinterface;

/**
 *
 * @author jay
 */
public class Harimau implements Hewan{

    @Override
    public void makan() {
        System.out.println("Harimau Makan");
    }

    @Override
    public void lari() {
        System.out.println("Harimau Berlari");
    }
    
    public void melahirkan(){
        System.out.println("Harimau Melahirkan");
    }
    
    
}
