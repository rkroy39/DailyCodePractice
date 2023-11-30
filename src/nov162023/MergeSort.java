package nov162023;
import java.lang.*;
import java.util.*;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
    	//System.out.println();
       int[] array = {38, 27, 43, 3, 9, 82, 10};
        
        System.out.println("Unsorted Array: " + Arrays.toString(array));

        mergeSort(array, 0, array.length - 1);

       System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Find the middle point
            int middle = (left + right) / 2;

            // Recursively sort the first and second halves
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            // Merge the sorted halves
            merge(array, left, middle, right);
        }
    }

    public static void merge(int[] array, int left, int middle, int right) {
        // Sizes of the two subarrays to be merged
        int sizeLeft = middle - left + 1;
        int sizeRight = right - middle;

        // Create temporary arrays
        int[] leftArray = new int[sizeLeft];
        int[] rightArray = new int[sizeRight];

        // Copy data to temporary arrays
        for (int i = 0; i < sizeLeft; ++i) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < sizeRight; ++j) {
            rightArray[j] = array[middle + 1 + j];
        }

        // Merge the temporary arrays

        // Initial indexes of the subarrays
        int i = 0, j = 0;

        // Initial index of the merged subarray
        int k = left;

        while (i < sizeLeft && j < sizeRight) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[] if any
        while (i < sizeLeft) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[] if any
        while (j < sizeRight) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

