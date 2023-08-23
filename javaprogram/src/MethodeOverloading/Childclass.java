package MethodeOverloading;

public class Childclass extends ParentClass{
	
	public static void m() {
		System.out.println("class b methode");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass a = new Childclass();
		a.m();
		
		Childclass b = (Childclass) new ParentClass();
		b.m();
		
	}
	

}
