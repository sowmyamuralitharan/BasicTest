package com.basic.details;

import java.util.Scanner;

public class PalindromeDemo {

	public static void main(String[] args) {

/*		//int n = 12321;
		
		for(int n = 1; n <= 10; n++)
		{	
		
		int a = 0,i = 0,j = 0;
		
		a = n ;
		
		while(a>0)
		{
			i = a % 10;
			j = (j * 10)+ i;
			a = a/10;
		}
		if(j == n)
		{
			System.out.println("number is palindrome = " +j);
		}
		else
		{
			System.out.println("Not a palindrome =" +j);
		}
	}

}
}
*/
int temp , i,j = 0;

System.out.println("enter a number");
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();

temp = n;

while(temp>0)
{
 i = temp % 10;
 j = (j * 10) + i;
 temp = temp / 10;
 
}
if(n == j)
{
	System.out.println("palindrome number =" +j);
}
else
{
	System.out.println("not a palindrome =" +j);
}

}
	}


















