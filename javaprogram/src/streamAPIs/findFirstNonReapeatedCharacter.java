package streamAPIs;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findFirstNonReapeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Programmer";
		name.chars()
		.mapToObj(c -> (char)c)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(entry -> entry.getValue() == 1)
		.map(Map.Entry::getKey)
		.findFirst()
		.ifPresentOrElse(character -> System.out.print(character),  
           () -> System.out.print("not able find"));

	}

}
