package com.mayuratech.http.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayuratech.http.bean.Shop;
import com.mayuratech.http.constant.Error;
import com.mayuratech.http.repository.ShopInterface;
import com.mayuratech.http.validator.ShopValidator;
import com.mayuratech.http.constant.Error;

@Service
public class ShopService {

	
	@Autowired
	ShopInterface shopInterface;
	

	@Autowired
	ShopValidator shopValidator;
	
	public List addShop(Shop shop) {
		List<Error> errorList=shopValidator.validation(shop);
		if(errorList.size()>0) {
			//System.out.println("yes");
			return errorList;
		}
		else {
			shopInterface.save(shop);
			List<Shop> listShop=new ArrayList<Shop>();
			listShop.add(shop);
			return listShop;
		}
	}

//	public List<Shop> getAllShop() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
