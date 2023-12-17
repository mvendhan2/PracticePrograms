package javaprogram;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, row=5; 
		//outer loop for number of rows 
		for(x=0; x<row; x++) 
		{ 
		//inner loop for columns 
		for(y=2*(row-x); y>=0; y--) 
		{ 
		//To prints spaces
		System.out.print(" "); 
		}
		//Inner loop for columns
		for(y=0; y<=x; y++)
		{
		//To prints stars
		System.out.print("* ");
		}
		//Cursor goes to the new line after printing each line
		System.out.println();
		} 
		}	
	}	



