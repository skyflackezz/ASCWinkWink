package com.amaysim.shopping.util;

import java.math.BigDecimal;

import com.amaysim.shopping.model.CartItem;
import com.amaysim.shopping.model.PromoableShoppingCart;
import com.amaysim.shopping.model.Sim;

public class PromoProcessor {

	public static void process(PromoableShoppingCart cart) {
		apply(cart);
		applyPromo1(cart);
		applyPromo2(cart);
		applyPromo3(cart);
		applyPromo4(cart);
	}

	public static void apply(PromoableShoppingCart cart) {
		cart.setTotal(new BigDecimal(0));
		for(CartItem c: cart.items()){
			cart.setTotal(cart.total().add(new BigDecimal(c.getProduct().getPrice())));
		}
	}
	public static void applyPromo1(PromoableShoppingCart cart) {
		long count = cart.items().stream().filter(s -> {
			Sim sim = (Sim) s.getProduct();
			return sim.getCode().equals("ult_small");
		}).count();
		long promoableCount = count / 3;

		BigDecimal bdPromoableCount = new BigDecimal(promoableCount);
		BigDecimal p1Price = new BigDecimal(Sim.P1.getPrice());
		cart.setTotal(cart.total().subtract(bdPromoableCount.multiply(p1Price)));
	}

	public static void applyPromo2(PromoableShoppingCart cart) {
		long count = cart.items().stream().filter(s -> {
			Sim sim = (Sim) s.getProduct();
			return sim.getCode().equals("ult_large");
		}).count();
		boolean promoable = count>3;
		if(promoable){
			BigDecimal discountPerItem =  new BigDecimal("5");
			BigDecimal discount = new BigDecimal(count).multiply(discountPerItem);
			cart.setTotal(cart.total().subtract(discount));
		}
	}
	
	public static void applyPromo3(PromoableShoppingCart cart) {
		long count = cart.items().stream().filter(s -> {
			Sim sim = (Sim) s.getProduct();
			return sim.getCode().equals("ult_medium");
		}).count();
		long promoableCount = count / 2;
		
		for(int i=0; i<promoableCount; i++){
			cart.processedItems().add(new CartItem(ProductFactory.getProductByCode("ult_medium"),null));
		}
	}

	public static void applyPromo4(PromoableShoppingCart cart) {
		if(cart.getPromos().contains("I<3AMAYSIM")){
			BigDecimal discount =  new BigDecimal(0.1);
			cart.setTotal(cart.total().subtract(cart.total().multiply(discount)));
		}
	}
}
