package com.cg.demo.method;

public class App2 {
	
	public static void main(String[] args) {
		
		Product obj = new Product();
		obj.code = 1234;
		obj.name = "Abc";
		obj.price = 10.5;
		System.out.println(obj.toString());
		
		Product obj2 = new Product (5678, "Def", 45.54);
		System.out.println(obj2.toString());
	}

}
