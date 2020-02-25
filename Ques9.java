//Q9 Collect all the even numbers from an integer list.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques9 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        System.out.println("All the even numbers from an integer list- "+list+" are : "+
                list.stream()
                 .filter(e->(e%2==0))
                 .collect(Collectors.toList())
        );
    }
}
