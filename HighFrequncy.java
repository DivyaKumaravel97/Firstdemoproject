
import java.util.Map;
import java.util.stream.Collectors;

public class HighFrequncy {

	public static void main(String[] args) {
		String s="bbaaac";
		Map<Character, Long> map = s.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		long max = map.values().stream().mapToLong(v -> v).max().orElse(0);
		map.entrySet().stream()
		.filter(e -> e.getValue() == max)
		.forEach(System.out::println);



	}

}
