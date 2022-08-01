package com.mayuratech.http.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Id;

@Entity
@Table(name = "Shop")
public class Shop {

	@Id
	@Column
	private int Id;
	
	@NotNull
	@Column
	private String Shopname;
	
	@Column
	private String address;
	
	@Column
	private String Phonenumber;
	
	@Column
	private String City;
	
	@Column
	private String State;

	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Shop(int id,String shopname, String address, String phonenumber, String city,
			String state) {
		super();
		Id = id;
		this.Shopname = shopname;
		this.address = address;
		Phonenumber = phonenumber;
		City = city;
		State = state;
	}



	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getShopname() {
		return Shopname;
	}

	public void setShopname(String shopname) {
		this.Shopname = shopname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonenumber() {
		return Phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Shop [Id=" + Id + ", Shopname=" + Shopname + ", address=" + address + ", Phonenumber=" + Phonenumber
				+ ", City=" + City + ", State=" + State + "]";
	}
	
	
	
}
