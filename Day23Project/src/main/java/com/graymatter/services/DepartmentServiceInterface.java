package com.graymatter.services;

import java.util.List;

import com.graymatter.entities.Department;

public interface DepartmentServiceInterface {

	public List<Department> getAllDepartment();
	
	public Department addDepartment(Department department);
	
	public int deleteDepartment(int id);
}
