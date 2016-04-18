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
public class Hari {
    int hh,bb,tt,dd,mm,jj,gg;
    
    public Hari(){
        
    }

    public Hari(int hh, int bb, int tt, int dd, int mm, int jj, int gg) {
        this.hh = hh;
        this.bb = bb;
        this.tt = tt;
        this.dd = dd;
        this.mm = mm;
        this.jj = jj;
        this.gg = gg;
    }

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        this.hh = hh;
    }

    public int getBb() {
        return bb;
    }

    public void setBb(int bb) {
        this.bb = bb;
    }

    public int getTt() {
        return tt;
    }

    public void setTt(int tt) {
        this.tt = tt;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getJj() {
        return jj;
    }

    public void setJj(int jj) {
        this.jj = jj;
    }

    public int getGg() {
        return gg;
    }

    public void setGg(int gg) {
        this.gg = gg;
    }

  

    
    
 

 int convertBbtoHh (int Hari){
     int hari;
             hari = Hari * 30;
     return hari;
 }
 
 int convertTttoBb (int Tahun){
     int bulan;
            bulan = Tahun * 12;
     return bulan;
 }
 
 int convertTttoHh (int Tahun2){
     int hari1;
            hari1 = Tahun2 * 365;
     return hari1;  
 }
 
 int convertHhtoMm (int Hari2){
     int nit;
          nit = Hari2 * 1440;
     return nit;
 }
 
 int convertHhtoJj (int Hari3){
     int jam;
          jam = Hari3 * 24;
     return jam; 
 }
 
 int convertHhtoDd (int Hari4){
     int detik;
            detik = Hari4 * 86400; 
     return detik;
 }
 
 int convertBbtoJj (int Bulan){
     int jam2;
        jam2 = Bulan * 720;
      return jam2;
 }
 
 int convertBbtoMm (int Bulan2){
     int menit;
        menit = Bulan2 * 43800;
        return menit;
 }
 
 int convertTttoJj (int Tahun3){
     int jam3;
            jam3 = Tahun3 * 8760;
          return jam3;
 }
 
 int convertTttoGg (int Tahun4){
     int pekan;
           pekan = Tahun4 * 52;
      return pekan;
 }
}
