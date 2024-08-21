package com.graymatter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.entities.Employee;
import com.graymatter.exception.ResourceNotFoundException;
import com.graymatter.services.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
    @GetMapping("/employee")
    public List<Employee> getAllEmployee() {
    
        return service.getAllEmployee();
    }
    
    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
    	
        return service.addEmployee(employee);
    }
    
    @GetMapping("/city/{city}")
    public List<Employee> getAllEmployeesByCity(@PathVariable("city") String city) {
    
        return service.getAllEmployeeByCity(city);
    }
    
    @GetMapping("/{id}")
    public Employee getById(@PathVariable("id") int id) throws ResourceNotFoundException {
    	
    	return service.getEmployeeById(id);
    }
    
    @GetMapping("/department/{id}")
    public List<Employee> getAllEmployeesByDepartmentId(@PathVariable("id") int id) {
    	
    	return service.getAllEmployeesByDepartment(id);
    }
    
    @GetMapping("/name/{letter}")
	public List<Employee> findAllEmployeesStartWith(@PathVariable("letter") String letter) {
		
    	return service.findAllEmployeesStartWith(letter);

	}


}
