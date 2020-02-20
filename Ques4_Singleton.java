//4. WAP to create singleton class.

//Singleton class means you can create only one object for the given class.
// You can create a singleton class by making its constructor as private, so that you can restrict the creation of the object.
// Provide a static method to get instance of the object,
//wherein you can handle the object creation inside the class only.

//Singleton Class
public class Ques4_Singleton {

    private static Ques4_Singleton myObj=new Ques4_Singleton();

    private Ques4_Singleton(){

    }

    public static Ques4_Singleton getInstance(){
        return myObj;
    }

    public void testMe(){
        System.out.println("Hey,Welcome to Java");
    }

    public static void main(String a[]){
        Ques4_Singleton x = getInstance();
        Ques4_Singleton y = getInstance();

        x.testMe();
        y.testMe();
    }
}