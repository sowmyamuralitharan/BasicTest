package com.basic.details;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		int i,a=0 ;

		System.out.println("enter a number");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(i=2;i<=n/2;i++)
		{
			if(n%i == 0)
			{
				a = 1;
				break;
			}
		}
		if(n == 1)
		{
			System.out.println("1 is neither prime nor composite");
		}
		else
		{
			if(a == 0)
				System.out.println("prime number =" +n);
			else
				System.out.println("not a prime =" +n);
		}
	}

}
