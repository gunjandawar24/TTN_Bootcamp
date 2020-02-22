//Q1  Write a program to demonstrate the use of volatile keyword.

import java.util.Scanner;

class Ques1 extends Thread {

        private  boolean running = true;

        public void run() {

            while(running) {
                System.out.println("Running.....");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void exit() {
            running = false;
        }
    }

     class Main {

        public static void main(String[] args) {
            Ques1 q1 = new Ques1();
            System.out.println("Press enter to stop the execution .");
            q1.start();

            Scanner sc=new Scanner(System.in);
            sc.nextLine();
            q1.exit();
        }

    }
