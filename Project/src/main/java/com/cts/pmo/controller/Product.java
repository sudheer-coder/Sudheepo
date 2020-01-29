package com.cts.pmo.controller;

public class Product { 
	
	private String price;
	private String product;
	private String quantity;
	public Product() 
	{ 
		
	}
	public Product(String price, String product, String quantity) {
		super();
		this.price = price;
		this.product = product;
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [price=" + price + ", product=" + product + ", quantity=" + quantity + "]";
	} 
	
	

}
