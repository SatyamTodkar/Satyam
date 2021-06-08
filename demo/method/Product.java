package com.cg.demo.method;

public class Product {

	int code;
	String name;
	double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}


	public Product(int code, String name, double price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}


//	@Override
//	public String toString() {
//		return "Product [code=" + code + ", name=" + name + ", price=" + price + "]";
//	}
	
	
	
	
	/*Product (int code, String name, double price){
		this.code=code;
		this.name=name;
		this.price=price;
		System.out.println("Parametric Constructor");
		
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [code="+ code +", name="+ name +", price= "+ price +"]";
}/*

}