package javaprogram;

public class statickeyword {
	
  int counter = 0;
 
 statickeyword(){
	 counter++;
	 System.out.println(counter);
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		statickeyword s = new statickeyword();
		statickeyword s1 = new statickeyword();
		statickeyword s2 = new statickeyword();

	}

}
