//2. WAP to sorting string without using string Methods?.

import java.util.Arrays;
public class Ques2 {

    public static void main(String[] args)
    {
        String str = "cdba";

        char arr[] = str.toCharArray();

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
//    public static void main(String[] args) {
//        String str = "dcba";
//        char arr[] = str.toCharArray();
//        Arrays.sort(arr);
//        String output = new String(arr);
//        System.out.println(output);
//    }
