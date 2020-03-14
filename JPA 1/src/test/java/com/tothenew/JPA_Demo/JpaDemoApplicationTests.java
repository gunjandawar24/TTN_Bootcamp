package com.tothenew.JPA_Demo;

import com.tothenew.JPA_Demo.employeeEntities.EmpRepo;
import com.tothenew.JPA_Demo.employeeEntities.Employee;
import com.tothenew.JPA_Demo.employeeEntities.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class JpaDemoApplicationTests {


    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmpRepo empRepo;

    @Test
    public void contextLoads() {

    }

    //Ques 3 Perform Create Operation on Entity using Spring Data JPA
    @Test
    public void testCreate() {
		Employee employee=new Employee();
		employee.setName("Gunjan");
		employee.setAge(22);
		employee.setLocation("Delhi");

		System.out.println(employeeRepository.save(employee));

		Employee employee1=new Employee();
		employee1.setName("Gaurav");
		employee1.setAge(24);
		employee1.setLocation("Gurgaon");
		System.out.println(employeeRepository.save(employee1));

        Employee employee2 = new Employee();
        employee2.setName("Ayush");
        employee2.setAge(30);
        employee2.setLocation("Gk");

        System.out.println(employeeRepository.save(employee2));

        Employee employee3 = new Employee();
        employee3.setName("Akash");
        employee3.setAge(35);
        employee3.setLocation("GTB Nagar");

        System.out.println(employeeRepository.save(employee3));
    }

    //Ques5 Perform Read Operation on Entity using Spring Data JPA
    @Test
    public void testRead() {
        Optional<Employee> emp = employeeRepository.findById(1);
        if (emp.isPresent())
            System.out.println(emp.get());

    }

    //Ques4 Perform Update Operation on Entity using Spring Data JPA
    @Test
    public void testUpdate() {
        Employee emp = employeeRepository.findById(1).get();
        emp.setName("Gaurav");
        employeeRepository.save(emp);

    }

    //Ques5 Perform Delete Operation on Entity using Spring Data JPA
    @Test
    public void testDelete() {
        employeeRepository.deleteById(3);
    }

    //Ques6 Get the total count of the number of Employees
    @Test
    public void testCount() {
        System.out.println("Total no of rows are >>>>> " + employeeRepository.count());
    }

    //Ques8 Create and use finder to find Employee by Name
    @Test
    public void testfindByName() {
        List<Employee> emp = employeeRepository.findByName("Bhawna");
        System.out.println(">>>>>>>>>>>>>");
        System.out.println(emp);
        System.out.println(">>>>>>>>>>>>>");

    }

    //Ques9 Create and use finder to find Employees starting with A character
    @Test
    public void testfindByCharacter() {
        List<Employee> emp = employeeRepository.findByNameLike("A%");
        System.out.println(">>>>>>>>>>>>>");
        System.out.println(emp);
        System.out.println(">>>>>>>>>>>>>");
    }

    //(7) Implement Pagination and Sorting on the bases of Employee Age
    @Test
    void testPaging() {
        
        Pageable pageable = PageRequest.of(0, 3, Sort.by(Sort.Direction.DESC,"age"));
        Page<Employee> page = empRepo.findAll(pageable);
        page.forEach(p -> System.out.println(p.getAge()));
    }

    //Ques10 Create and use finder to find Employees Between the age of 28 to 32
    @Test
    public void testfindAgeBetween() {
        List<Employee> emp = employeeRepository.findByAgeBetween(28, 32);
        System.out.println(">>>>>>>>>>>>>");
        System.out.println(emp);
        System.out.println(">>>>>>>>>>>>>");
    }
}



