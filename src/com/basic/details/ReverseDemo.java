package com.basic.details;

public class ReverseDemo {

	public static void main(String[] args) {

		String s = "SowmyaMurali";    
		
		String reverse = " ";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse = reverse + s.charAt(i);
		}
		
		System.out.println(reverse);
		
		String s1 = "NITTIN";
		String reverse1 =" ";
		
		for(int j=s1.length()-1;j>=0;j--)
		{
			reverse1 = reverse1 + s.charAt(j);
		}
		
		System.out.println(reverse1);
	}
}