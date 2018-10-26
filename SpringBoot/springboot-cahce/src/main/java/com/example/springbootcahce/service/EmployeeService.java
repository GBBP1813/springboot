package com.example.springbootcahce.service;

import com.example.springbootcahce.bean.Employee;
import com.example.springbootcahce.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public Employee getEmp(Integer id){
        System.out.println("查询");
        Employee emp=employeeMapper.getEmpById(id);
        return emp;
    }



}
