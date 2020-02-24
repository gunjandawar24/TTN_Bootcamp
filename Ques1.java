//Q1 Write Java code to define List .
// Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ques1 {

    public static void main(String[] args) {

        List<Float> l1 = new ArrayList<Float>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 Floating Numbers: ");
           for (int i = 0; i < 5; i++) {

                    float f=sc.nextFloat();
                    l1.add(f);
                }
                Iterator<Float> i1=l1.iterator();
                float sum=0;
                while (i1.hasNext()){
                    sum=i1.next()+sum;
                }
                System.out.println("Sum of the numbers in list = "+sum);
            }
}
