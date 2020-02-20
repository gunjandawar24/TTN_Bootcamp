package Ques13;

class InvalidAgeException extends Exception{

    InvalidAgeException(String s){
       super(s);
       System.out.println("Custom Exception occured");

    }
}