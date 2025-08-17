package com.Dao;

import com.Model.Product;

public interface ProductDaoInterface {
	
	public int saveProduct(Product p);
	public int updateProduct(Product p);
	public int deleteProduct(Product p);
	public void showProductById(int p);
	public void showAllProduct();

}
