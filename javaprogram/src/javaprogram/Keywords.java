package javaprogram;

public class Keywords {
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Keywords k = new Keywords();
		System.out.println(k.hashCode());
		k = null;
		System.gc();
		
		Exception e = new Exception();
	}


}
