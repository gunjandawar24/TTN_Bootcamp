package Ques10;

public class Ques10_Barista {
    public static void prepration() {
        System.out.println("Please wait until your Order gets ready...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Order is ready...");
        Ques10_cashier.Q.remove();
        Ques10_customer.ready();
    }
}
