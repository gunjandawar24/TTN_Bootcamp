//Q7 Run a task with the help of callable and store it's result in the Future.
import java.util.concurrent.*;

public class Ques7 {

    public static void main(String[] args) {

        ExecutorService executorService= Executors.newCachedThreadPool();
        Future<Integer> future=executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 1; i <= 5; i++) {
                    sum += i;
                }
                return sum;
            }
        });
        executorService.shutdown();
        try{
            System.out.println("Final result of Addition of first 5 Integers is : "+future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}