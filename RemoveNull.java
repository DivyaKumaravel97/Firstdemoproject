package com.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNull {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "", null, "Spring", " ", "Boot");
		 List<String>nonempty=list.stream().filter(s->s!=null&&!s.trim().isEmpty()).collect(Collectors.toList());
		 
		 System.out.println(nonempty);
	}

}
