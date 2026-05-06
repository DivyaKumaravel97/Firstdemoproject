package com.example.Stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxOccurrenceChar {

	public static void main(String[] args) {
		String input = "Java";
		 Map.Entry<Character, Long>fcount=input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	                               .entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
		 System.out.println(fcount);
		 System.out.println("Output : Most frequent char → '" 
				 + fcount.getKey() + "' and count → " + fcount.getValue());
		 

	}

}
