package com.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOp {

	public static void main(String[] args) {
    List<String>name=Arrays.asList("Reflection","Collection","Stream","Structure","Sorting","State");
    //forEach
    name.stream().forEach(System.out::println);
    
    //Collect
    List<String>namecollect=name.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
    System.out.println("collect() method  -->"+namecollect);
    
    //reduce()
    String concate=name.stream().reduce("", (Paritialstring,element)->Paritialstring+" "+element);
    System.out.println("reduce()--> "+concate);
    //count()
    long count =name.stream().count();
    System.out.println("count()->  "+count);
    
    //allMatch();
    boolean allstartwithS=name.stream().allMatch(names->names.startsWith("S")); 
    
    System.out.println(allstartwithS);
    
    //anyMatch
    boolean anystartwithS=name.stream().anyMatch(names->names.startsWith("S")); 
    System.out.println(anystartwithS);


	}

}
