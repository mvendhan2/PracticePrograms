package javaprogram.src.NewJAVACodes;

import javax.xml.transform.Source;

public class FindMissingIntegerNumber {
    public static void main(String[] args) {
        int arr[] = {4,5,2,1};
        int total = arr.length + 1;
        int expectedSum = total *((total + 1) / 2);
        int totalSum = 0;
        for(int a : arr){
            totalSum +=a;
        }
        System.out.println(expectedSum-totalSum);
    }
}
