package com.basic.details;

import java.util.Scanner;

public class SwapDemo {

	public static void main(String[] args) {

/*		int a = 10, b= 20;
		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);
		
		a = a*b;
		b = a/b;
		a = a/b;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swapping");
		System.out.println(a);
		System.out.println(b);
	}

}

*/
System.out.println("enter a number for A");
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
System.out.println("enter a number for B");
Scanner scan1 = new Scanner(System.in);
int b = scan1.nextInt();


System.out.println("before swapping");

System.out.println(a);
System.out.println(b);

a = a * b;
b = a / b;
a = a / b;

System.out.println("after swapping");

System.out.println(a);
System.out.println(b);
}
}