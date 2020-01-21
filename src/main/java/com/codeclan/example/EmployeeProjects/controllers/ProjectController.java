package com.codeclan.example.EmployeeProjects.controllers;

import com.codeclan.example.EmployeeProjects.models.Department;
import com.codeclan.example.EmployeeProjects.models.Project;
import com.codeclan.example.EmployeeProjects.repositories.DepartmentRepository;
import com.codeclan.example.EmployeeProjects.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/project")
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping
    public List<Project> getAllProjects(){return projectRepository.findAll();}

}
