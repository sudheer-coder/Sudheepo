package com.cts.pmo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.cts.pmo.controller.Product;

@Repository
public class Dao {
	
	ApplicationContext ap= new ClassPathXmlApplicationContext("spring.xml"); 
	DataSource ds = (DataSource) ap.getBean("ds");
	JdbcTemplate jdbc = null;
	public List<Product> getByid(int id) 
	{   
		System.out.println("dao"+id);
		Product product = null;
		jdbc = new JdbcTemplate(ds);
		System.out.println(jdbc);
		List<Product> li=jdbc.query("select * from product",new Resulmapper());
		return li;
	}
	

} 
class Resulmapper  implements RowMapper<Product>{

	Product product=null;
	@Override
	public Product mapRow(ResultSet rs, int arg1) throws SQLException {
		
		product=new Product( );
		return product;
	}

	
}