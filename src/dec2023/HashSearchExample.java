package dec2023;

import java.util.HashMap;
import java.util.Map;

public class HashSearchExample {

    public static void main(String[] args) {
        int[] unsortedArray = {4, 2, 8, 1, 5, 7, 3, 6};
        int target = 5;

        int result = searchInUnsortedArray(unsortedArray, target);

        if (result != -1) {
            System.out.println("Target " + target + " found at index " + result);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }

    private static int searchInUnsortedArray(int[] array, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();

        // Hashing: Create a mapping of array elements to their indices
        for (int i = 0; i < array.length; i++) {
            indexMap.put(array[i], i);
        }

        // Search for the target in the hash map
        if (indexMap.containsKey(target)) {
            return indexMap.get(target);
        } else {
            return -1; // Target not found
        }
    }
}

