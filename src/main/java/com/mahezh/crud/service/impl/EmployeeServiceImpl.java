package com.mahezh.crud.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mahezh.crud.exception.ResourseNotFoundException;
import com.mahezh.crud.model.Employee;
import com.mahezh.crud.repository.EmployeeRepository;
import com.mahezh.crud.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}




	@Override
	public Employee saveEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}


	@Override
	public List<Employee> getAllEmployees() {

		return employeeRepository.findAll();
	}


	@Override
	public Employee getEmployeeById(long id) {

//	Optional<Employee> employee=employeeRepository.findById(id);
//
//	if(employee.isPresent()) {
//		return employee.get();
//	}else {
//		throw new ResourseNotFoundException("Employee", "id", id);
//		}

		return employeeRepository.findById(id).orElseThrow(() ->
		new ResourseNotFoundException("Employee", "id", id));
	}
}
