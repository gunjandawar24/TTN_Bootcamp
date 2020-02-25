package Ques6;

interface inter2{

    static void display1(){
        System.out.println("Inside Static Method.... ");
    }
}

class Ques6_static implements inter1 {

    public static void main(String[] args) {
        inter2.display1();

    }
}
