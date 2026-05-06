package com.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Squareofnumbers {

	public static void main(String[] args) {
		 List<Integer>numbers=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		 List<Integer>evensqure=numbers.stream().filter(n->n%2==0).map(a->a*a).collect(Collectors.toList());
         System.out.println(evensqure);
         
         List<Integer>oddsquare=numbers.stream().filter(n->n%2!=0).map(a->a*a).collect(Collectors.toList());
         System.out.println(oddsquare);

	}

}
