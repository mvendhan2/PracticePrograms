package javaprogram;

public class StaticProgram {
	 int c=0;
	StaticProgram(){
		c++;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticProgram s1 = new StaticProgram();
				StaticProgram s2 = new StaticProgram();
				StaticProgram s3 = new StaticProgram();
	}

}
