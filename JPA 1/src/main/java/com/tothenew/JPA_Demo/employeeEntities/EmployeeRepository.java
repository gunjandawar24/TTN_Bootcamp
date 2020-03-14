//Ques(2) Set up EmployeeRepository with Spring Data JPA
package com.tothenew.JPA_Demo.employeeEntities;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

    List<Employee> findByName(String name);

    List<Employee> findByNameLike(String name);

    List<Employee> findByAgeBetween(Integer age1,Integer age2);


}