package com.example.RestfulWebService.Employee;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Size;

public class EmployeeBean {

    private Integer id;

    @Size(min = 4,message = "Name should have atleast 4 characters")
    private String name;

    @Range(max = 50,min = 18)
    private Integer age;

    protected EmployeeBean(){

    }
    public EmployeeBean(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
