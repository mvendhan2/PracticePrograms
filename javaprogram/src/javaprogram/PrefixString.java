package javaprogram.src.javaprogram;

import java.util.Arrays;

public class PrefixString {
    public static void main(String[] args) {
        String value = "Fy, Fyers, Fower, FlDog";
        String[] words = value.split(",\\s*"); // Split the input string into individual words

        String val = Arrays.stream(words)
                .reduce((s1, s2) -> {
                    int i = 0;
                    while (i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i)) {
                        i++;
                    }
                    return s1.substring(0, i);
                })
                .orElse("");
        System.out.println(val);
    }
}
