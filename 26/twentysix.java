/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

 

Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 

Constraints:

1 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.
 
 */

 class Solution {
    public int removeDuplicates(int[] nums) {
        // If the array is empty, return 0
        if (nums.length == 0) return 0;
        
        // Initialize the pointer for the position of non-duplicate elements
        int position = 0;

        // Iterate through the array
        for(int i = 1; i < nums.length; i++) {
            // If the current element is not the same as the previous one
            if (nums[i] != nums[position]) {
                // Increment the position
                position++;
                // Assign this non-duplicate element to the position pointer
                nums[position] = nums[i];
            }
        }

        // The number of distinct elements is the final position + 1
        return position + 1;
    }
}

public class twentysix {
    public static void main(String[] args) {
        Solution solution = new Solution();
    
        int[] nums1 = {1,1,2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println(k1); // Output: 2
        for(int i=0; i<k1; i++) {
            System.out.print(nums1[i] + " "); // Output: 1 2
        }
        System.out.println();
    
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        int k2 = solution.removeDuplicates(nums2);
        System.out.println(k2); // Output: 5
        for(int i=0; i<k2; i++) {
            System.out.print(nums2[i] + " "); // Output: 0 1 2 3 4
        }
        System.out.println();
    
        int[] nums3 = {};
        int k3 = solution.removeDuplicates(nums3);
        System.out.println(k3); // Output: 0
    
        int[] nums4 = {1,1,1,1,1};
        int k4 = solution.removeDuplicates(nums4);
        System.out.println(k4); // Output: 1
        for(int i=0; i<k4; i++) {
            System.out.print(nums4[i] + " "); // Output: 1
        }
        System.out.println();
    }
    
}
