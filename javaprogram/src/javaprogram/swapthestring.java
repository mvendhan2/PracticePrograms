package javaprogram;

public class swapthestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Good morning";
		String str1[] = str.split(" ");
		String a = str1[0];
		String b = str1[1];
		a = a + b;
		b = a.substring(0, (a.length() - b.length()));
		a = a.substring(b.length());
		String c = a +" "+b;
		System.out.println("String after swaping: "+ a +" " + b);
	}

}
