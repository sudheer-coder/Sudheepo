package com.cts.pmo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.pmo.controller.Product;
import com.cts.pmo.dao.Dao;
@Service 
public class Services { 
	@Autowired 
	private Dao dao;
	public List<Product> getById(int id) 
	{   
		System.out.println("service"+id);
		return dao.getByid(id);
	}

}
