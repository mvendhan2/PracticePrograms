package javaprogram;

public class StringReverse {

	public static void main(String[] args) {

		String name = "123456";
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
	}
}
