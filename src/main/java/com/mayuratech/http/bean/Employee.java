package com.mayuratech.http.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@Column
	private int Empid;
	
	@Column
	private String Firstname;
	
	@Column
	private String lastname;
	
	@Column
	private String Email;
	
	@Column
	private String Phone;
	
	@Column
	private String Gender;
	
	@Column
	private String Department;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String firstname, String lastname, String email, String phone, String gender,
			String department) {
		super();
		Empid = empid;
		Firstname = firstname;
		this.lastname = lastname;
		Email = email;
		Phone = phone;
		Gender = gender;
		Department = department;
	}

	public int getEmpid() {
		return Empid;
	}

	public void setEmpid(int empid) {
		Empid = empid;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}
	

}
