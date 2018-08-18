package com.bharath.product.bo;

import com.bharath.product.dto.Product;

public interface ProductBO {
	
	public void createProduct(Product product);
	
	public Product findProduct(int id);

}
