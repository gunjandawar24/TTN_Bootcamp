//Q4 Write a program to create a Thread pool of 2 threads where one Thread will print even numbers and other will print odd numbers.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ques4 {

    static class even implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Thread Printing even numbers: ");
            for (int i = 0; i < 10; i = i + 2) {
                System.out.println(i);
            }
        }
    }
    static class odd implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Thread printing odd numbers: ");
            for (int i = 1; i < 10; i = i + 2) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService pool= Executors.newFixedThreadPool(2);
        //Creating two tasks:
        Runnable evenR=new even();
        Runnable oddR=new odd();

        //passing the task objects to the pool to execute
        pool.execute(evenR);
        pool.execute(oddR);
        pool.shutdown();
    }
}
