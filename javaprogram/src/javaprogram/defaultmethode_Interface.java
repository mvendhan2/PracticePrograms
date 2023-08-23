package javaprogram;
interface left{
	default void m1() {
		System.out.println("Left methode");
	}
}
interface right{
	default void m2() {
		System.out.println("Right methode");
	}
}
public class defaultmethode_Interface implements left,right {
	public void m1() {
		//System.out.println("overriding by using own methode");
		//left.super.m1();
		right.super.m2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		defaultmethode_Interface di =new defaultmethode_Interface();
		di.m1();
	}

}
