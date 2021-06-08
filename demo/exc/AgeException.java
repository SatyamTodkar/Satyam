package com.cg.demo.exc;

import java.util.Scanner;

public class AgeException {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        try{
        	if (age<21)
            System.out.println("Too young to get married");
        	else if (age>90)
        		System.out.println("Too old to get married");
        	else
        	 System.out.println("You can register on matrimony site");
        	
        } 
        
        finally
        { 
            	System.out.println();
            	System.out.println("XYZmatrimony.com");
            	System.out.println();
            	
        }
        sc.close();
        
    }
}
