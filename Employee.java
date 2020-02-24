//Q5 Write a program to sort Employee objects based on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    String name = "";
    double salary = 0.0;
    double age = 0.0;

    Employee(String name, double salary, double age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return "Employee Name : " + name + ", Salary : " + salary + ", Age : " + age +"\n";
    }

}


class Mycomp implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.salary - o2.salary);
    }
}


class Test {

    public static void main(String[] args) {
        Employee e1 = new Employee("Gunjan", 12000, 20);
        Employee e2 = new Employee("Ankur", 8000, 23);
        Employee e3 = new Employee("Ramesh", 10000, 20);
        Employee e4 = new Employee("Karan", 2000, 26);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        System.out.println("Before Sorting");
        System.out.println(employees);
        Collections.sort(employees, new Mycomp());
        System.out.println("After Sorting");
        System.out.println(employees);

    }

}