package javaprogram;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcab";
		int maxLength = 0;
		for(int i = 0;i<s.length();i++) {
			StringBuilder str = new StringBuilder();
			for(int j =i;j<s.length();j++) {
				System.out.println(s.charAt(j));
				if(str.indexOf(String.valueOf(s.charAt(j))) != -1) {
					break;
				}
			str.append(s.charAt(j));
			maxLength = Math.max(maxLength, str.length());
			}
			
		}
		System.out.print(maxLength);
		
	}

}
