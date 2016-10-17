package com.amaysim.shopping.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.amaysim.shopping.util.ProductFactory;
import com.amaysim.shopping.util.PromoProcessor;

public class PromoableShoppingCart extends ShoppingCart{
	Set<String> promos = new HashSet<>();
	List<CartItem> processedItems = new ArrayList<>();
	BigDecimal processedTotal = new BigDecimal(0);

	public void reset(){
		super.reset();
		promos = new HashSet<>();
		processedItems = new ArrayList<>();
		processedTotal = new BigDecimal(0);
	}
	
	public void process(){
		PromoProcessor.process(this);
	}
	
	public Set<String> getPromos() {
		return promos;
	}

	public void setPromos(Set<String> promos) {
		this.promos = promos;
	}

	public void setTotal(BigDecimal total){
		this.processedTotal = total;
	}
	
	public List<CartItem> processedItems(){
		return processedItems;
	}

	public void add(String productCode, String promoCode){
		CartItem cartItem = new CartItem(ProductFactory.getProductByCode(productCode), promoCode);
		items.add(cartItem);
		promos.add(promoCode);
		
		process();
	}

	@Override
	public BigDecimal total() {
		return processedTotal;
	}
	

}
