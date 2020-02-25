//Q3 Using (instance) Method reference create and apply add and subtract method and
// using (Static) Method reference create and apply multiplication method for the functional interface created.


interface arithmetic_operation{
    int operation(int n1,int n2);
}

public class Ques3 {

    int add(int n1,int n2)
    {
        int sum=n1+n2;
        return sum;
    }
    int subtract(int n1,int n2){
        int diff=n1-n2;
        return diff;
    }

    static int multiplication(int n1,int n2){
        int mul=n1*n2;
        return mul;

    }

    public static void main(String[] args) {

        arithmetic_operation a1=new Ques3()::add;
        System.out.println(("Addition of two numbers is : "+a1.operation(1,2)));

        arithmetic_operation s1=new Ques3()::subtract;
        System.out.println(("Subtraction of two numbers is : "+s1.operation(3,2)));

        arithmetic_operation a3=Ques3::multiplication;
        System.out.println("Multiplication of two numbers is : "+a3.operation(3,3));

    }
}
