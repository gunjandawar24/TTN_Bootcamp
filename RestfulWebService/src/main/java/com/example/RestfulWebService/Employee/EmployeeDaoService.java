package com.example.RestfulWebService.Employee;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class EmployeeDaoService {

    private static List<EmployeeBean> emp=new ArrayList<>();
    private static int empCount=3;

    static {
        emp.add(new EmployeeBean(1,"Gunjan",21));
        emp.add(new EmployeeBean(2, "Gaurav", 19));
        emp.add(new EmployeeBean(3, "Himanshi", 23));
    }

    //To return a list of employees back
    public List<EmployeeBean> findAll(){
        return emp;
    }

    //To add employee to the list
    public EmployeeBean save(EmployeeBean employeeBean){
        if(employeeBean.getId()==null){
            employeeBean.setId(++empCount);
        }
        emp.add(employeeBean);
        return employeeBean;
    }

    //To find a particular employee
    public EmployeeBean findOne(int id){
        for(EmployeeBean employeeBean:emp){
            if(employeeBean.getId()==id){
                return employeeBean;
            }
        }
        return null;
    }

    //To delete a particualer employee by id
    public EmployeeBean deleteOne(int id){
        Iterator<EmployeeBean> iterator=emp.iterator();
        while (iterator.hasNext()){
            EmployeeBean employeeBean=iterator.next();
            if(employeeBean.getId()==id){
                iterator.remove();
                return employeeBean;
            }
        }
        return null;
    }

}
