package javaprogram;

public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x,y,num=5;
			
			for(x=0 ; x<num ; x++) {
				for(y=2*(num-x); y>=0; y--) {
					System.out.print("*");
				}
				for(y=0; y<=x; y++)
				{
					System.out.print("* ");
				
				}
				System.out.println();
			}
			
			
                                                                                        	}

}
