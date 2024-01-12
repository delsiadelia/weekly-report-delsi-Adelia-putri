/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * Created By_22343060 Muhammad Auliya Dimas Prasetiyo
 */

import javax.swing.JOptionPane;

public class GetInputFromKeyboard2 {

    public static void main(String[] args) {
        
        String name = "", hoby ="";
        
        name = JOptionPane.showInputDialog("Nama Anda : ");
        hoby = JOptionPane.showInputDialog("Hobi Anda : ");
        
        String msg = "Jadi Hobi Anda " + hoby + ". " + "Hobi Yang Bagus " + name;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println("Jadi Hobi Anda " + hoby + ". Hobi Yang Bagus " + name);
    }
}
