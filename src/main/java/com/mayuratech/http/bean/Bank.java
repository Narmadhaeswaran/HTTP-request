package com.mayuratech.http.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "Bank")
public class Bank {

	@Id
	@Column
	private int Id;
	
	@Column
	private String Accountnumber;
	
	@Column
	private String Name;
	
	@Column
	private String accounttype;
	
	@Column
	private String Balance;
	
	@Column
	private String Password;

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(int id, String accountnumber, String name, String accounttype, String balance, String password) {
		super();
		Id = id;
		Accountnumber = accountnumber;
		Name = name;
		this.accounttype = accounttype;
		Balance = balance;
		Password = password;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getAccountnumber() {
		return Accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		Accountnumber = accountnumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getBalance() {
		return Balance;
	}

	public void setBalance(String balance) {
		Balance = balance;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
}
