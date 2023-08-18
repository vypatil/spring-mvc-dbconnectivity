package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeRepository;
import com.demo.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repository;
	
	public void saveEmployee(Employee e) {
		
		repository.saveEmployeeToDb(e);
		
	}

}
