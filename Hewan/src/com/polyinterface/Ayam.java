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
public class Ayam implements Hewan{

    @Override
    public void makan() {
        System.out.println("Ayam Makan");
    }

    @Override
    public void lari() {
        System.out.println("Ayam berlari");
    }
    
    public void Bertelur(){
        System.out.println("Ayam Bertelur");
    }
   
}
