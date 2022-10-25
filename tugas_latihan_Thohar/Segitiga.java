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
public class Segitiga {
    public static void main(String[] args) {    
             double luas, kel;
             int alas, tinggi, sisi;
             Scanner hitung = new Scanner(System.in);
             System.out.println("menghitung luas dan keliling segitiga");
             
             System.out.println("masukan alas : ");
                 alas = hitung.nextInt();
             System.out.println("masukan tinggi : ");
                 tinggi = hitung.nextInt();
             System.out.println("masukan sisi : ");
                 sisi = hitung.nextInt();
                 
             luas = Double.valueOf((alas * tinggi/2));
             kel = alas + tinggi + sisi;
                 
              System.out.println("luas persegi panjang :" + luas); 
              System.out.println("keliling persegi panjang :" + kel);   
    }
}
