package javaprogram;

import java.util.Scanner;

public class prime {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int remainder;
    for (int i = 2; i <= n / 2; i++) {
        remainder = n % i;
        //if remainder is 0 than numberToCheckber is not prime and break loop. Else continue loop
        if (remainder == 0) {
            System.out.println( "not a prime");
            break;
        }else {
        	 System.out.println( "prime");
        }
    }
   
 
}
}

