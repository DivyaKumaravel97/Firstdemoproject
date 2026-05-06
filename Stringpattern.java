package com.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stringpattern {

	public static void main(String[] args) {
		String s = "abcd";
		String result=IntStream.range(0, s.length()).mapToObj(i->String.valueOf(s.charAt(i)).repeat(i + 1))
				.collect(Collectors.joining());
		System.out.println(result);
		
		
		
}
}