/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpraktikum;

/**
 *
 * @author jay
 */
public class Latihanpraktikum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Latihanpraktikum coba = new Latihanpraktikum();
    coba.logikaand(1,0);
    coba.logikaor (1,0);
    coba.sambung();
    
    System.out.println(coba.logikaXor(1,0));
    System.out.println(coba.nilaimandiri(70,80,70));
    System.out.println(coba.nilaitertinggi(90,80));
    }
   
    private void logikaand(int a, int b){
    int hasil;
    hasil = a & b;
    System.out.println(hasil);
    }
    
    private void logikaor(int a, int b){
    int hasil;
    hasil = a | b;
    System.out.println(hasil);
    }
    
    private int logikaXor (int a, int b){
    return a ^ b;
    }
    
    private int nilaimandiri (int a, int b, int c){
    int x;
        x = (a + b + c)/3;
    return x;
    }
    
    private int nilaitertinggi (int a, int b){
    int x; 
        x = (b > a)? b : a;
    return x;
    }
    
    private void sambung (){
    String x = "Taman bentang 1000 bulan";
    System.out.println(x.length());
    }
    
    
    
    
    
    
   
    
      
}
