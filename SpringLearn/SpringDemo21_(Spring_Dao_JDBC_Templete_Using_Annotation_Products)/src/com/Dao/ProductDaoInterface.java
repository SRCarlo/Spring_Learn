package com.Dao;

import org.springframework.stereotype.Repository;
import com.Model.Product;

@Repository
public interface ProductDaoInterface {
	public int saveProduct(Product p);

	public int updateProduct(Product p);

	public int deleteProduct(Product p);

	public void showProductById(int pid);

	public void showAllProduct();
}