//Q4 Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String

package com.company;

import java.util.Scanner;

public class Fourth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String(containing lowercase,uppercase,digits and special characters : ");
        String str = sc.nextLine();
        int totalchar=str.length();
        int lowercase=0;
        int uppercase=0;
        int spclchar=0;
        int digits=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
             if (ch>='A'&&ch<='Z') {
                uppercase++;
             }
             else if (ch>='a'&&ch<='z') {
                lowercase++;
             }
             else if(ch>='0'&&ch<='9'){
                digits++;
             }
             else{
                spclchar++;
            }
        }
        System.out.println("Total number of characters: "+totalchar);
        System.out.println("Number of Lower case letters: "+lowercase);
        System.out.println("Percentage of lower case letters: "+(lowercase*100)/totalchar);
        System.out.println("Number of Uppercase letters: "+uppercase);
        System.out.println("Percentage of upper case letters :"+(uppercase*100)/totalchar);
        System.out.println("Number of Digits: "+digits);
        System.out.println("Percentage of Digits: "+(digits*100)/totalchar);
        System.out.println("Number of special Characters: "+spclchar);
        System.out.println("Percentage of Special Characters :"+(spclchar*100)/totalchar);
    }
}
