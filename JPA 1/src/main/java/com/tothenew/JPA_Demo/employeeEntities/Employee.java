//Ques1 Create an Employee Entity which contains following fields
//Name
//Id
//Age
//Location

package com.tothenew.JPA_Demo.employeeEntities;

import javax.persistence.*;

@Entity
@Table(name = "employee")   //this will only be used when you have different name in database like -@Table(name=employee)
public class Employee {

     private String name;
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;
     private Integer age;
     //@Column(name = "give attribute original name as in database table column else will give error")
     private String location;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }
}
