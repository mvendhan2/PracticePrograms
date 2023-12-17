package javaprogram;

import java.util.Arrays;

public class max1standmin1st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,4,5,2,1};
		int n = arr.length;
		Arrays.sort(arr);
		int i = 0, j = n-1;
        while (i < j) {
            System.out.print(arr[j--] + " ");
            System.out.print(arr[i++] + " ");
        }
      
        // If the total element in array is odd
        // then print the last middle element.
        if (n % 2 != 0)
            System.out.print(arr[i]);
    }
	}


