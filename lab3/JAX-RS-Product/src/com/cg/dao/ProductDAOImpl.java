package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cg.beans.Product;
import com.cg.staticdb.ProductDB;

public class ProductDAOImpl implements IProductDAO{
	static HashMap<Integer,Product> productIdMap = ProductDB.getProductIdMap();
	@Override
	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<Product>(productIdMap.values());
		return products;
	}

	@Override
	public Product addProduct(Product Product) {
		productIdMap.put(Product.getId(),Product);
		return Product;
	}

}
