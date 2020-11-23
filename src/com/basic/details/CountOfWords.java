package com.basic.details;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfWords{
public static void main (String[] args){
  
    String s = "hey god dear god please god dear god i like you";
    String[] split  =  s.split(" ");

    Map<String,Integer> map = new LinkedHashMap<String,Integer>();
    
     for(String x : split)
      {
          if(map.containsKey(x))
               {
                   Integer i = map.get(x);
                   i++;
                   map.put(x,i);
               }
          else
              {
                 map.put(x,1);
              }
      }
    System.out.println(map);
}
}

                   


