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
public class PersegiPanjang extends Bangundatar{

    public PersegiPanjang(int pp, int ll, int tt, int aa, int ss) {
        super(pp, ll, tt, aa, ss);
        
    }

    PersegiPanjang() {
        
    }

  
     
     public int Hitungkeliling(int panjang, int lebar, int tinggi) {
     int kel;
             kel = panjang + lebar + tinggi;
             return kel;
             
        
    }

     public int Hitungluas(int panjang, int lebar) {
     int luas;
            luas = panjang * lebar;
            return luas;
            
         
    }

  
    
    


    
    
    
    
}
