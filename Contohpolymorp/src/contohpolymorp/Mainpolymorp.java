/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohpolymorp;

/**
 *
 * @author jay
 */
public class Mainpolymorp {
    
    public static void main(String[] args) {
    Contohpolymorp data = new Contohpolymorp();
    
        System.out.println("Cetak tipe data string");
        data.CetakData("Garut");
        
        System.out.println("Cetak tipe data integer");
        data.CetakData("1995");
        
        System.out.println("Cetak tipe data char");
        data.CetakData('N');
        
        System.out.println("Cetak tipe data double");
        data.CetakData(17.5/5);
        
    }
    
}
