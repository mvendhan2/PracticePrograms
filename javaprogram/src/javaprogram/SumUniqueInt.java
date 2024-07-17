package javaprogram.src.javaprogram;

import java.util.Arrays;

public class SumUniqueInt {
    public static void main(String[] args) {
        int[] value = new int[]{1, 2, 4, 5, 6, 4};
        int sum = Arrays.stream(value)
                .distinct()
                .sum();

        System.out.println("Sum of unique elements: " + sum);

        int sum1 = 0;
        for (int i = 0; i < value.length; i++) {
            boolean isUnique = true;

            // Check if the current element is unique
            for (int j = 0; j < value.length; j++) {
                if (i != j && value[i] == value[j]) {
                    isUnique = false;
                    break;
                }
            }

            // If the element is unique, add it to the sum
            if (isUnique) {
                sum1 += value[i];
            }
        }
        System.out.println(sum1);
    }
}
