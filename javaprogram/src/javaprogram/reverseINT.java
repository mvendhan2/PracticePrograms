package javaprogram;

public class reverseINT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 122330;
		int reverse = 0, digit ;
		while(a!=0) {
		digit = a%10;
		reverse = (reverse*10)+digit;
		a=a/10;
		}
		System.out.println(reverse);
	}

}
