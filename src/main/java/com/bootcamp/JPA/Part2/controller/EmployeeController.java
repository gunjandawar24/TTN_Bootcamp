package com.bootcamp.JPA.Part2.controller;

import com.bootcamp.JPA.Part2.entities.Employee;
import com.bootcamp.JPA.Part2.repositry.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/create")
    public void createEmployee(){
        Employee employee=new Employee();
        employee.setFirstName("Gunjan");
        employee.setLastName("Dawar");
        employee.setAge(22);
        employee.setSalary(10000);

        employeeRepository.save(employee);
    }
}
