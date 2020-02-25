//Q12 Find the first even number in the integer list which is greater than 3.

import java.util.Arrays;
import java.util.List;

public class Ques12 {

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("First even number in the integer list 0 "+l1+" which is greater than 3 is : "+
                l1
                        .stream()
                        .filter(e -> e > 3)
                        .filter(e->e%2==0)
                        .findFirst()
                        .get()

        );
    }
}
