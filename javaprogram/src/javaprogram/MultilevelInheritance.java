package javaprogram;
class one{
	int b =20;
}
class two extends one{
	int a = 10;
}
public class MultilevelInheritance extends two{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelInheritance m = new MultilevelInheritance();
		System.out.println(m.a+" "+m.b);
	}

}
