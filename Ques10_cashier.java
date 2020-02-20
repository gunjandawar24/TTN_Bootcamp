package Ques10;
import java.util.LinkedList;
import java.util.Queue;

public class Ques10_cashier {
    public static Queue<String> Q=new LinkedList<>();
    static void add(String coffee) {
        Q.add(coffee);
        System.out.println("Order placed !, Your Order no. is : " + Q.size());
        Ques10_Barista.prepration();
    }
    }
