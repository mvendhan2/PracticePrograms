package javaprogram;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 454;
		int copynum = num;
		int remainder;
		int revernum=0;
		while(num > 0) {
			remainder = num%10;
			revernum = (revernum *10)+remainder;
			num = num/10;
		}
		if(copynum==revernum) {
			System.out.println("true");
		}else {
			System.out.println("fale");
		}
		
	}

}
