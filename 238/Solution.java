/*
    Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 * 
 */

 class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        // Create arrays left, right and answer of the same size as nums
        int[] left = new int[n];
        int[] right = new int[n];
        int[] answer = new int[n];

        // left[i] contains the product of all the numbers to the left of i
        // Note: for the element at index 0, there are no elements to the left, 
        // so left[0] would be 1
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }

        // right[i] contains the product of all the numbers to the right of i
        // Note: for the element at index n - 1, there are no elements to the right,
        // so right[n - 1] would be 1
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }

        // Construct the answer array
        for (int i = 0; i < n; i++) {
            answer[i] = left[i] * right[i];
        }

        return answer;
    }
}