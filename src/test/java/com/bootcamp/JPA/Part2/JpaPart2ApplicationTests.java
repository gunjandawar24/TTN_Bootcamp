package com.bootcamp.JPA.Part2;

import com.bootcamp.JPA.Part2.embedding.EmployeeDetails;
import com.bootcamp.JPA.Part2.embedding.EmployeeDetailsRepo;
import com.bootcamp.JPA.Part2.embedding.Salary;
import com.bootcamp.JPA.Part2.entities.Check;
import com.bootcamp.JPA.Part2.entities.CreditCard;
import com.bootcamp.JPA.Part2.entities.Employee;
import com.bootcamp.JPA.Part2.repositry.EmployeeRepository;
import com.bootcamp.JPA.Part2.repositry.PaymentRep;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Rollback;


import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
class JpaPart2ApplicationTests {

//    *********************** JPQL *************************************
    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    public void create(){
        Employee employee=new Employee();
        employee.setFirstName("Gunjan");
        employee.setLastName("Dawar");
        employee.setAge(25);
        employee.setSalary(12000);

        employeeRepository.save(employee);
        
        Employee employee1=new Employee();
        employee1.setFirstName("Kartik");
        employee1.setLastName("kumar");
        employee1.setAge(48);
        employee1.setSalary(15000);

        employeeRepository.save(employee1);
        
        Employee employee2=new Employee();
        employee2.setFirstName("Pulkit");
        employee2.setLastName("Kathuria");
        employee2.setAge(35);
        employee2.setSalary(18000);

        employeeRepository.save(employee2);
        
        Employee employee3=new Employee();
        employee3.setFirstName("Gaurav");
        employee3.setLastName("Dawar");
        employee3.setAge(38);
        employee3.setSalary(22000);

        employeeRepository.save(employee3);
        
        Employee employee4=new Employee();
        employee4.setFirstName("balpreet");
        employee4.setLastName("singh");
        employee4.setAge(32);
        employee4.setSalary(33000);

        employeeRepository.save(employee4);
    }

    //Ques1 Display the first name, last name of all employees having salary greater than average salary ordered in ascending by their age and in descending by their salary.
    @Test
    public void findEmployeeQues1(){
        List<Object[]> employee=employeeRepository.findEmployeeHavingSalaryGTaverage();
        for (Object[] objects:employee) {
            System.out.println(objects[0]+" "+objects[1]);
        }
    }
    
    //Ques2 Update salary of all by a salary passed as a parameter whose existing salary is less than the average salary.
    @Test
    public  void testAvgSalary(){
        System.out.println(employeeRepository.findAvgSalary());
    }

    @Test
    public void UpdateSalary(){
        Integer sal=employeeRepository.findAvgSalary();
       employeeRepository.updateSalary(23000,sal);
        System.out.println(employeeRepository.findAllEmployees());
    }
    
    
    
    //Ques3 Delete all employees with minimum salary.
    @Test
    public void minSalary(){
        System.out.println(employeeRepository.minSalary());
    }
    
    @Test
    public void deleteEmployee(){
        Integer minSal=employeeRepository.minSalary();
        employeeRepository.deleteEmployee(minSal);
        System.out.println(employeeRepository.findAllEmployees());
    }

    //******************Native SQL Query:******************************************

//    Ques1 Display the id, first name, age of all employees where last name ends with "singh"
    @Test
    public void findEmployeesNQ(){
        List<Object[]> details=employeeRepository.findEmployeeNQ();
        for (Object[] objects:details) {
            System.out.println("Id : "+objects[0]+", Age : "+objects[1]+", Name : "+objects[2]);
            
        }
    }
    
    //Ques2 Delete all employees with age greater than 45(Should be passed as a parameter)
    @Test
    public void deleteEmpAge(){
        employeeRepository.deleteEmpAgeGT45(45);
        System.out.println(employeeRepository.findAllEmployees());
    }

    //    *****************************Inheritance Mapping**********************************


    @Autowired
    PaymentRep paymentRep;

    @Test
    public void createCCPayment() {
        CreditCard creditCard = new CreditCard();
        creditCard.setAmount(2222);
        creditCard.setCardnumber("2222");
        paymentRep.save(creditCard);

    }

    @Test
    public void createCHPayment(){
        Check check=new Check();
        check.setAmount(2000);
        check.setChecknumber("1111");
        paymentRep.save(check);
    }




    //****************************Component Mapping **************************************

    @Autowired
    EmployeeDetailsRepo employeeDetailsRepo;

    @Test
    public void testCreate(){
        EmployeeDetails employeeDetails=new EmployeeDetails();

        employeeDetails.setFirstname("Pulkit");
        employeeDetails.setLastname("Kathuria");
        employeeDetails.setAge(23);
        Salary salary=new Salary();
        salary.setBasicSalary(800000);
        salary.setBonusSalary(50000);
        salary.setSpecialAllowanceSalary(10000);
        salary.setTaxAmount(3000);

        employeeDetails.setSalary(salary);

        employeeDetailsRepo.save(employeeDetails);

    }

    
    
    
//    ***********************Practice***********************************
    
    //Slides
	@Test
    public void findAll(){
        System.out.println(employeeRepository.findAllEmployees());
    }


    @Test
    public void partialData(){
        List<Object[]> partialData=employeeRepository.findAllEmployeesParitalData();
        for(Object[] objects:partialData){
            System.out.println(objects[0]);
            System.out.println(objects[1]);
        }
    }

    //Named Parameter:
    @Test
    public void findAllEmployeeParam(){
        System.out.println(employeeRepository.findAllEmployeebyFirstName("Gunjan"));
    }

    //Using Find
    @Test
    public void findAllEmployeeSakaryBetween(){
        System.out.println(employeeRepository.findEmployeeForGivenSalary(10000,13000));
    }

    //Non-Select
    @Test
    @Transactional  //bcz DML
    @Rollback(false) //bcz from databse se delete krne k liye (only use in Junit Tests),if not use this it will not delete from database.
    public void deleteFromEmployee(){
        employeeRepository.deleteEmployeeByFirstName("bhawna");
    }

    //Implementing PAging And Sorting
    @Test
    public void findAllEmployees(){
        Pageable pageable = PageRequest.of(0, 4, Sort.Direction.ASC,"firstname");
        System.out.println(employeeRepository.findAllEmployeesPaging(pageable));
    }

    //NativeQuery
    @Test
    public void findAllEmployeesNQ(){
        System.out.println(employeeRepository.findAllEmployeeNQ());
    }

    //NamedParameter Using NQ
    @Test
    public void findAllEmployeeParamNQ(){
        System.out.println(employeeRepository.findByfirstnameNQ("Gunjan"));
    }
}
