package com.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import com.Model.Product;
import java.util.*;

@Component("pdao")
public class ProductDaoImpl implements ProductDaoInterface {
	@Autowired
	JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int saveProduct(Product p) {
		// Query to check if the product ID already exists
		String checkQuery = "SELECT COUNT(*) FROM Products WHERE pid = ?";
		Integer count = jt.queryForObject(checkQuery, Integer.class, p.getPid());

		if (count != null && count > 0) {
			// If product ID exists, print error message and return 0
			System.err.println("Product ID " + p.getPid() + " is already registered with another product.");
			return 0;
		}

		// Insert the new product if the ID does not exist
		String query = "INSERT INTO Products VALUES (?, ?, ?, ?)";
		return jt.update(query, p.getPid(), p.getPname(), p.getPqty(), p.getPprice());
	}

	@Override
	public int updateProduct(Product p) {
		String query = "update products set pname='" + p.getPname() + "',pqty='" + p.getPqty() + "',pprice='"
				+ p.getPprice() + "' where pid='" + p.getPid() + "'";
		return jt.update(query);
	}

	@Override
	public int deleteProduct(Product p) {
		String query = "delete from products where pid=" + p.getPid();
		return jt.update(query);
	}

	@Override
	public void showProductById(int pid) {
		String query = "select * from products where pid=?";

		Product p = (Product) jt.queryForObject(query, new RowMapper<Product>() {
			@Override
			public Product mapRow(ResultSet rs, int cnt) throws SQLException {
				Product p = new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPqty(rs.getInt(3));
				p.setPprice(rs.getInt(4));
				return p;
			}
		}, pid);
		p.display();
	}

	@Override
	public void showAllProduct() {
		String query = "select * from products";
		List<Product> plist = jt.query(query, new RowMapperImpl());
		Iterator<Product> it = plist.iterator();
		while (it.hasNext()) {
			Product p = it.next();
			System.out.println("------------------");
			p.display();
		}
	}
}// end class
