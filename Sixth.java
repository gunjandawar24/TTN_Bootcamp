//Q6. There is an array with every element repeated twice except one. Find that element

package com.company;

public class Sixth {

    static int find(int ar[], int ar_size)
    {
        int res = ar[0];
        for (int i = 1; i < ar_size; i++)
            res = res ^ ar[i];

        return res;
    }
    public static void main (String[] args)
    {
        int ar[] = {2, 3, 5, 4, 5, 3, 4};
        int n = ar.length;
        System.out.println("Element occurring once is : " + find(ar, n));
    }
}
