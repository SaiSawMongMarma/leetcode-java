//Find the Duplicate Number
//WE can solve with HashSet or Swapping but we can't use data structure
//Wethout modifying the array we are using Tortoise and Hare Algorithm
//Linked List Cycle Finding Duplicate
//Time=O(n) Space=O(1)

public class leetcode_287 {
    public int findDuplicate(int[] nums) {
        // Initialize the slow and fast pointers
        int slow = nums[0];
        int fast = nums[nums[0]];

        // Find the intersection point of the two runners
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        // Find the "entrance" to the cycle
//        Initiating Again slow from 0
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

//        Both are at the same position
        return slow;
    }
}