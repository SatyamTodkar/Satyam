package com.cg.demo.access;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(10000);
		System.out.println(num);
	}
	
}
