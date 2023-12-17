package javaprogram;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicatesInIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1, 2,2,2,2, 3, 4, 2, 7, 8, 8, 3, 3};
//		Set<Integer> s = new HashSet<Integer>();
//		for(int i=0;i<obj.length;i++) {
//			for(int j=i+1;j<obj.length;j++) {
//				
//					if(obj[i]==obj[j]) {
//						s.add(obj[j]);
//					}
//			}
//		}
//		
//		System.out.println(s);
		
		// Calculate the length of the new array without duplicates
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    // Shift elements to the left to overwrite duplicates
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--; // Reduce the array length
                    j--; // Check the same index again
                }
            }
        }

        // Create a new array with unique elements
        int[] uniqueArr = new int[n];
        System.arraycopy(arr, 0, uniqueArr, 0, n);

        // Print the unique elements
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
	}

}
