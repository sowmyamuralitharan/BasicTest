package com.basic.details;

public class FactorialDemo {

	public static void main(String[] args) {

		int count =1;
		for(int i=1;i<=5;i++)
		{
			count = count * i;
			System.out.println(count);
		}
		
		System.out.println("Factorial is =" +count);
	}

}
