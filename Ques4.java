//Q4 Write a program to sort HashMap by value.

import java.util.*;
import java.lang.*;

public class Ques4 {

        public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
        {
            // Create a list from elements of HashMap
            List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

            // Sort the list
            Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
                {
                    return (o1.getValue()).compareTo(o2.getValue());
                }
            });

            // putting data from sorted list to hashmap
            HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
            for (Map.Entry<String, Integer> aa : list) {
                temp.put(aa.getKey(), aa.getValue());
            }
            return temp;
        }


        public static void main(String[] args)
        {
            HashMap<String, Integer> hm = new HashMap<String, Integer>();
            hm.put("Climate", 9);
            hm.put("Entertainment", 7);
            hm.put("Sports", 2);
            hm.put("Politics", 3);
            hm.put("Business", 5);
            hm.put("World", 1);

            Map<String, Integer> hm1 = sortByValue(hm);

            // print the sorted hashmap
            for (Map.Entry<String, Integer> en : hm1.entrySet()) {
                System.out.println("Key = " + en.getKey() + ", Value = " + en.getValue());
            }
        }
}
