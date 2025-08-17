package com.Config;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import com.Dao.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
//@Configuration
@Configurable
public class ApplicationConfiguration 
{   @Bean
	public DriverManagerDataSource getDriverManagerDataSource()
	{
	DriverManagerDataSource ds = new DriverManagerDataSource();
    ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
    ds.setUrl(" jdbc:oracle:thin:@localhost:1521:orcl");
    ds.setUsername("hr");
    ds.setPassword("hr");
    return ds;
    }
	@Bean(name = "jt")
	public JdbcTemplate getJdbcTemplate()
	{
	    JdbcTemplate ref=new JdbcTemplate();
        ref.setDataSource(getDriverManagerDataSource());     		
		return ref;
	}
	@Bean(name = "pdao")
	public ProductDaoInterface getProductDaoImpl()
	{
		ProductDaoInterface pdao= new ProductDaoImpl();
        return pdao;
	}	
}