package javaprogram.src.NewJAVACodes;

import java.util.HashMap;
import java.util.Map;

public class LogestSubStringWithoutRepeatingCharInString {
    public static void main(String[] args) {
        String input1 = "abcabcbb";
        String output = "";
        Map<Character, Integer> map = new HashMap<>();
        for(int start = 0, end =0; end<input1.length(); end++){
            char Char = input1.charAt(end);
            if(map.containsKey(Char)){
                start = Math.max(map.get(Char) + 1, start);
            }
            if(output.length() < end - start + 1)
            {
                output = input1.substring(start, end + 1);
            }
            map.put(Char, end);
        }
        System.out.println(output);
    }
}
