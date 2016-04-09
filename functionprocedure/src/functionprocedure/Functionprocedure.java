/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionprocedure;

/**
 *
 * @author jay
 */
public class Functionprocedure {


    public static void main(String[] args) {
       Functionprocedure hasil = new Functionprocedure();
       hasil.perkalian();
       hasil.namaSaya();
       hasil.pertambahan(5,4);
       hasil.pembagian(10, 2);
       
       System.out.println(hasil.namaSaya());
       System.out.println(hasil.fungsitambah(2,4));
        
    }
private void perkalian(){
    int a=4;
    int b=5;
System.out.println(a*b);
}

private void pertambahan(int a, int b){
    int hasil2;
    hasil2 = a + b;
    System.out.println (hasil2);
}

private void pembagian(int a, int b){
    int hasil2;
    hasil2 = a / b;
    System.out.println (hasil2);
}


private String namaSaya(){
    return "It's function";
}

private int fungsitambah (int a, int b){
    return a + b;
}
}
