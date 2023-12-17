package javaprogram;

public class duplicatecharacterremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char b = 0, c = 0;
		String str = "madam";
		char[] a = str.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i; j++) {

				if (str.charAt(i) == str.charAt(j)) {

					b = str.charAt(i);
					
					break;
				} else {
					c = str.charAt(j);
					System.out.print(c);
				}
			}
		}
	}
}
