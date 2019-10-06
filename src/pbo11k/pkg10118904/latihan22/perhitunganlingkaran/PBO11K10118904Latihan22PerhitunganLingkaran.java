/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan22.perhitunganlingkaran;
import java.util.*;

/**
 *
 * @author ACER
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi program menghitung jari-jari , luas dan keliling lingkaran
 */
public class PBO11K10118904Latihan22PerhitunganLingkaran {
    public static final float phi = (float) 3.1416;
    public static void hitunglingkaran(double d) {
        float r, l, k;
        r =(float) d/2;
        l =r * r * (float) phi;
        k =(float) ((float) phi * d);
        System.out.println("====== Hasil Perhitungan Lingkaran ======");
        String rcm,lcm,kcm;
        rcm = Float.toString(r);
        lcm = Float.toString(l);
        kcm = Float.toString(k);
        System.out.println("Jari-jari Lingkaran = " + rcm + " cm");
        System.out.println("Luas Lingkaran = " + lcm + " cm");
        System.out.println("Keliling Lingkaran = " + kcm + " cm");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        float n = 0;
        
        System.out.println("====== Perhitungan Lingkaran ======");
        
        do {
            System.out.print("Masukan nilai diameter lingkaran : ");
        try {n = input.nextFloat();} 
        catch (Exception e){
                System.out.println("Nilai diameter tidak sesuai");
                input.next();
        }
        }while(n<=0);
        hitunglingkaran(n);
    }
    
}
