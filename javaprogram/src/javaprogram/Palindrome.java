package javaprogram;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palindrome ="mam";
		int j = palindrome.length() - 1;
		for(int i =0; i<palindrome.length()/2;i++) {
			if(palindrome.charAt(i) != palindrome.charAt(j-i)) {
				System.out.println("fale");
				break;
			}else {
				System.out.println("true");
				break;
			}
		}
	}

}
