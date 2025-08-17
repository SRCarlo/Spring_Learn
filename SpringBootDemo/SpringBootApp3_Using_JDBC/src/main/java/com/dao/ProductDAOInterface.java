package com.dao;

import com.bean.Product;

public interface ProductDAOInterface {
	public int updateProduct(Product p);

	public int saveProduct(Product p);

	public int deleteProduct(Product p);

	public void showProductById(int pid);

	public void showAllProduct();

	

}
