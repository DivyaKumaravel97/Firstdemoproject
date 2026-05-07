
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Findsecondlargest {

	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 4, 45, 99, 99);
        int secondHighest=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(null);
        System.out.println(secondHighest);
        
        // second smallest number
        int secondLowest=list.stream().distinct().sorted().skip(1).findFirst().orElseThrow(null);
        System.out.println(secondLowest);
        
        //retrieve the 5th element from list
        List<String>lista=Arrays.asList("a","b","c","d","e");
        String res=lista.stream().skip(4).findFirst().orElseThrow(null);
        System.out.println(res);
	}

}
