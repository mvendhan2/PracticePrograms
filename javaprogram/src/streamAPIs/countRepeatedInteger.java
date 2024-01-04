package streamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countRepeatedInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5,1,1,1,4,4);
		 Map<Integer, Long> val = list1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 val.entrySet().stream()
		 .forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));

	}

}
