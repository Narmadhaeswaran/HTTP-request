package com.mayuratech.http.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayuratech.http.bean.Bank;
import com.mayuratech.http.repository.BankInterface;

@Service
public class BankService {

	@Autowired
	BankInterface bankInterface;
	
	public String addBankUser(Bank bank) {
		bankInterface.save(bank);
		return "Successfully Added";
	}
}
