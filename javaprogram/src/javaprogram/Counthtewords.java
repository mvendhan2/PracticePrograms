package javaprogram;

public class Counthtewords {
	public static void main(String[] args) {
		String str = "big black bug bit a big black dog on his big black nose";  
		String str1 = str.toLowerCase();
		String[] split = str.split(" ");
		String returnvalue = null ;
		int count = 1;
		for(int i=0;i<split.length;i++) {
			for(int j=i+1;j<split.length;j++) {
				if(split[i] != null) {
				if(split[i].equals(split[j])) {
					returnvalue = split[i];
					count = count + 1;
					split[j] = null;
				}
			}
			}
			if(count>=1 && split[i]!=null)
			System.out.println("word is : " + split[i] + " count is : "+count);
		count = 1;
		}
		
		
		
	}
}
