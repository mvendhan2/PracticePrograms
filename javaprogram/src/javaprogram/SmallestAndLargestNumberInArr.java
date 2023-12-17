package javaprogram;

public class SmallestAndLargestNumberInArr {

	 public static void main(String args[])
	  {
	     int arr[] = {94594, 232, 434, 33 , 3};
	     int min = arr[0];
	     for(int i=1; i<arr.length; i++) { if(min > arr[i])
	         {
	            min = arr[i]; 	
	         }
	     }
	     System.out.println("The minimum element is " + min); 
	     
	  // Initialize the maximum value to the first element of the array
	        int max = arr[0];

	        // Iterate through the array to find the maximum value
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        System.out.println("The largest integer in the array is: " + max);
	  }
}
