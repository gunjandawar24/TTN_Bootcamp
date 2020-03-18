package com.bootcamp.JPA.Part2.embedding;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeDetailsRepo extends CrudRepository<EmployeeDetails,Integer> {
    
}
