
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1,2,3,4);
		List<Integer> b = Arrays.asList(2,4,6);
		List<Integer>common=a.stream().filter(b::contains).collect(Collectors.toList());
		System.out.println(common);
		System.out.println("Testing with git commit");
		System.out.println("Test"); 
		
		
		
		

	}

}
