

 abstract class AbstractSuperClass {
	// data members cant be abstract
	public int a = 10;
	
	// myMethod() is an abstract method
	abstract void myMethod();
	
	// myMethod(int x) is not an abstract method. Its a concrete method
	void myMethod(int x){
		System.out.println("I am in Super class and I am not an abstract method. I am a concrete method");
	}
 
}


public class Abstractclass extends AbstractSuperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abstractclass obj = new Abstractclass();
		System.out.println("I am a data member from Super class and my value is " + obj.a);
		obj.myMethod();
		obj.myMethod(20);
	}

	public void myMethod() {
		// TODO Auto-generated method stub
		System.out.println("I am in child class");
	}
	

}
