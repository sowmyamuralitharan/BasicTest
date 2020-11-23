package com.basic.details;

public class FibonacciDemo {

	public static void main(String[] args) {

		int a = 0, b = 1, c = 0;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0;i<5;i++)
		{
		c = a+b;
		
		System.out.println(c);
		
		a = b;
		b = c;
		}
		
	}

}
