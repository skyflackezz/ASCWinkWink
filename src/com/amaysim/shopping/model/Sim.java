package com.amaysim.shopping.model;

import com.amaysim.shopping.interfaces.IProduct;

public enum Sim implements IProduct{
	P1("ult_small", "Unlimited 1GB", "24.90"),
	P2("ult_medium", "Unlimited 2GB", "29.90"),
	P3("ult_large", "Unlimited 5GB", "44.90"),
	P4("1gb", "1 GB Data-pack", "9.90");
	
	Sim(String code, String name, String price){
		this.code=code;
		this.name=name;
		this.price=price;
	}

	private String code;
	private String name;
	private String price;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
}
