/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas2joptionpane;

/**
 *
 * Created By_22343060 Muhammad Auliya Dimas Prasetiyo
 */

import javax.swing.JOptionPane;

public class Tugas2JOptionPane {

    public static void main(String[] args) {
        String word1 ="", word2="", word3="";
        word1 = JOptionPane.showInputDialog("Word 1 : ");
        word2 = JOptionPane.showInputDialog("Word 2 : ");
        word3 = JOptionPane.showInputDialog("Word 3 : ");
        
        String msg =" " + word1 + " " + word2 + " " + word3;
        
        JOptionPane.showMessageDialog(null,msg);
    }
}
