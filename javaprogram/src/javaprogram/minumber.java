package javaprogram;

public class minumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,1,5,7,9};
		int arr1[] = {1,2,4,6,8};
		int min = arr[0];
		int min1 = arr1[0];
		int index = 0;
		int index1 = 0;
		int i, j;
		for (i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				index = i;
			}
		}
		for (j = 0; j < arr1.length; j++) {
			if (min > arr[j]) {
				min1 = arr[j];
				index1 = j;
			}

		}

		if (index == index1) {
			int k,l;
			for (k = 0; k < arr.length; k++) {
				for ( l = k + 1; l < arr.length; ++l) {
					if (arr[k] > arr[l]) {
						int temp = arr[k];
						arr[k] = arr[l];
						arr[l] = temp;
					}
				
				}
			}

		}
		min = arr[1];
		int sum = min + min1;
		System.out.println("sum of min value is :" + sum);

		System.out.println("min number of arr: " + min);
		System.out.println("min number of arr1: " + min1);
		System.out.println("index " + index);
		System.out.println("index1 " + index1);
	}

}
