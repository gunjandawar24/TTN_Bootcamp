//Q8 Write a program to demonstrate the use of semaphore
import java.util.concurrent.Semaphore;

public class Ques8 extends Thread {
    private static String str;

    public static void main(String[] args) throws InterruptedException {
        str="Gunjan Dawar";
        Semaphore s = new Semaphore(1);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    s.acquire();
                    System.out.println("Available Permits: "+s.availablePermits());
                    System.out.println(Thread.currentThread().getName()+ " aquires lock");
                    Thread.sleep(1000);
                    str = "Hi,How are you ?";
                    System.out.println(str);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(Thread.currentThread().getName() + " releases the acquired semaphore.\n");
                s.release();
                System.out.println("Available Permits: "+s.availablePermits());
                System.out.println();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    s.acquire();
                    System.out.println("Available Permits: "+s.availablePermits());
                    System.out.println(Thread.currentThread().getName()+ " aquires lock");
                    Thread.sleep(1000);
                    str = "I am good..";
                    System.out.println(str);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(Thread.currentThread().getName() + " releases the acquired semaphore.\n");
                s.release();
                System.out.println("Available Permits: "+s.availablePermits());
                System.out.println();
            }
        });
        t1.start();
        t2.start();
    }
}