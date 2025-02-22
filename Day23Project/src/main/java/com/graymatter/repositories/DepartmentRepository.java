package com.graymatter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graymatter.entities.Department;


public interface DepartmentRepository extends JpaRepository<Department, Integer>{

	int deleteByDeptId(int id);

}
