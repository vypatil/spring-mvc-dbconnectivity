package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.entity.Employee;
import com.demo.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@RequestMapping("/saveEmployee")
	public void saveEmployee(@RequestParam("name") String name, @RequestParam("address") String address, @RequestParam("salary") String salary) {
		
		Employee e1 = new Employee();
		e1.setName(name);
		e1.setAddress(address);
		e1.setSalary(Integer.parseInt(salary));	// comming data from UI into String fromat so need to typecasting int to String.
		
		service.saveEmployee(e1);
		
	}
	
	
	

}
