//Q2 Write a program to create a thread using Thread class and Runnable interface each.
package Ques2;

class Runner_Q2 extends Thread {

    @Override
    public void run() {
            System.out.println("Starting thread by extending Thread class... ");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
 class Main {

    public static void main(String[] args) {
        Runner_Q2 runner1 = new Runner_Q2();
        runner1.start();

//        Runner_Q2 runner2 = new Runner_Q2();
//        runner2.start();
        Runner1_Q2 q=new Runner1_Q2();
        Thread t1 = new Thread(q);
        t1.start();

    }
}