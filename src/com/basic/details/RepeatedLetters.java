package com.basic.details;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedLetters {

	public static void main(String[] args) {

		String s = "NamrataLakotia";
		char[] ch = s.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		
		for(char letter : ch)
		{
			if(map.containsKey(letter))
			{
				Integer i = map.get(letter);
				map.put(letter,i+1);
			}
			else
			{
				map.put(letter,1);
			}
		}
		
		Set<Entry<Character, Integer>> entrySet = map.entrySet();

	System.out.println("List of duplicate words");
		for(Entry<Character, Integer> entry : entrySet)
		{
			if(entry.getValue()>1)
			{
				Character key = entry.getKey();
				Integer value = entry.getValue();
				System.out.println(key+ " = " + value);
			}
		}
	}
}