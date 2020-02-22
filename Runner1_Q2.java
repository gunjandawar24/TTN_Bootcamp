package Ques2;

public class Runner1_Q2 implements Runnable {

        @Override
        public void run() {

                System.out.println("Starting Thread by implementing Runnable Interface.... ");


                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }

}
