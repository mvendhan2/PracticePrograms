package javaprogram;

import java.util.Arrays;
import java.util.Scanner;

public class miniumnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,3,5,7,9};
		int arr1[] = {1,2,4,6,8};
		int min1 = arr[0];
		int min2 = arr1[0];
		int temp = 0;
		int i, j;
		for( i=1;i<arr.length;i++) {
			if(min1 > arr[i]) {
				min1 = arr[i];
			}
		}
		for( j=1;j<arr1.length;j++) {
			if(i==j) {
		if(min2>arr1[j]) {
				min2=arr1[j+1];
			}
			}
			
		}
		
		
		System.out.println("minimum value of array1: "+min1);
		System.out.println("minimum value of array2: "+min2);
		temp = min1+min2;
		System.out.println("sum of minimum value: "+temp);
		
		
	}

}
