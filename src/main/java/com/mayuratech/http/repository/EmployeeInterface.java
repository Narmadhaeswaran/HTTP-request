package com.mayuratech.http.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayuratech.http.bean.Employee;

public interface EmployeeInterface extends JpaRepository<Employee,String>{

}
