//Write a program to find the number of occurrences of the duplicate words in a string and print them ?
package com.company;

public class Second {
    public static void main(String[] args) {
        String str = "one one two two one two one";
        String[] words = str.split(" ");
        int wc = 1;

        for (int i = 0; i < words.length; i++) {

            for (int j = i+1; j < words.length; j++) {

                if(words[i].equalsIgnoreCase(words[j]) && words[i]!="0")
                {
                    wc = wc + 1;
                    words[j] = "0";
                }
            }
            if (wc > 1) {
                System.out.println(words[i]+"--"+wc);
                wc=1;
            }

        }
    }
}
