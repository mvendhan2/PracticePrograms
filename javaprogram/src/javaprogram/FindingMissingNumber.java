package javaprogram;

public class FindingMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,6};
		int n = num.length + 1;
		int sum=n*(n+1)/2;
        int restSum=0;
        for (int i = 0; i < num.length; i++) {
            restSum+=num[i];
        }
        int missingNumber=sum-restSum;
        System.out.println(missingNumber);
	}

}
