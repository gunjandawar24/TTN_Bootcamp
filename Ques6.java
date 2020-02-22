//Ques6 Write a program to demonstrate sleep and join methods.

public class Ques6 implements Runnable
{
        //Thread t;
        public void run()
        {
            for (int i = 0; i < 4; i++)
            {
                System.out.println(Thread.currentThread().getName()+ " : " + i);
                try
                {
                    Thread.sleep(1000);
                }

                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
        }

        public static void main(String[] args) throws Exception {

            Thread t = new Thread(new Ques6());
            t.start();
            t.join();
            System.out.println();
            Thread t2 = new Thread(new Ques6());
            t2.start();

        }
}
