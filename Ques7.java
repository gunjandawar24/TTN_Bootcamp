//Q7 Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.

import java.util.*;

public class Ques7  {

    public static void main(String[] args) {
        int[] array={1,2,3,2,3,3,4,4};
        HashMap<Integer,Integer> hashMap=new HashMap();
        for (int i=0;i<array.length;i++){
            if(hashMap.containsKey(array[i])){
                hashMap.put(array[i],hashMap.get(array[i])+1);
            }
            else {
                hashMap.put(array[i],1);
            }
            }
            List list=new LinkedList(hashMap.entrySet());
            CompareTo cmpr=new CompareTo();
            Collections.sort(list,cmpr);
            System.out.println(list);

        }
    }

    class CompareTo implements Comparator{

        @Override
        public int compare(Object o1, Object o2) {
            return -((Comparable) ((Map.Entry) (o1)).getValue())
                    .compareTo(((Map.Entry) (o2)).getValue());
        }
    }