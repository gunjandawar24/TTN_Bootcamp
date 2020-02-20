//9.  Design classes having attributes for furniture where there are wooden chairs and tables, metal chairs and tables.
// There are stress and fire tests for each products.

package Ques9;

public class Ques9_a {
    public static void main(String[] args) {
        Ques9_chair ch = new Ques9_chair("wooden", true, true);
        Ques9_table tb = new Ques9_table("metal", true, true);
        System.out.println("For CHAIR--");
        System.out.println("Type is: "+ch.type);
        System.out.println("Stress test : "+ch.checkStress());
        System.out.println("Fire test : "+ch.checkfire());
        System.out.println("*********************************");
        System.out.println("For TABLE--");
        System.out.println("Type is: "+tb.type);
        System.out.println("Stress test: "+tb.checkfire());
        System.out.println("Fire test: "+tb.checkStress());
    }
}
