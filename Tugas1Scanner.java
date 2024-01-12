/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * Created By_22343060 Muhammad Auliya Dimas Prasetiyo
 */
import java.util.Scanner;

public class Tugas1Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Word1: ");
        String word1 = scanner.next();

        System.out.print("Enter Word2: ");
        String word2 = scanner.next();

        System.out.print("Enter Word3: ");
        String word3 = scanner.next();

        System.out.println(word1 + " " + word2 + " " + word3);

        scanner.close();
    }
}
