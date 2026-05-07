
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOddNumber {

	public static void main(String[] args) {
		
	//	Find Even numbers
     List<Integer>numbers=Arrays.asList(45,78,62,3,95);
     List<Integer>oddnum=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
     //oddnum.forEach(System.out::println);
     System.out.println(oddnum);
	 
   //Find odd numbers
     List<Integer>number=Arrays.asList(45,78,62,3,95);
     List<Integer>oddnumbers=number.stream().filter(n->n%2!=0).collect(Collectors.toList());
     System.out.println(oddnumbers);
	 
	}

}
