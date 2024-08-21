package com.graymatter.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.graymatter.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	public List<Employee> findByCity(String city);
	
	
//	 Using Native Query
//	@Query(value = "SELECT * FROM project23employee e where e.department_id = ?" , nativeQuery = true)
//	public List<Employee> findByDepartment(@Param("id") int id);

	// Without using native key
	public List<Employee> findByDepartmentDeptId(int deptId);

//	@Query(value = "SELECT * FROM project23employee WHERE emp_name LIKE ?%", nativeQuery = true)
//	public List<Employee> findAllEmployeesStartWith(@Param("letter")String letter);
	
	public List<Employee> findByEmpNameStartsWith(String letter);

	 
}
 