//1. Create Java classes having suitable attributes for Library management system.
// Use OOPs concepts in your design.Also try to use interfaces and abstract classes.

        package Ques1;

public class Library extends Person {

    public static void main(String[] args) {
        Person p1=new Person();

        p1.Name="Gunjan Dawar";

        System.out.println("Student Name :"+p1.Name+"\nBook_name: "+p1.bookName("The Fault In Our Stars")+"\nAuthor Name: "+p1.authorName("John Michael Green "));
        System.out.println("Issued on : "+p1.issue_on("3-feb-2020")+" till "+p1.issue_till("7")+" days.");
    }
}
