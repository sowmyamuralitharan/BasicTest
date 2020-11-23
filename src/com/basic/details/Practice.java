package com.basic.details;

public class Practice {

	
		public static void main(String[] args)
		{
		         char str[] = "aabyzabcdde543672535".toCharArray(); 
				        int n = str.length; 
		     
				        // Used as index in the modified string 
				        int index = 0; 
				  
				        // Traverse through all characters 
				        for (int i = 0; i < n; i++) 
				        { 
				  
				            // Check if str[i] is present before it  
				            int j; 
				            for (j = 0; j < i; j++)  
				            { 
				                if (str[i] == str[j]) 
				                { 
				                    break; 
				                } 
				            } 
				  
				            // If not present, then add it to 
				            // result. 
				            if (j == i)  
				            { 
				                str[index++] = str[i]; 
				            } 
				        }
				        System.out.println(n);
		}
}
	      
				    