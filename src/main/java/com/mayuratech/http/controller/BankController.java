package com.mayuratech.http.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mayuratech.http.bean.Bank;
import com.mayuratech.http.service.BankService;

@RestController

@RequestMapping("/bank")
public class BankController {

	@Autowired
	private BankService bankService;
	private Bank bank;
	
	@PostMapping("/addUser")
	 @ResponseBody
	public String addBankUser(@RequestBody Bank bank) {
		return bankService.addBankUser(bank);
	}
}
