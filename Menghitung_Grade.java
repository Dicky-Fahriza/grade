/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menghitung_grade;

import java.util.Scanner;

/**
 *
 * @author Dicky
 */
public class Menghitung_Grade {

    public static void main(String[] args) {
         
        Scanner scan = new Scanner (System.in);
        
        int NIK;
        String Nama;
        int Nilai;
        char Point;
        
        System.out.println("MASUKKAN DATA MAHASISWA");
        
       
        
        for (int i = 1; i < 5; i++) {
            
            System.out.println("No \t\t: "+i);
            
            System.out.print("NIK \t\t: ");
            NIK = scan.nextInt();
            
            System.out.print("Nama \t\t: ");
            Nama = scan.next();
            
            System.out.print("Nilai \t\t: ");
            Nilai = scan.nextInt();
            
            if (Nilai > 80) {
                Point = 'A';
                System.out.println("Point \t\t: "+Point);
                System.out.println("Keterangan \t: "+"Sangat Memuaskan");
            }
            else if (Nilai > 50 && Nilai <=80) {
                Point = 'C';
                System.out.println("Point \t\t: "+Point);
                System.out.println("Keterangan \t: "+"Cukup");
            }
            
            else {
                Point = 'E';
                System.out.println("Point \t\t: "+Point);
                System.out.println("Keterangan \t: "+"Tidak Lulus");
            }
            System.out.println("");
         }
    }
}
