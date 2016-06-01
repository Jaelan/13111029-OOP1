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
public class Segitiga extends Bangundatar{

    public Segitiga(int pp, int ll, int tt, int aa, int ss) {
        super(pp, ll, tt, aa, ss);
    }

    Segitiga() {
       
    }
   

     public int Hitungkeliling(int sisi, int alas) {
        int kel;
                kel = sisi + alas * 2;
                return kel;
                

       
    }

    public int Hitungluas(int alas, int tinggi) {
        int luas;
                luas = (int) (0.5 * alas * tinggi);
              return luas;
    }

   

   

    

    
    
    
}
