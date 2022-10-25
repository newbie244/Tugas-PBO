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
public class Biodata {
     public static void main(String[] args) {
         System.out.println("Data Diri");
            Scanner masukan = new Scanner(System.in);
            
            System.out.println("masukan nama anda : ");
            String nama = masukan.nextLine();
            
            System.out.println("masukan alamat anda : ");
            String alamat = masukan.nextLine();
            
            System.out.println("masukan kelas anda : ");
            String kelas = masukan.nextLine();
            
            System.out.println("masukan no absen anda : ");
            int absen = masukan.nextInt();
            
            
            System.out.println("Nama anda adalah" +nama);
            System.out.println("Almat anda di " +alamat);
            System.out.println("anda dari kelas " +kelas);
            System.out.println("No absen anda adalah" +absen);
     }
}
