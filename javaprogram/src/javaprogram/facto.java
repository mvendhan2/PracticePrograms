package javaprogram;

import java.util.Scanner;

public class facto {
	public static void main(String args[])
    {
        int fact=1,num,i; 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter The Number That You Want Factorial : \n\n");
        num = sc.nextInt();
 
  for(i=1;i<=num;i++)
  {
   fact=fact*i;
  }
    
  System.out.print("\nFactorial Is = "+fact); 
 }
}
