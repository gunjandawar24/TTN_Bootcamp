//Q6Write a program to sort the Student objects based on Score , if the score are same then sort on First Name .
// Class Student{ String Name; Double Score; Double Age

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Mycompare implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        if (o1.score == o2.score) {
            return o1.name.compareTo(o2.name);
        } else {
            return (int) (o1.score - o2.score);
        }
    }
}

class Students {
    String name = "";
    double score = 0.0;
    double age = 0.0;

    Students(String name, double score, double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public String toString() {
        return "Employee Name : " + name + ", Score : " + score + ", Age : " + age + "\n";
    }
}

public class Ques6 {
    public static void main(String[] args) {
        Students e1 = new Students("Gunjan", 40, 20);
        Students e2 = new Students("Ramesh", 45, 23);
        Students e3 = new Students("Ankur", 45, 20);
        Students e4 = new Students("Karan", 45, 26);

        List<Students> child = new ArrayList<Students>();
        child.add(e1);
        child.add(e2);
        child.add(e3);
        child.add(e4);

        System.out.println("Before Sorting");
        System.out.println(child);
        Collections.sort(child, new Mycompare());
        System.out.println("After Sorting");
        System.out.println(child);

    }

}