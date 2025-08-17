package com.dao;

import com.model.Product;
import java.util.*;

public interface ProductDaoInterface {
	public int saveProduct(Product p);

	public int updateProduct(Product p);

	public int deletProduct(Product p);

	public void showProductById(int pid);

	public ArrayList<Product> showAllProduct();
}