/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanhari;

/**
 *
 * @author jay
 */
public class Latihanhari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hari jumlah = new Hari();
        Hari jumlah2 = new Hari(7, 12, 1, 30, 60, 20, 7);
        
        System.out.println(jumlah.convertBbtoHh(2) + " Hari");
        System.out.println(jumlah.convertTttoBb(4) + " Bulan");
        System.out.println(jumlah.convertTttoHh(5) + " Hari");
        System.out.println(jumlah.convertBbtoJj(3) + " Jam");
        System.out.println(jumlah.convertBbtoMm(5) + " Menit");
        System.out.println(jumlah.convertHhtoDd(1) + " Detik");
        System.out.println(jumlah.convertHhtoJj(2) + " Jam");
        System.out.println(jumlah.convertHhtoMm(4) + " Menit");
        System.out.println(jumlah.convertTttoJj(1) + " Jam");
        System.out.println(jumlah.convertTttoGg(4) + " Pekan");
        System.out.println("");
        System.out.println(jumlah2.bb);
        System.out.println(jumlah2.dd);
        System.out.println(jumlah2.hh);
        System.out.println(jumlah2.jj);
        System.out.println(jumlah2.mm);
        System.out.println(jumlah2.tt);
        System.out.println(jumlah2.gg);
        
    }
    
}
