/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empapplication;
import java.util.*;

/**
 *
 * @author NWOKWU CHISOM
 */
public class EmpApp {
    //Declaring variables
    private static int num, n;
    private static String degree, state, language, firstName, lastName;
    private static Scanner input;
    private static int age, years, salary;
    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        // TODO code application logic here
        //Program will start from the intro method
        intro();
    }//End of Main Method
    private static void intro() {
     //Loopes the heading and number of applications 5 times
     for (num = 1; num <= 5; num++) {
            System.out.println("WELCOME TO MICROSOFT'S APPLICATION FOR THE POSITION OF THE CENTRAL MANAGER");
            System.out.println("PLEASE KINDLY FILL IN YOUR DETAILS BELOW: ");
         
           Scanner input = new Scanner(System.in);
           System.out.print("APPLICATION: ");
           //User inputs the number of his/ her application
           n = input.nextInt();
           //The getInput method is invoked
           getInput();
            
    
     }//End of for loop
    }//End of method
    
    private static void getInput() {
        //Scanner is called
        Scanner input = new Scanner(System.in);
        //User inputs first and last name
        System.out.println("Enter First Name: ");
        firstName = input.next();

        System.out.println("Enter Last Name: ");
        lastName = input.next();
        
        //The toAge method is invoked
        toAge();
    }//End of method
    
    private static void toAge() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Age: ");
        age = input.nextInt();
    //Condition for age    
    if (age < 30) {
        System.out.println("Enter State of Origin: ");
        String state = input.next();
        //If meet true, move to this method
        getDegree();
        
    }   else if (age >= 30) {
        System.out.println("Invalid Age");
        //If false, move to the intro method
        intro();
    }//End of If statement
    }//End of method
    
    private static boolean getDegree () {
        Scanner input = new Scanner(System.in);
        System.out.println( "Degree Specification: [MSc, BSc, BEng]" );
        degree = input.next();
        //Condition for degree, if returns true, move to the getYears method
        if(degree.equals("BSc")) {
        getYears();
        return true;
        }
        //if degree = MSc OR BEng
        else if (degree.equals("MSc") || degree.equals("BEng")) {
        System.out.println("Invalid");
        //if false, back to intro
        intro();
        }//End of If statement
        
        return false;     
    }//End of method
    
    
    private static void getYears() {
         Scanner input = new Scanner(System.in);
         System.out.println("Working experience (Years): ");
         years = input.nextInt();
         //if condition is meet, move to getLanguage method
         if (years > 5) {
         getLanguage();
         } else if (years < 5) {
         System.out.println("Invalid");
         //If not, move back to intro method
         intro();
         }//End of if statement
    }//End of method
    
    private static void getLanguage() {
        Scanner input = new Scanner(System.in);
        System.out.println("Languages: [English, German, French] ");
        String language = input.next();
        //If language = any of these, collect input and move to salary method
        if(language.equals("English,French")||language.equals("English,German")||language.equals("English,Spanish")) {
            System.out.println("Please wait..........");
            System.out.println("Proposed salary: N ");
            salary = input.nextInt();
            salary();
        
        } else if(language.equals("English")||language.equals("German")||language.equals("Spanish")||language.equals("French")) {
            System.out.println("Invalid");  
            //If not move to intro method
            intro();
        }//End if if statement
    }//End of method
   
    
    private static void salary() {
        //Conditions for salary
            if(salary <= 20000) {
                System.out.println("Congratulations you have gotten the job!!!");
            }
            else if (salary > 20000) {
                System.out.println("Invalid");  
                intro();
            }
    }//End of method
    
}//End of class



           
       
     
     
     

    
        
    
    

