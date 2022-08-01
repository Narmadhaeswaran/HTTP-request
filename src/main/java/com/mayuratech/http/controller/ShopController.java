package com.mayuratech.http.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mayuratech.http.bean.Employee;
import com.mayuratech.http.bean.Shop;
import com.mayuratech.http.service.ShopService;
import com.mayuratech.http.validator.ShopValidator;

@RestController
@RequestMapping("/shop")
public class ShopController {

	@Autowired
	private ShopService shopService;
	
	
	@PostMapping("/addShop")
	@ResponseBody
	public List addShop(@RequestBody Shop shop) {
		return shopService.addShop(shop);
	}
}
