package com.mahezh.crud.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahezh.crud.model.Employee;
import com.mahezh.crud.service.EmployeeService;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	//The API to Create an employee
	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){

		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED); 
	}
	
	//The API to Retrieve (Read) all the employees.
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
}												
