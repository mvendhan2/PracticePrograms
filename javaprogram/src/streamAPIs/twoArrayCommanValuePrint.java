package streamAPIs;

import java.util.Arrays;
import java.util.List;

public class twoArrayCommanValuePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = Arrays.asList(1,2,3,1,1,3);
		list1.stream().distinct()
		.filter(i -> list2.contains(i))
		.forEach(System.out::println);

	}

}
