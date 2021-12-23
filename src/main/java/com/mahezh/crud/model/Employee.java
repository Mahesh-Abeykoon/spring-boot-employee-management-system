package com.mahezh.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id  //primary key set
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name", nullable = false)
	private String firstName;
	
	@Column(name="last_name", nullable= false)
	private String lastName;
	
	@Column(name="email", nullable = false)
	private String email;
	
	
	public long getId() {
		return id;
		
	}
	
	public long setId(long id) {
		return this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String setFirstName (String firstName) {
		return this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
		
	}
	
	public String setLastName(String lastName) {
		return this.lastName = lastName;
		
	}
	
	public String getEmail() {
		return email;
	}
	
	public String setEmail (String email) {
		return this.email = email;
	}
	
}
