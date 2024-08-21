package com.graymatter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.dao.DepartmentDao;
import com.graymatter.entities.Department;

import jakarta.transaction.Transactional;

@Service
public class DepartmentService implements DepartmentServiceInterface{

	@Autowired
	DepartmentDao dao;
	
	@Override
	public List<Department> getAllDepartment() {
		return dao.getAllDepartment();
	}

	@Override
	public Department addDepartment(Department department) {
		return dao.addDepartment(department);
	}	
	
	@Transactional
	public int deleteDepartment(int id) {
        return dao.deleteDepartment(id);
	}
}
