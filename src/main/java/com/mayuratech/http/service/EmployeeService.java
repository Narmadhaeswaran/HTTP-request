package com.mayuratech.http.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayuratech.http.bean.Employee;
import com.mayuratech.http.repository.EmployeeInterface;

@Service
public class EmployeeService {

	@Autowired
	EmployeeInterface employeeInterface;
	
	public List<Employee> getAllEmployee(){
		return employeeInterface.findAll();
	}
}
