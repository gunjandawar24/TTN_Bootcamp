//Q2 Create a functional interface whose method takes 2 integers and return one integer.

@FunctionalInterface
interface secondinterface{
    int display(int n1,int n2);

}
public class Ques2 {
    public static void main(String[] args) {
        secondinterface m1=(int n1, int n2)-> {
                n1=n1+n2;
                return n1;
            };
        System.out.println("Addidtion of two integers is : "+m1.display(4,5));
        }
    }
