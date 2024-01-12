/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mobilutama;


public class MobilUtama {

    public static void main(String[] args) {
        Mobil Honda = new Mobil();
        Honda.merk = "Lamborgini";
        Honda.warna = "Hitam";
        Honda.tahunProduksi = 2025;
        System.out.println("Merk\t " + Honda.merk);
        System.out.println("Warna\t " + Honda.warna);
        System.out.println("Tahun\t " + Honda.tahunProduksi);
        Honda.Maju();
        Honda.Maju();
        Honda.Mundur();
    }
}
