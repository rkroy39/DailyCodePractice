package dec2023;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4,4, 2, 2};

        int duplicate = findDuplicate(nums);
        
        System.out.println("Duplicate element: " + duplicate);
    }

    public static int findDuplicate(int[] nums) {
        // Initialize the tortoise and hare
        int tortoise = nums[0];
        int hare = nums[0];

        // Phase 1: Detect the intersection point
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Phase 2: Find the entrance to the cycle
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        // The hare and tortoise meet at the entrance to the cycle
        return hare;
    }
}


	