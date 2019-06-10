package com.cg.staticdb;

import java.util.HashMap;

import com.cg.beans.Product;

public class ProductDB {
static HashMap<Integer, Product> productIdMap = getProductIdMap();
	
	static {
		if (productIdMap == null) {
			productIdMap = new HashMap<Integer, Product>();
			Product indiaproduct = new Product(1, "Pen", 10000);
			Product chinaproduct = new Product(4, "Pencil", 20000);

			productIdMap.put(1, indiaproduct);
			productIdMap.put(4, chinaproduct);

		}
}
		public static HashMap<Integer,Product> getProductIdMap(){
			return productIdMap;
		}
}
