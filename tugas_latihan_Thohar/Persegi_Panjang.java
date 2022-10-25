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
public class Persegi_Panjang {
    public static void main(String[] args) {
             double luas, kel;
             int panjang, lebar;
             Scanner hitung = new Scanner(System.in);
             System.out.println("menghitung luas dan keliling persegi panjang");
             
             System.out.println("masukan panjang : ");
                 panjang = hitung.nextInt();
             System.out.println("masukan lebar : ");
                 lebar = hitung.nextInt();
                 
             luas = panjang * lebar;
             kel = 2 * (panjang + lebar);
                 
              System.out.println("luas persegi panjang :" + luas); 
              System.out.println("keliling persegi panjang :" + kel); 
                
    }
}
