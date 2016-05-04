/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manusia;

/**
 *
 * @author jay
 */
public class Ali extends Manusia {

    @Override
    public void melihat() {
        System.out.println("Ali " + super.mata);
    }

    @Override
    public void lari() {
        System.out.println("Ali " + super.kaki);
    }
    
    public void belajar() {
        System.out.println(" Ali belajar");
    }
    
    public void berfikir(){
        System.out.println("Ali " + super.otak);
    }

    @Override
    public void mendengar() {
        super.mendengar(); 
    }

    @Override
    public void minum() {
        super.minum(); 
    }

    @Override
    public void makan() {
        super.makan();
    }
    
    public int berhitung(int hasil1){
       int hasil;
               hasil = hasil1 * 5;
       return hasil;
   }
    
    
}
