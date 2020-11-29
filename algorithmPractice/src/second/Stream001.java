package second;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream001 {
	public static void main(String[] args) {
		String[] arr = new String[] {"a", "b", "c"};
		Stream<String> stream = Arrays.stream(arr);
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
		
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> stream2 = list.stream();
		Stream<String> parallelStream = list.parallelStream();
		
		Stream<String> builderStream = Stream.<String>builder().add("a").add("b").add("c").build();
		
		Stream<String> generatedStream = Stream.generate(() -> "gen").limit(3);
		
		
	}
}
