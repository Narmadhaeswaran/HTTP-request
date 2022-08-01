package com.mayuratech.http.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mayuratech.http.bean.Shop;
import com.mayuratech.http.constant.Error;

@Component
public class ShopValidator {

	public List<Error> validation(Shop shop){
		List<Error> list=new ArrayList<>();
		
		//Error er=new Error("as","sd");
		
		if(shop.getId()==0) {
			list.add(new Error("ID","ID cannot be NULL"));
		}
		
		if(shop.getShopname()==null) {
			list.add(new Error("Shop Name","Shop Name cannot be NULL"));
		}
		
		if(shop.getAddress()==null) {
			list.add(new Error("Address","Address cannot be NULL"));
		}
		if(shop.getPhonenumber()==null) {
			list.add(new Error("Phone Number","Phone Number cannot be NULL"));
		}
		if(shop.getCity()==null) {
			list.add(new Error("City","City cannot be NULL"));
		}
		if(shop.getState()==null) {
			list.add(new Error("State","State cannot be NULL"));
		}
		
		return list;
	}
}
