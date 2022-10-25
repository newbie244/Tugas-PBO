/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_latihan_Thohar;

import java.util.Scanner;

/**
 *
 * @author LK5_20
 */
public class Lingkaran {
    public static void main(String[] args) {
    double luas,kel,PI;
    int r;
    
    Scanner hitung = new Scanner(System.in);
    
        System.out.println("Menghitung Luas dan Keliling Lingkaran");
        System.out.println("Masukkan Jari Jari");
        r = hitung.nextInt();
        
        PI = 3.14;
        luas = PI * r * r;
        kel = 2 * PI * r;
        
        System.out.println("Luas Lingkaran Adalah :" + luas );
        System.out.println("Keliling Lingkaran Adalah :" + kel );
    }       
}
