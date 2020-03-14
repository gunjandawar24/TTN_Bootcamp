package com.tothenew.JPA_Demo.employeeEntities;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmpRepo extends PagingAndSortingRepository<Employee,Integer> {
    Page<Employee> findAll(Pageable pageable);

}
