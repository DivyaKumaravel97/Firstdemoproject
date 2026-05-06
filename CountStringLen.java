package com.example.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CountStringLen {

	public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring Boot", "AI", "Stream");
        List<String>sorted=list.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println("sorted based string length"+sorted);

        list.sort(Comparator.comparing(String::length));
        list.forEach(System.out::println);
        
        //Count how many elements start with a given letter
        List<String> string = Arrays.asList("Apple", "Ant", "Ball", "Axe", "Cat");
         long count=string.stream().filter(s->s!=null&&s.startsWith("A")).count();
         System.out.println(count);
//or
         
     long strcnt=string.stream().filter(s->s!=null&&s.startsWith("A")).collect(Collectors.counting());   
     System.out.println(strcnt);
     
     
	}

}
