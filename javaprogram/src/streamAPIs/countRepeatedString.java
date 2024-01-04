package streamAPIs;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class countRepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Mullai Vendhan";
		Map<Character, Long> entryValue = inputString.chars().mapToObj(c -> (char)c)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		entryValue.entrySet().stream()
		.forEach(entry -> System.out.println(entry.getKey() + ":"+ entry.getValue()));
		
		Iterator<Map.Entry<Character, Long>> iterator = entryValue.entrySet().iterator();
		while(iterator.hasNext()) {
			 Entry<Character, Long> entry = iterator.next(); 
			 if(entry.getValue() <=1) {
				 iterator.remove();
			 }else {
				 System.out.println("character "+entry.getKey() + " "+ "Count "+entry.getValue());
			 }
		}

	}

}
