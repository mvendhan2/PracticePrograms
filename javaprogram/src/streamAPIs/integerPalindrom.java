package streamAPIs;

import java.util.stream.IntStream;

public class integerPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 12321;
		String numstr = String.valueOf(value);
		String rever = IntStream.range(0, numstr.length())
		.mapToObj(n -> numstr.charAt(numstr.length() -n -1))
		.map(String::valueOf)
		.reduce("",String::concat);
		System.out.println(String.valueOf(value).equals(rever) ? true: false); 		
		
		Boolean bool = IntStream.range(0, numstr.length()/2)
				.noneMatch(i -> numstr.charAt(i) != numstr.charAt(numstr.length() - i -1));
		System.out.println(bool);
				
	}

}
