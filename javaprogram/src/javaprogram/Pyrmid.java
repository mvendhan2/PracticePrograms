package javaprogram;

public class Pyrmid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,num=5;
		for(x=0 ; x<num; x++) {
			for(y=num-x ; y>=1 ; y--) {
				System.out.print("*");
			}
			for(y=0;y<=x;y++) {
				System.out.print("1 ");
			}
			System.out.println();
		}
	}

}
