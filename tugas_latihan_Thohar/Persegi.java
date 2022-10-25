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
public class Persegi {
    public static void main(String[] args) {
    double luas,kel;
    int s;
    
    Scanner hitung = new Scanner(System.in);
    
        System.out.println("Menghitung Luas dan Keliling Persegi");
        System.out.println("Masukkan sisi");
        s = hitung.nextInt();
        
        luas = s * s;
        kel = 4 * s;
        
        System.out.println("Luas Lingkaran Adalah :" + luas );
        System.out.println("Keliling Lingkaran Adalah :" + kel );
    }
}
