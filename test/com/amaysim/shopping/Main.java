package com.amaysim.shopping;

import com.amaysim.shopping.model.PromoableShoppingCart;

public class Main {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
	}
	public static void test1(){
		PromoableShoppingCart cart = new PromoableShoppingCart();
		cart.add("ult_small");
		cart.add("ult_small");
		cart.add("ult_small");
		cart.add("ult_large");
		System.out.println("Items"+cart.items());
		System.out.println("Total"+cart.total());
		System.out.println("Items in Cart"+cart.items());
	}
	public static void test2(){
		PromoableShoppingCart cart = new PromoableShoppingCart();
		cart.add("ult_small");
		cart.add("ult_small");
		cart.add("ult_large");
		cart.add("ult_large");
		cart.add("ult_large");
		cart.add("ult_large");
		System.out.println("Items"+cart.items());
		System.out.println("Total"+cart.total());
		System.out.println("Items in Cart"+cart.items());
	}
	public static void test3(){
		PromoableShoppingCart cart = new PromoableShoppingCart();
		cart.add("ult_small");
		cart.add("ult_medium");
		cart.add("ult_medium");
		System.out.println("Items"+cart.items());
		System.out.println("Total"+cart.total());
		System.out.println("Items in Cart"+cart.items());
	}
	public static void test4(){
		PromoableShoppingCart cart = new PromoableShoppingCart();
		cart.add("ult_small");
		cart.add("1gb", "I<3AMAYSIM");
		System.out.println("Items"+cart.items());
		System.out.println("Total"+cart.total());
		System.out.println("Items in Cart"+cart.items());
	}
}
