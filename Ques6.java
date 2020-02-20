//6. WAP showing try, multi-catch and finally blocks.

public class Ques6 {

    public static void main(String[] args)throws ArithmeticException,ArrayIndexOutOfBoundsException {
        int a[]={1,2,3,4};
        try
        {
            int A=0;
            int B=5;
            //int C =B/A;
            for(int i=0; i<9;i++)
            {
                System.out.println(a[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(ArithmeticException a1)
        {
            System.out.println(a1);
        }
        catch(Exception e1){
            System.out.println(e1);
        }
        finally{
            System.out.println("Execution is over");
        }
    }
}
