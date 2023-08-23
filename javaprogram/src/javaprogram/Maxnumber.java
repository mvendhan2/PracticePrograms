package javaprogram;

public class Maxnumber {
	public static void main(String[] args) {
		int arr[] = { 1, 222, 332, 41, 98 };
		int max = arr[0];
		//int j = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
//				arr[i]=arr[j-i];
//				arr[j-i]=max;
			}
			
		}
		System.out.println(max);
	}
}
