/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mahasiswa.scanner2;

/**
 *
 * Created By_22343060 Muhammad Auliya Dimas Prasetiyo
 */

import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) {
        float angkat1, angka2, jumlah;
        Scanner dataMasuk = new Scanner(System.in);
        
        System.out.println("Masukkan Angka Ke - 1: ");
        float angka1 = dataMasuk.nextFloat();
        
        System.out.println("Masukkan Angka Ke - 2: ");
        angka2 = dataMasuk.nextFloat();
        
        jumlah = angka1 + angka2;
        
        System.out.println("Angka Ke - 1: " + angka1);
        System.out.println("Angka Ke - 2: " + angka2);
        System.out.println("Jumlah : " + jumlah);
    }
}
