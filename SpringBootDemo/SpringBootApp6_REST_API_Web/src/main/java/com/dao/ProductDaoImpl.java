package com.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import com.model.Product;

@Component
public class ProductDaoImpl implements ProductDaoInterface {

	ArrayList<Product> plist;

	public ProductDaoImpl() {
		plist = new ArrayList<>();
		plist.add(new Product(101, "Console", 999));
		plist.add(new Product(102, "PC", 800));
		plist.add(new Product(103, "Monitor", 100));

	}
	// --------------------------------------------------------------------------------------------------------

	@Override // Display All Products...
	public ArrayList<Product> getProducts() {

		return this.plist;
	}
	// --------------------------------------------------------------------------------------------------------

	@Override // Display Product By ID...
	public Product getProduct(int pid) {
		Product p = null;

		for (Product p1 : plist) {
			if (p1.getPid() == pid) {
				p = p1;
				break;
			}
		}
		return p;
	}
	// --------------------------------------------------------------------------------------------------------

	@Override // Add Product By ID...
	public Product addProduct(Product p) {

		this.plist.add(p);
		return p;
	}

	@Override // Delete Product By ID...
	public Product deleteProduct(int pid) {
		Product p = null;
		for (Product p1 : plist) {
			if (p1.getPid() == pid) {
				p = p1;
				this.plist.remove(p1);
				break;
			}
		}
		return p;
	}
	// --------------------------------------------------------------------------------------------------------

	@Override // Update Product By ID...
	public Product updateProduct(int pid, Product p) {
		Product temp = null;
		for (Product p1 : plist) {
			if (p1.getPid() == pid) {

				p1.setPid(p.getPid());
				p1.setPname(p.getPname());
				p1.setQpty(p.getQpty());

				temp = p1;
				break;
			}
		}
		return temp;
	}

}
