package com.mahezh.crud.service;

import java.util.List;

import com.mahezh.crud.model.Employee;


public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
	
	
	
}
