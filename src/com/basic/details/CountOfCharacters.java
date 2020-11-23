package com.basic.details;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfCharacters{
public static void main(String[] args){

String s = "NittinRawat";

Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();

for(int j=0;j<s.length();j++)
    {
       char c = s.charAt(j);
      if(map.containsKey(c))
         {
             Integer i = map.get(c);
             i++;
             map.put(c,i);
          }
       else
          {
             map.put(c,1);
           }
    }
       System.out.println(map);
}
}
  
