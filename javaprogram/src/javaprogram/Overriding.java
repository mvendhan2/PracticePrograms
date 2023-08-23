package javaprogram;

class lusu1 {
	public static void m() {
		System.out.println("Parentclass - a-b");
	}
}

class lusu2 extends lusu1{
	public static void m() {

		System.out.println("Child class a+b");
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lusu1 l = new lusu2();
		l.m();
	}

	

	
}
