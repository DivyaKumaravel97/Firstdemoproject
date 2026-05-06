package com.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Seperatelist {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,1,2,4,5);
		
		Map<Integer,Long>fre=list.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
		
		System.out.println(fre);
		
		List <Integer>duplicate=fre.entrySet().stream().filter(i->i.getValue()>1).map(Map.Entry::getKey).
				                 collect(Collectors.toList());
		
		System.out.println(duplicate);
		
		List <Integer>unique=fre.entrySet().stream().filter(i->i.getValue()==1).map(Map.Entry::getKey).
                collect(Collectors.toList());
		System.out.println(unique);


	}

}
