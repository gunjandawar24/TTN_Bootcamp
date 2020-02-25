//Ques4 Create an Employee Class with instance variables (String) name, (Integer)age, (String)city
// and get the instance of the Class using constructor reference


interface constRef{
    Ques4_Employee details(String name,int age,String city);
}
public class Ques4_Employee {

    String name;
    int age;
    String city;

    Ques4_Employee(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;

    }

    void printdetails() {
        System.out.println("NAME: "+name + "   AGE: " + age + "  CITY: " + city + " ");

    }
}

  class Main{
    public static void main(String[] args) {
        constRef c1=Ques4_Employee::new;
        Ques4_Employee  employee1 = c1.details("gunjan",12,"delhi");
        employee1.printdetails();

    }
}

