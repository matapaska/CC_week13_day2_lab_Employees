package com.codeclan.example.EmployeeProjects.controllers;

import com.codeclan.example.EmployeeProjects.models.Department;
import com.codeclan.example.EmployeeProjects.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/department")
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping
    public List<Department> getAllDepts(){return departmentRepository.findAll();}

}
