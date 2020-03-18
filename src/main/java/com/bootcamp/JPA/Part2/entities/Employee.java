package com.bootcamp.JPA.Part2.entities;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee
{
    @Id
    @Column(name = "empid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(name = "empfirstname")
    private String firstname;
    @Column(name = "emplastname")
    private String lastname;
    @Column(name = "empsalary")
    private Integer salary;
    @Column(name = "empage")
    private  Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}