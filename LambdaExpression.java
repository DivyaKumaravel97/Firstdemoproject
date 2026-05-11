
import java.util.Arrays;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {
		
    List<String>map=Arrays.asList("Java","Spring Boot","Lambda");
    map.stream().map(String::toUpperCase).forEach(System.out::println);
   
    //Lambda with Custom sorting
    map.sort((s1,s2)->s1.compareTo(s2));
    map.forEach(System.out::println);
	}

}
