
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Findduplicates {

	public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,5,3};
         Set<Integer>unique=new HashSet<>();
         Set<Integer>duplicate=Arrays.stream(arr).filter(r->!unique.add(r)).boxed().collect(Collectors.toSet());
         System.out.println(duplicate);
         
           List<Integer>numbers=Arrays.asList(1,2,3,4,2,3,5,3);
           Set<Integer>unique1=new HashSet<>();
           Set<Integer>duplicates=numbers.stream().filter(n->!unique1.add(n)).collect(Collectors.toSet());
           System.out.println("Dupliactes from Arraylist" +duplicates);
           
           //Find Common Duplicates Between Two Arrays
           
           int[] arr1 = {1, 2, 3, 4, 5};
           int[] arr2 = {4, 5, 6, 7, 8};
           
           Set<Integer>set1=Arrays.stream(arr1).boxed().collect(Collectors.toSet());
           System.out.println(set1);
           Set<Integer>set2=Arrays.stream(arr2).filter(set1::contains).boxed().collect(Collectors.toSet());
	       System.out.println(set2);
	       
	       //Find Common Duplicates Between Two ArrayLists
	       List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
	       List<Integer> list2 = Arrays.asList(4,5,6,7,8,9);

	       List<Integer> duplicates1 = list1.stream()
	               .filter(list2::contains)
	               .collect(Collectors.toList());
	       System.out.println(duplicates1);
	       
    int input[]= {3,5,3,2,8,5,6,2,8};	
    List<Integer>uniqueno=Arrays.stream(input).boxed().distinct().collect(Collectors.toList());
    System.out.println(uniqueno);
	}
	
	

}
