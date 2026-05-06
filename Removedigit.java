package com.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Removedigit {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("abc", "ab1c", "hello", "h3i");
		List<String>digitlst=list.stream().filter(s->!s.matches(".*\\d.*")).collect(Collectors.toList());
		System.out.println(digitlst);


	}

}
