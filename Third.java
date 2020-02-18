//Write a program to find the number of occurrences of a character in a string without using loop?
package com.company;

import java.util.Scanner;

public class Third {

    public static void main(String[] args) {

        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        System.out.println("Enter the character to search : ");
        String x=sc.nextLine();
        count=str.length()-str.replace(x,"").length();
        System.out.println("Number of occurence of " +x+ " is " +count);



    }
}
