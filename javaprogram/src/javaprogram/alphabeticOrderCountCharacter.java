package javaprogram.src.javaprogram;

public class alphabeticOrderCountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "Mullai";
		char[] toChar = value.toCharArray();
		
		for(int i=0; i< toChar.length ; i++) {
			for(int j=0; j<toChar.length - i - 1; j++) {
				if(toChar[j] > toChar[j+1]) {
					char temp = toChar[j];
					toChar[j] = toChar[j + 1];
					toChar[j+1] = temp;
				}
			}
		}
		
		String newString = new String(toChar);
		
		System.out.println(newString);
	}

}
