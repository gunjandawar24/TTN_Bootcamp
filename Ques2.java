//Q2 Write a method that takes a string and returns the number of unique characters in the string.
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ques2 {

    public static void main(String[] args) {

        System.out.print("Enter the String: ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        Set<Character> characters=new LinkedHashSet<Character>();

        for (int i=0;i<s.length();i++){
            characters.add(s.charAt(i));
        }

//        System.out.println("Unique Characters in a string are : ");
//        for (Character elt:characters)
//            System.out.println(elt);

        System.out.println("Unique characters in "+s+" are : "+characters);
    }
}

