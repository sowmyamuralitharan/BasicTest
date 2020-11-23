package com.basic.details;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWords {

	public static void main(String[] args) {

		 String s = "Welcome god god god here god here";
			
			String[] split = s.split(" ");
					
			HashMap<String, Integer> map = new HashMap<String,Integer>();
			
			for(String words : split)
			{
				if(map.containsKey(words))
				{
					Integer i = map.get(words);
					map.put(words,i+1);
				}
				else
				{
					map.put(words,1);
				}
			}

		
		System.out.println("List of duplicate words");
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String,Integer> entry : entrySet)
		{
			if(entry.getValue()>1)
			{
				String key = entry.getKey();
				Integer value = entry.getValue();
				System.out.println(key+ " = " + value);
			}
		}
}
}