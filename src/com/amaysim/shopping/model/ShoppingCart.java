package com.amaysim.shopping.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.amaysim.shopping.interfaces.IShoppingCart;

public abstract class ShoppingCart implements IShoppingCart{
	List<CartItem> items = new ArrayList<>();

	public void add(String productCode){
		add(productCode, null);
	}
	
	public abstract BigDecimal total();
	public List<CartItem> items(){
		return items;
	}
	public void reset(){
		items=new ArrayList<>();
	}
}
