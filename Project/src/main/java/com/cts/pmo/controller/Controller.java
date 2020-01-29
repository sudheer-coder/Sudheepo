package com.cts.pmo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.pmo.service.Services;

@RestController
public class Controller {
	@Autowired
	private Services service;
	@Autowired 
	private Product product;
	@RequestMapping("/") 
	public String index() 
	{ 
		return "index";
	}
	@RequestMapping("/{pid}") 
	public String getId(@PathVariable("pid") int id,Model m) 
	{    
		System.out.println(id);
		List<Product> li = service.getById(id);
		m.addAttribute("list",li);
		return "Result";
	}

}
