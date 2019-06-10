package com.cg.dao;

import java.util.List;

import com.cg.beans.Product;

public interface IProductDAO {
	public List<Product> getAllProducts();
	public Product addProduct(Product Product);
}
