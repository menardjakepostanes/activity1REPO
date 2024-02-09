/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity1;

import java.util.Scanner;

/**
 *
 * @author MenardJakeP
 */
public class Activity1 {

    public static void main(String[] args) {
        
        try (Scanner scn = new Scanner (System.in)) {
            System.out.println ("Enter First  Name :");
            String fName = scn.nextLine();
            
            System.out.println( "Enter Middle Name:");
            String mName = scn.nextLine();
            
            System.out.println("Enter your Last name");
            String lName = scn.nextLine();
            
            System.out.println("Enter your Gender");
            String gender = scn.nextLine ();
            
            System.out.println("Enter Age:");
            String age = scn.nextLine ();
            
            System.out.println("Enter your Birthdate");
            var Birthdate = scn.nextLine();
            
            System.out.println("Enter your fav food");
            String fFood = scn.nextLine();
                    
            System.out.println("Your Data:" + fName);
            System.out.println("Your Data:" + mName);
            System.out.println("Your Data:" + lName);
            System.out.println("Your Data:" + gender);
            System.out.println("Your Data:" + age);
            System.out.println("Your Data:" + Birthdate);
            System.out.println("Your Data:" + fFood);




            
            scn.close();
    }
}}
