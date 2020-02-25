//Q10 Sum all the numbers greater than 5 in the integer list.

import java.util.Arrays;
import java.util.List;

public class Ques10 {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Sum all the numbers greater than 5 in the integer list -"+l1+" is : "+
                l1
                    .stream()
                    .filter(e->e>5)
                     .mapToInt(e->e)
                        .sum()

        );
    }
}
