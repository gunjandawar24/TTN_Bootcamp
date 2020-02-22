//Q9 Write a program to demonstrate the use of CountDownLatch

import java.util.concurrent.CountDownLatch;
public class Ques9 extends Thread{
    CountDownLatch count;
    Ques9(CountDownLatch count){
        this.count=count;
    }
    @Override
    public void run(){
        System.out.println("Starting...");
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        count.countDown();
    }
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch count = new CountDownLatch(2);
        Ques9 ques9=new Ques9(count);
        Thread t1=new Thread(ques9);
        Thread t2=new Thread(ques9);
        t1.start();
        t2.start();
        count.await();
    }
}