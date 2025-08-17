package com.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Model.Product;

public class ProductDaoImpl implements ProductDaoInterface {

	JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int saveProduct(Product p) {
		String query = "INSERT INTO products VALUES(' " + p.getPid() + " ' ,' " + p.getPname() + " ' ,' " + p.getPqty()
				+ " ' ,' " + p.getPprice() + " ' )";
		return jt.update(query);
	}
	// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public int updateProduct(Product p) {
		String query = "UPDATE products set pname=' " + p.getPname() + " ',pqty= ' " + p.getPqty() + " ',pprice= ' "
				+ p.getPprice() + " ' where pid=' " + p.getPid() + " ' ";
		return jt.update(query);
	}
	// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public int deleteProduct(Product p) {
		String query = "DELETE From products Where pid=" + p.getPid();
		return jt.update(query);
	}
	// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public void showProductById(int pid) {
		String query = "Select * FROM Products WHERE pid=? ";

		Product p = jt.queryForObject(query, new RowMapper<Product>() {

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
	// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public void showAllProduct() {
		String query = "SELECT * FROM products";

		List<Product> plist = jt.query(query, new RowMapperImpl());
		Iterator<Product> it = plist.iterator();
		while (it.hasNext()) {
			Product p = it.next();
			p.display();
			System.out.println("----------------------------------");

		}

	}
	// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

}
