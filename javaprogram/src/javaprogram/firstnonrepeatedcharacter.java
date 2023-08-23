package javaprogram;
public class firstnonrepeatedcharacter {
  public static void main(String[] args) {
	  String str = "information";
	  char[] a = str.toCharArray();
	  int count = 0;
	  for(int i =0 ; i<a.length;i++) {
		  count = 0;
		  for(int j =i+1;j<a.length;j++) {
			  if(str.charAt(i)==str.charAt(j)) {
				  count++;
			  }
		  }
		  if(count == 0) {
			  System.out.println(str.charAt(i));
			  break;
		  }
	  }
 }
}