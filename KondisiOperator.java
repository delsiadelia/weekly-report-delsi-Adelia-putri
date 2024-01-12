/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kondisioperator;

/**
 *
 * Created By_22343060 Muhammad Auliya Dimas Prasetiyo
 */
public class KondisiOperator {

    public static void main(String[] args) {
        String status = "";
        int grade = 50;
        
        // mendapatkan status pelajar
        status = (grade >= 60 ) ? "Passed" : "Fail";
        
        // print status
        System.out.println(status);
    }
}
