package com.bootcamp.JPA.Part2.repositry;

import com.bootcamp.JPA.Part2.entities.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>, PagingAndSortingRepository<Employee,Integer> {

    //Ques1 Display the first name, last name of all employees having salary greater than average salary ordered in ascending by their age and in descending by their salary.
    @Query("select firstname,lastname from Employee where salary>(select avg(salary) from Employee)order by salary desc,age asc")
    List<Object[]> findEmployeeHavingSalaryGTaverage();
    
    //Ques2 Update salary of all employees by a salary passed as a parameter whose existing salary is less than the average salary.
    @Query("select avg(salary) from Employee")
    Integer findAvgSalary();
    
    @Transactional
    @Modifying
    @Query("update Employee set salary=:salary where salary < :sal")
    void updateSalary(@Param("salary") Integer salary,@Param("sal") Integer sal);

    
//    Ques3 Delete all employees with minimum salary.
    
    //Finding min salary
    @Query("select min(salary) from Employee")
    Integer minSalary();
    
    @Modifying
    @Transactional
    @Query("delete from Employee where salary=:min_sal")
    void deleteEmployee(@Param("min_sal") Integer min_sal);
    
    
    //******************Native SQL Query:******************************************
    
//	Ques1 Display the id, first name, age of all employees where last name ends with "singh"
    @Query(value="select empid,empage,empfirstname from employee where emplastname like '%singh' ",nativeQuery = true)
    List<Object[]> findEmployeeNQ();

    //Ques2 Delete all employees with age greater than 45(Should be passed as a parameter)
    @Modifying
    @Transactional
    @Query(value = "delete from employee where empage>:age ",nativeQuery = true)
    void deleteEmpAgeGT45(@Param("age")Integer age);
    
    
    
//    ******************************** PRACTICE***********************************************
    
    //First JPQL
    @Query("from Employee")
    List<Employee> findAllEmployees();

    //Partial Data-will return object data not list
    @Query("select firstname,lastname from Employee")
    List<Object[]> findAllEmployeesParitalData();

    //Using Named Parameter
    @Query("from Employee where firstname=:firstname")
    List<Employee> findAllEmployeebyFirstName(@Param("firstname") String firstname);

    //USing Find By Particular Field
    @Query("from Employee where salary>:min and salary<:max")
    List<Employee> findEmployeeForGivenSalary(@Param("min") int min,@Param("max") int max);

    //NOon-Select Operations Like Dml Statement(insert,update,delete)
    @Modifying
    @Query("delete from Employee where firstname=:firstname")
    void deleteEmployeeByFirstName(@Param("firstname") String firstname);

    //implementing paging and Sorting
    @Query("from Employee")
    List<Employee> findAllEmployeesPaging(Pageable pageable);

//    *****************************NATIVE SQL***********************************

    //implementing native query ,bydefault it is false(and treated as JPQL Query) if not provide nativeQuery attribute then spring data will treat it as JPQL
    @Query(value = "select * from Employee",nativeQuery = true)
    List<Employee> findAllEmployeeNQ();

    //Passing named parameters using NQ  -
    @Query(value = "select * from employee where empfirstname=:firstname",nativeQuery = true)
    List<Employee> findByfirstnameNQ(@Param("firstname")String firstname);



}
