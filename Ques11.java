//Q11 Find average of the number inside integer list after doubling it.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques11 {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Average of the number inside integer list -"+l1+" after doubling it is : "+
                l1
                        .stream()
                        .collect(Collectors.averagingDouble(e->e*2))

        );
    }
}
