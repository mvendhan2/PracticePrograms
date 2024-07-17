package javaprogram.src.NewJAVACodes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveSecondHighestNumber {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        map.put("E", 50);

        // Find second highest value
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        
        for(int value : map.values()){
            if(value > highest){
                secondHighest = highest;
                highest = value;
            } else if (value > secondHighest && value != highest) {
                secondHighest = value;
            }
        }

        Iterator < Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() == secondHighest) {
                iterator.remove();
                break; // Assuming we want to remove only the first occurrence
            }
        }

        System.out.println("HashMap after removing the second highest element:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        }
    }
