package javaprogram;

import java.util.stream.IntStream;

public class isSorted {
	int[] array = { 1, 2, 3, 4, 5 };
	boolean isSorted = checkIsSortedPrimitiveArrayWithStream(array);
	System.out.println(isSorted); 	//true

}

public static boolean checkIsSortedPrimitiveArrayWithStream(
		final int[] array) {

		if (array == null || array.length <= 1) {
		  return true;
		}
		return IntStream.range(0, array.length - 1)
		  .noneMatch(i -> array[i] > array[i + 1]);
	}
}
