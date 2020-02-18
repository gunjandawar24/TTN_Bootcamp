//Q1. Write a program to replace a substring inside a string with other string ?

package com.company;
import java.io.*;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        String str1 = "Gunjan is frontend developer.";
        System.out.println(str1);
        String str2 = replaced(str1, "frontend", "Java");
        System.out.println(str2);
    }
    public static String replaced(String str, String from, String to){
        String [] arr = str.split(from);
        StringBuilder result = new StringBuilder();

        int i=0;
        for (i=0; i < arr.length-1 ;i++){
            result.append(arr[i]).append(to);
        }
        result.append(arr[i]);
        return result.toString();
    }
}

//OR
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the string :");
//        String str=sc.nextLine();
//        System.out.println("Enter the string to be replaced :");
//        String str1=sc.nextLine();
//        System.out.println("Enter the string to be replaced with");
//        String str2=sc.nextLine();
//        String replaceStr=str.replace(str1,str2);
//        System.out.println("Replaced String is ");
//        System.out.println(replaceStr);
//
//    }