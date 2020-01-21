package com.codeclan.example.EmployeeProjects;

import com.codeclan.example.EmployeeProjects.models.Department;
import com.codeclan.example.EmployeeProjects.models.Employee;
import com.codeclan.example.EmployeeProjects.models.Project;
import com.codeclan.example.EmployeeProjects.repositories.DepartmentRepository;
import com.codeclan.example.EmployeeProjects.repositories.EmployeeRepository;
import com.codeclan.example.EmployeeProjects.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeProjectsApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;


	@Test
	public void createProjectandEmployee(){
		Project project = new Project("Zeus",3);
		projectRepository.save(project);

		Department dept = new Department("HR");
		departmentRepository.save(dept);

		Employee employee = new Employee("Yousef","Ahmed",1234,dept);
		employeeRepository.save(employee);
	}

	@Test
	public void addEmployeeToProject(){
		Project project = new Project("Zeus",3);
		projectRepository.save(project);

		Department dept = new Department("HR");
		departmentRepository.save(dept);

		Employee employee = new Employee("Yousef","Ahmed",1234,dept);
		employeeRepository.save(employee);

		Employee employee2 = new Employee("Marta","P",23,dept);
		employeeRepository.save(employee2);

		project.addEmployee(employee);
		project.addEmployee(employee2);
		projectRepository.save(project);


		employee2.addProject(project);
		employeeRepository.save(employee2);

	}


}
