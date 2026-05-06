package com.example.Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseWord {

	public static void main(String[] args) {
String str="Hello World";
String result=(String) Arrays.stream(str.split(" ")).collect(Collectors.collectingAndThen
		(Collectors.toList(),list->{Collections.reverse(list);return String.join(" ",list);}));

System.out.println(result);
	}
}
