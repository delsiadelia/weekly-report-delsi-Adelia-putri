/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.scanner1;

/**
 *
 * Created BY_22343060 Muhammad Auliya Dimas Prasetiyo
 */

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        String nama;
        int NIM;
        float nilai;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan Nama Lengkap : ");
        nama = in.nextLine();
        
        System.out.println("Masukkan Nim : ");
        int nim = Integer.parseInt(in.nextLine());
       
        System.out.println("Masukkan Nilai : ");
        nilai = Float.parseFloat(in.nextLine());
        
        System.out.println("\nNama : " + nama +
                    "\nNim : " + nim +
                    "\nNilai : " + nilai);

    }
}
