package dec2023;
import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesByCounts {
    public static void main(String[] args) {
        int[] nums = {5, 3, 4, 2, 2, 3, 5};

        List<Integer> duplicates = findDuplicates(nums);
        
        System.out.println("Duplicate elements: " + duplicates);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
// int[] nums = {5, 3, 4, 2, 2, 3, 5};
        for (int num : nums) {
            int index = Math.abs(num) - 1;
            if (nums[index] < 0) {
                duplicates.add(Math.abs(num));
            } else {
                nums[index] = -nums[index];
            }
        }

        // Restore the array to its original state if needed

        return duplicates;
    }
}
