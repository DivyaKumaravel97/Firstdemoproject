package com.example.Stream;

import java.util.Arrays;
import java.util.List;

public class FindMaxMin {

	public static void main(String[] args) {
		 int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 int maxno=Arrays.stream(arr).max().getAsInt();
		 int minno=Arrays.stream(arr).min().getAsInt();
		 System.out.println("Max number  from array "+maxno);
		 System.out.println("Min number  from array "+minno);

		 
		 List<Integer>max=Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
		 int nomax=max.stream().max(Integer::compare).get();
		 System.out.println("Max number  arrayList  "+nomax);
		 int min=max.stream().min(Integer::compare).get();
		 System.out.println(min);

	}

}
