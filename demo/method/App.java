package com.cg.demo.method;

public class App {

	public static void main(String[] args) {
		int num=10;
		
		Employee obj = new Employee();
		obj.id = 101;
		obj.name = "Abc";
		obj.salary = 10.5;
		System.out.println(obj.toString());
		
		Employee1 obj2 = new Employee1();
		obj2.emailid = "employee@abc.com";
		obj2.dept = "Xyz";
		obj2.designation = "Analyst";
		System.out.println(obj2.toString());
		
		Employee obj3 = new Employee (104, "Ddd", 45.54);
		System.out.println(obj3.toString());
		
		Employee obj4 = new Employee (105, "Eee");
		System.out.println(obj4.toString());
	}
	
}
