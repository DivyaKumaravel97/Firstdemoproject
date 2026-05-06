package com.example.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortlistReverse {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 5, 30, 20);
		List<Integer>reverorder=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverorder);
	}

}
