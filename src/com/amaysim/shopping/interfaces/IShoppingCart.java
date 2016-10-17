package com.amaysim.shopping.interfaces;

public interface IShoppingCart {
	void add(String productCode, String promoCode);
	void add(String productCode);
	Object total();
	Object items();
}
