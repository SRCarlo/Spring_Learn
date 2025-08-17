package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.model.Product;
import java.util.*;

public class ProductDaoImpl implements ProductDaoInterface {
	JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int saveProduct(Product p) {
		String query = "insert into products values('" + p.getPid() + "','" + p.getPname() + "','" + p.getPqty() + "','"
				+ p.getPprice() + "')";
		return jt.update(query);
	}

	@Override
	public int updateProduct(Product p) {
		String query = "update products set pname='" + p.getPname() + "',pqty='" + p.getPqty() + "',pprice='"
				+ p.getPprice() + "' where pid='" + p.getPid() + "'";
		return jt.update(query);
	}

	@Override
	public int deletProduct(Product p) {
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
	public ArrayList<Product> showAllProduct() {
		String query = "select * from products";
		ArrayList<Product> plist = (ArrayList<Product>) jt.query(query, new RowMapperImpl());
		Iterator<Product> it = plist.iterator();
		while (it.hasNext()) {
			Product p = it.next();
			p.display();
		}
		return plist;
	}
}
