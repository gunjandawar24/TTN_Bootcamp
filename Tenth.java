//Q10.Write a single program for following operation using overloading
//  A) Adding 2 integer number
//  B) Adding 2 double
//  C) multiplying 2 float
//  D) multiplying 2 int
//  E) concate 2 string
//  F) Concate 3 String

package com.company;

public class Tenth {

    public int add(int a,int b){ return a+b; }
    public double add(double a, double b)
    {
        return a+b;
    }

    public float multiply(float a, float b)
    {
            return a*b;
    }
    public int multiply(int a, int b) { return a*b; }

    public String  concat(String str1,String str2)
    {
        return str1+str2;
    }
    public String concat(String str1,String str2,String str3)
    {
        return str1+str2+str3;

    }

    public static void main(String[] args) {
        Tenth obj=new Tenth();
        System.out.println("Adding 2 Integer Numbers : " +obj.add(5,5));
        System.out.println("Adding Two double values: " +obj.add(4.82324,2.24124));
        System.out.println("Multiplying two float values : " + obj.multiply(12.7f,26.5f));
        System.out.println("Multiplying two integer values : " +obj.multiply(10,10));
        System.out.println("Concatenating two strings : " + obj.concat("Gunjan ","Dawar"));
        System.out.println("Concatenating three strings : " +obj.concat("how ","are ","you "));

    }
}