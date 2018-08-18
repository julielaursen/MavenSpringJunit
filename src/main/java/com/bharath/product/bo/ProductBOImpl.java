package com.bharath.product.bo;

import com.bharath.product.dao.ProductDAO;
import com.bharath.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private ProductDAO dao;
	
	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

	@Override
	public void createProduct(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
