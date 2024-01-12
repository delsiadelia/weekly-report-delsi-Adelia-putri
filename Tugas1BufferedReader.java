/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas1bufferedeader;

/**
 *
 * Created By_22343060 Muhammad Auliya Dimas Prasetiyo
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas1BufferedReader {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter word1: ");
            String word1 = reader.readLine();

            System.out.print("Enter word2: ");
            String word2 = reader.readLine();

            System.out.print("Enter word3: ");
            String word3 = reader.readLine();

            System.out.println(word1 + " " + word2 + " " + word3);
        } catch (IOException e) {
            System.err.println("Error reading input.");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("Error closing reader.");
            }
        }
    }
}
