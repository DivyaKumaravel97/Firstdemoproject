package com.example.Stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class NonrepaetNumber {

	public static void main(String[] args) {
int arr[]= {4, 1, 2, 1, 2};
 Integer nonrepeatno=Arrays.stream(arr).boxed().collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet().
		    stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
 System.out.println(nonrepeatno);
	}

}

