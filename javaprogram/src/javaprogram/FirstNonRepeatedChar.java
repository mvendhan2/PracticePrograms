package javaprogram;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		  String str1 = "character";
		  System.out.println("The given string is: " + str1);
		  for (int i = 0; i < str1.length(); i++) {
		   boolean unique = true;
		   System.out.println("I : " + str1.charAt(i)+" "+i);
		   for (int j = 0; j < str1.length(); j++) {
			   System.out.println("j : " + str1.charAt(j)+" "+j);
		    if (i != j && str1.charAt(i) == str1.charAt(j)) {
		     unique = false;
		     break;
		    }
		   }
		   if (unique) {
		    System.out.println("The first non repeated character in String is: " + str1.charAt(i));
		    break;
		   }
		  }
	}

}
