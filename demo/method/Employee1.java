package com.cg.demo.method;

public class Employee1 {
	
	String emailid;
	String dept;
	String designation;
	
	Employee1() {
		System.out.println("Constructor");
	}
	
	@Override
	public String toString() {
		return "Employee [emailid="+ emailid +", dept="+ dept +", designation= "+ designation +"]";
	}
}
