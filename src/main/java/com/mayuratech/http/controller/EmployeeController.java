package com.mayuratech.http.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayuratech.http.bean.Employee;
import com.mayuratech.http.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getEmployee(){
		return employeeService.getAllEmployee();
	}
}
