package javaprogram;

class abc{
	
	public static void sum(int a, float b) {
		System.out.println(a+b);
	}
	public static void sum(float a) {
		System.out.println(a);
	}
}
public class Overloading extends abc{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc.sum(5,10);
		
	}
	
	
}
