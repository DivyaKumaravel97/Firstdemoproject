package com.example.Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Highfrequence {

	public static void main(String[] args) {
        String sentence = "Java is easy and Java is great java is powerful";

		 Map<String, Long> freqMap =
	                Arrays.stream(sentence.toLowerCase().split("\\s"))
	                      .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
		  System.out.println(freqMap);

	        long maxCount = Collections.max(freqMap.values());

	        List<String> result =
	                freqMap.entrySet().stream()
	                       .filter(e -> e.getValue() == maxCount)
	                       .map(Map.Entry::getKey)
	                       .collect(Collectors.toList());

	        System.out.println("Highest frequency words: " + result);
	        System.out.println("Count: " + maxCount);
	        
	        
	        //High frequency using comparing By value
	        Map.Entry<String, Long> result1 =
	                Arrays.stream(sentence.toLowerCase().split("\\s"))
	                      .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
	                      .entrySet()
	                      .stream()
	                      .max(Map.Entry.comparingByValue())
	                      .get();

	            System.out.println("Highest frequency word: " + result1.getKey());
	            System.out.println("Count: " + result1.getValue());
	}

}
