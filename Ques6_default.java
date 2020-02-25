//Q6 Create and access default and static method of an interface.

package Ques6;

interface inter1{
    default void display(){
        System.out.println("Inside default method..");
    }
}

public class Ques6_default implements inter1 {

        public static void main(String[] args) {
            Ques6_default a1=new Ques6_default();
            a1.display();

        }
}


