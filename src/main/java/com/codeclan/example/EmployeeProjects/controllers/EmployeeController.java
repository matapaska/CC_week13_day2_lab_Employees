package com.codeclan.example.EmployeeProjects.controllers;

import com.codeclan.example.EmployeeProjects.models.Department;
import com.codeclan.example.EmployeeProjects.models.Employee;
import com.codeclan.example.EmployeeProjects.repositories.DepartmentRepository;
import com.codeclan.example.EmployeeProjects.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployess(){return employeeRepository.findAll();}

}
