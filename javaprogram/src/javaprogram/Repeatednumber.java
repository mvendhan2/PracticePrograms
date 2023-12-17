package javaprogram;

public class Repeatednumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,1,3,3,5};
		int count =1,index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					index = i;
					arr[j] = 0;
				}
			}
			}
			if(count>=1 && arr[i]!=0 ) {
				System.out.println(arr[i]+" "+count);
				
			}
			count = 1;
		}
	}

}
