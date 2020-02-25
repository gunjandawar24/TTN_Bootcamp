//Q5 Implement following functional interfaces from java.util.function using lambdas:
//
//        (1) Consumer
//
//        (2) Supplier
//
//        (3) Predicate
//
//        (4) Function

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Ques5 {

    static void print(String name){
        System.out.println("Hello "+name);
    }

    public static void main(String[] args) {

        //Consumer Functional Interaface:
        Consumer<String> consumer1 = (String s)-> { System.out.println("Implementing Consumer Functional Interface: "+s); };
        consumer1.accept("John");

        //Supplier Functional Interface"
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Implementing Supplier Functional Interface: "+randomValue.get());

        //Predicate Functional Interface
        Predicate<Integer> lesserthan = i -> (i < 18);
        System.out.println("Implementing Pedicate Functional Interface: "+lesserthan.test(10));

        //Function Functional Interafce:
        Function<Integer, Double> half = a -> a / 2.0;
        System.out.println("Implementing Function Functional Interface : "+half.apply(10));
    }

}
