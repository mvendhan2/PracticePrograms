package javaprogram.src.NewJAVACodes;

import java.util.*;
public class SynchronizedUsingHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();

        // Add element to map
        hmap.put(1, "Akshay");
        hmap.put(2, "Bina");
        hmap.put(3, "Chintu");

        // Get synchronized map using
        // Collections.synchronizedMap()
        Map<Integer, String> synchrMap = Collections.synchronizedMap(hmap);

        System.out.println("Synchronized Map : ");

        // Synchronized block
        synchronized (synchrMap) {

            // Iterate synchronized map
            for (Map.Entry<Integer, String> entry :
                    synchrMap.entrySet()) {

                // Print key : value
                System.out.println(entry.getKey() + " : "
                        + entry.getValue());
            }
        }
    }
}
