//Ques1 : Write the following a functional interface and implement it using lambda:
//
//    (1) First number is greater than second number or not             Parameter (int ,int ) Return boolean
//    (2) Increment the number by 1 and return incremented value        Parameter (int) Return int
//    (3) Concatination of 2 string                                     Parameter (String , String ) Return (String)
//    (4) Convert a string to uppercase and return .                     Parameter (String) Return (String)

@FunctionalInterface
interface myinterface{
    boolean comparison(int n1,int n2);
}

@FunctionalInterface
interface modify{
    int modify(int n1);
}

@FunctionalInterface
interface concat{
    String concatenation(String str1,String str2);
}

@FunctionalInterface
interface upper{
    String convertupper(String str);
}

public class Ques1 {

    public static void main(String[] args) {

        myinterface m1 = (int n1, int n2) -> {
            if (n1 > n2)
                return true;
            else
                return false;
        };
        System.out.println("Is first number greater than second number: "+m1.comparison(2, 3));


        modify m2 = (int n1) -> {
            n1 = n1 + 1;
            return n1;
        };
        System.out.println("After increment by 1, the number is: "+m2.modify(4));

        concat c1 = (String str1, String str2) -> {
            String strconcat = str1 + str2;
            return strconcat;
        };
        System.out.println("Concatenation of two string is : "+c1.concatenation("gunjan ", "dawar"));


        upper u1 = (String str) -> {
            str = str.toUpperCase();
            return str;
        };
        System.out.println("Converting string to upper case : "+u1.convertupper("gunjan"));

    }
}






