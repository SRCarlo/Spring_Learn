package com.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.Model.*;

public class RowMapperImpl implements RowMapper<Product> {
	@Override
	public Product mapRow(ResultSet rs, int cnt) throws SQLException {
		Product p = new Product();
		p.setPid(rs.getInt(1));
		p.setPname(rs.getString(2));
		p.setPqty(rs.getInt(3));
		p.setPprice(rs.getInt(4));
		return p;
	}
}// end class