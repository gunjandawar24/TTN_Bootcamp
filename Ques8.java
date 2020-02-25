//Q8 Implement multiple inheritance with default method inside interface.

interface TestInterface1{
    default void show() {
        System.out.println("Default TestInterface1");
    }
}

interface TestInterface2 {
    default void show() {
        System.out.println("Default TestInterface2");
    }
}

class Ques8 implements TestInterface1, TestInterface2 {

    // Overriding default show method
    public void show() {
        System.out.println("Hello from overridden method");
        TestInterface1.super.show();
        TestInterface2.super.show();
    }

}
class Main_8{
        public static void main(String args[])
        {
            Ques8 d = new Ques8();
            d.show();
        }
    }

