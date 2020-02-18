//Q8. Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer
package com.company;

import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {

    StringBuilder str1 = new StringBuilder("Gunjan Dawar");
    System.out.print("Reversed string is:");
    System.out.println(str1.reverse());
    str1.delete(4,9);
    System.out.println("String after deleting characters from index 4 to index 9: "  +str1);

}
}

