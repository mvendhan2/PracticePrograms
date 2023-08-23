package javaprogram;

public class countletters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		int index = 0,count=0;
		char[] a = str.toCharArray();
		for(int i=0;i<a.length;i++) {
			//if(!(a[i] == " ")) {
			for(int j=i;j<a.length;j++) {
				if(a[i] == a[j]) {
					count++;
					index = i;
				//	a[j]= " ";
				}
				
			}
		}
		}
	//	System.out.println("letter : "+a[index]+"count:"+count);
	}

//}
