package javaprogram;
public class Question39 {
	public static void main(String[] args) {
		car c = new car();
		c.getobject().driver();
	}
}
abstract class vehicle {
	
	public vehicle getobject() {
		return this;
	}
	
	public void driver() {
		System.out.println("Driving from vehicle");
	}

}

class car extends vehicle{
	public void driver() {
		System.out.println("Driving from car");
	}
}

