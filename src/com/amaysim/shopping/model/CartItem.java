package com.amaysim.shopping.model;

import java.util.HashSet;
import java.util.Set;

import com.amaysim.shopping.interfaces.IProduct;

public class CartItem{
	public String toString() {
		return product.getCode();
	}
	IProduct product;
	Set<String> promoCodes = new HashSet<>();
	public CartItem(IProduct product, String promoCode) {
		super();
		this.product = product;
		this.promoCodes.add(promoCode);
	}
	public IProduct getProduct() {
		return product;
	}
	public void setProduct(IProduct product) {
		this.product = product;
	}
	public Set<String> getPromoCodes() {
		return promoCodes;
	}
	public void setPromoCode(Set<String> promoCodes) {
		this.promoCodes = promoCodes;
	}
}
