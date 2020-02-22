//Q5 Write a program to demonstrate wait and notify methods.

import java.util.Scanner;

public class Ques5 {

    public static void main(String[] args) throws InterruptedException {
        Processor processor=new Processor();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    processor.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    processor.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

}
    class Processor {

    public void producer() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread is running ....");
            wait();
            System.out.println("producer-Resumed ");
        }
    }

    public void consumer() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Thread.sleep(200);

        synchronized (this) {
            System.out.println("Producer thread is waiting and consumer thread started its execution..");
            System.out.println("Waiting for return key.(press any key) to stop consumer thread");
            scanner.nextLine();
            System.out.println("Return key pressed. and producer thread started its execution again");
            notify();
            Thread.sleep(500);
        }
    }
}