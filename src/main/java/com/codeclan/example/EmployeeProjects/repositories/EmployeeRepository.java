package com.codeclan.example.EmployeeProjects.repositories;

import com.codeclan.example.EmployeeProjects.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee,Long> {
}
