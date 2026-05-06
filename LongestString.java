package com.example.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("apple","banana","cherry","watermelon","kiwi","strawberry");
		
		//First 3 longest string
		list.stream()
		.sorted(Comparator.comparingInt(String::length).reversed())
		.limit(3)
		.forEach(System.out::println);
		
		//Longest String from the array & List
		String[] arr = {"Java", "Microservices", "Spring", "API"};

        String longest = Arrays.stream(arr)
                                .max(Comparator.comparingInt(String::length))
                                .get();
        System.out.println(longest);
		 
		 List<String> list1 = Arrays.asList("Java", "Microservices", "SpringBoot", "API");
			String longeststr = list1.stream()
			        .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2)
			        .orElse("");
			 System.out.println(longeststr); 
			 
			 String longest1 = list.stream()
				        .max(Comparator.comparingInt(String::length))
				        .get(); 
			  System.out.print(longest1);;
			 


	}

}
