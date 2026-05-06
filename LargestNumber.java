package com.example.Stream;

import java.util.*;

public class LargestNumber {

	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 50, 20, 80, 60);
        int largestno=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(() -> new RuntimeException("No second largest"));
        Optional<Integer>num=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(largestno);
        System.out.println(num);
        Optional<Integer>num1=list.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst();

        System.out.println(num1);
        
        //
        List<Integer> numbers = Arrays.asList(10, 45, 23, 89, 5, 67);
        int max = numbers.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println("Largest number: " + max);

        
        int[] arr = {10, 45, 23, 89, 5, 67};

        int maxno = Arrays.stream(arr).max().getAsInt();

        System.out.println("Largest number: " + maxno);

	}

}
