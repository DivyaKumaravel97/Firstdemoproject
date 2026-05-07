
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Countwords {

	public static void main(String[] args) {
        String str = "Java is easy Java is Power java is great";
         Map<String,Long>wordCount=Arrays.stream(str.toLowerCase().split("\\s")).collect
        		                   (Collectors.groupingBy(w->w,Collectors.counting()));
         System.out.println(wordCount);
         
         List<String>list=Arrays.asList("Java","Stream","API");
         Map<String,Long>wordcnt=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
         System.out.println(wordcnt);
         
         Map<String,Integer>ecount=list.stream().collect(Collectors.toMap(w->w,String::length));
	     System.out.println(ecount);
	     
	     //Count Each Character (Frequency Map)
	     String str1 = "banana";
	     Map<Character,Long>charcnt=str1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(word->word,Collectors.counting()));
          System.out.println("Repeated character"+ charcnt);
          
         // how do u find the character with  2 end highest  frequency
          
          String s="abbcccd";
          Map<Character,Long>map=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(count->count,Collectors.counting()));
          Character res=map.entrySet().stream().sorted(Map.Entry.<Character,Long>comparingByValue().reversed()).skip(1).findFirst().get().getKey();
	System.out.println("Second hightest frequency  = "+res);
	
	String sentence="Java is Java and Java is great";
	Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet()
	.stream()
          .sorted(Map.Entry.<String, Long>comparingByValue().reversed()).forEach(System.out::println);
	
	}

}
