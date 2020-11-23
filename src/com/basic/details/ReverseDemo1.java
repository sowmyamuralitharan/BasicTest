package com.basic.details;

public class ReverseDemo1 {

	public static void main(String[] args) {

		String s = "Welcome to java";
		
		String[] split = s.split(" ");
		
		String reverseString = " ";
		
		for (String str : split) {
			
			String reverse = " ";
			
			for(int i = str.length()-1;i>=0;i--)
			{
				reverse = reverse + str.charAt(i);
			}
			
			reverseString = reverseString + reverse + " ";
			
		}
		
		System.out.println(reverseString);
	}

}
