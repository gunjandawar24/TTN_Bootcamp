//Q3 Write a method that takes a string and print the number of occurrence of each character characters in the string.

import java.io.*;
import java.util.*;

public class Ques3 {

    public static void main(String[] args) {

        String str="gunjandawar";
        System.out.println("String is : "+str);
        System.out.println("Occurrence of each character in a string are : ");
        ocurrence(str);
    }

    public static void ocurrence(String str){

            HashMap<Character, Integer> c1 = new HashMap<Character, Integer>();
            char[] strArray = str.toCharArray();

            for (char c : strArray) {
                if (c1.containsKey(c)) {

                    c1.put(c, c1.get(c) + 1);
                }
                else {

                    c1.put(c, 1);
                }
            }

            for (Map.Entry entry : c1.entrySet()) {
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
        }

    }


