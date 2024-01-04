package streamAPIs;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class stringPalindromw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "kalai";
		char[] charArray = value.toCharArray();
		Boolean bool = IntStream.range(0, charArray.length /2)
		.noneMatch(i -> charArray[i] != charArray[charArray.length - i - 1]);
		System.out.println(bool);
	}

}
