package com.basic.details;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		
		
		System.out.println("enter a number");
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		if(number%2 == 0)
		{
			System.out.println("even number =" +number);
		}
		else
		{
			System.out.println("odd number =" +number);
		}

		
	}

}


/*

#include<stdio.h>
#include<conio.h>

int main()
{



















*/