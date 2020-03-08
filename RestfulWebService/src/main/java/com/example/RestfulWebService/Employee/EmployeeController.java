package com.example.RestfulWebService.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDaoService service;

    //Ques3 GET method to retrieve list of all employees
    @GetMapping("/employees")
    public List<EmployeeBean> retrieveAllEmployees() {
        return service.findAll();
    }

    //Ques4 GET http request using path variable to get one employee
    @GetMapping("employees/{id}")
    public EmployeeBean retrieveUser(@PathVariable int id) {
        EmployeeBean employeeBean = service.findOne(id);
        //Ques6 - throwing exception for resource not found
        if (employeeBean == null)
            throw new EmpNotFoundException("id" + id);
        return employeeBean;

    }


    //Ques5 POST http request for Employee to create a new employee.
    @PostMapping("/employees")
    public ResponseEntity<Object> createEmployee(@Valid  @RequestBody EmployeeBean employeeBean) {
        EmployeeBean addemp = service.save(employeeBean);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/id")
                .buildAndExpand(addemp.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    //Ques7 DELETE http request for Employee to delete employee
    @DeleteMapping("/employees/{id}")
    public EmployeeBean deleteEmployee(@PathVariable int id) {
        EmployeeBean employeeBean = service.deleteOne(id);
        if (employeeBean == null)
            throw new EmpNotFoundException("id-" + id);
        return employeeBean;
    }

    //Ques8 PUT http request for Employee to update employee
    @PutMapping("/employees/{id}")
    public EmployeeBean updateEmployee(@PathVariable Integer id, @RequestBody EmployeeBean employee) {
        EmployeeBean employeeBean = service.findOne(id);
        if (employeeBean == null)
            throw new EmpNotFoundException("id-" + id);

        else {
            if (employee.getId() != null) {
                employeeBean.setId(employee.getId());
            }

            if (employee.getName() != null) {
                employeeBean.setName(employee.getName());
            }
            if (employee.getAge() != null) {
                employeeBean.setAge(employee.getAge());
            }
        }
        return employeeBean;
    }
}

