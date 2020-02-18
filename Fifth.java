//Q5. Find common elements between two arrays.
package com.company;
import java.util.Arrays;

public class Fifth {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 5, 4, 2, 99, 99, 4, 1, 2, 9};
        int arr2[] = {2, 5, 3, 0, 1};
        Arrays.sort(arr1);
        System.out.println("common elements are : ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && i + 1 < arr1.length && arr1[i] != arr1[i + 1])
                    System.out.println(arr1[i]);

                else if (arr1[i] == arr2[j] && i == arr1.length - 1) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}


//    public static boolean BinarySearch(int[] arr, int key) {
//        int low = 0;
//        int high = arr.length - 1;
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            if (arr[mid] == key) {
//                return true;
//            } else if (arr[mid] > key) {
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int[] arr1 = { 1, 4, 5, 1};
//        int[] arr2 = { 6, 1, 5 };
//
//        Arrays.sort(arr1);
//        // System.out.println(Arrays.toString(arr1));
//
//        for (int i = 0; i < arr1.length - 1; i++) {
//            if (arr1[i] != arr1[i + 1]) {
//                System.out.println(arr1[i]+" "+arr1[i+1]);
//                boolean result = BinarySearch(arr2, arr1[i]);
//                if (result == true) {
//                    System.out.print(arr1[i] + " ");
//                }
//            }
//        }
//
//        if (arr1[arr1.length - 1] != arr1[arr1.length - 2]) {
//            if (BinarySearch(arr2, arr1[arr1.length - 1])) {
//                System.out.println(arr1[arr1.length - 1]);
//            }
//        }
//
//    }
















































////Q5 Find common elements between two arrays.
//
//package com.company;
//import java.util.Arrays;
//public class Fifth {
//
//    public static void main(String[] args) {
//        int[] Array1 = {1, 4, 5,1};
//        int[] Array2 = {6, 1, 8, 34, 5,4,5};
//
//        Arrays.sort(Array1);
//        for(int i=0;i<Array1.length;i++)
//        {.reverse());
//}}

//            int j=i+1;
//            public static void func(){
//            if(Array1[i]==Array1[j]){
//                j++;
//                continue inner;
//            }
//            else
//                i=j;
//
//        }
//
//    }
//}
//
//
//
//
////        for(int i=0;i<Array1.length;i++)
////        System.out.println(Array1[i]);
//
////        for(int i = 0; i < Array1.length; i++){
////            for(int j = 0; j < Array2.length; j++){
////                if(Array1[i] == Array2[j]){
////                    System.out.println(Array1[i]);
////                    break;
////                }
////            }
////        }