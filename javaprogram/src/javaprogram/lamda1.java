package javaprogram;
interface intref{
	public void m1();
}
public class lamda1 {
	static int x = 12;
	public lamda1(int i) {
		// TODO Auto-generated constructor stub
		this.x= i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intref i =()->{
			System.out.println(x);
		};
		i.m1();
	}

}
