package com.amaysim.shopping.util;

import com.amaysim.shopping.interfaces.IProduct;
import com.amaysim.shopping.model.Sim;

public class ProductFactory {
	public static IProduct getProductByCode(String productCode){
		switch (productCode){
		case "ult_small": return Sim.P1;
		case "ult_medium": return Sim.P2;
		case "ult_large": return Sim.P3;
		case "1gb": return Sim.P4;
		default: return null;
		}
	}
}
