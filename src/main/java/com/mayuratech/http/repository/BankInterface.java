package com.mayuratech.http.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayuratech.http.bean.Bank;

public interface BankInterface extends JpaRepository<Bank,Integer>{


}
