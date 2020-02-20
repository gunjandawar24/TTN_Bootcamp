//3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
//ClassNotFoundException is an exception that occurs when you try to load a class at run time using Class.forName() or loadClass() methods and mentioned classes are not found in the classpath.
// NoClassDefFoundError is an error that occurs when a particular class is present at compile time, but was missing at run time.

public class Ques3 {
    public static void main(String[] args) {

        Q3_a q = new Q3_a();
        q.hello();
        try
        {
            Class.forName("Ques14");
        }
        catch(ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}
class Q3_a {
    //If this class is deleted now the it will give NoClassDefFoundError.......
    void hello()
    {
        System.out.println("This is a class");
    }
}

