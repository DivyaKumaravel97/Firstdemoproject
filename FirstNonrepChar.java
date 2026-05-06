package com.example.Stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonrepChar {

	public static void main(String[] args) {
        String str = "Java programing Language";
        
        // Non-repeat Characters 
        Character c=str.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).
        		    entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);

	
        System.out.println(c);
        
        // repeat Characters
        Character ch=str.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).
        		     entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).findFirst().orElse(null);
	
        System.out.println(ch);
	
	}

}
