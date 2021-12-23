package com.mahezh.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahezh.crud.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
