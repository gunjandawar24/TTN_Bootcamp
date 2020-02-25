//Ques7 Override the default method of the interface

interface default_inter{
    default void display(){
        System.out.println("Inside default method");
    }
}
public class Ques7 implements default_inter{
            @Override
            public void display() {
            System.out.println("Overriding interface default method");
            }
    }

class Main1{
    public static void main(String[] args) {
        Ques7 q7=new Ques7();
        q7.display();
    }
}
