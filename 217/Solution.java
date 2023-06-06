/* 
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 * 
 */

 class Solution {
    public boolean containsDuplicate(int[] nums) {
        /* 
            sorting arr = [1,1,2,3]

            two pointers
            start at pos 0. end pos 1 (for loop)

        

        check if element in start and end == 
        */
        int start = 0;
        Arrays.sort(nums);

        if(nums.length == 1)
        {
            return false;
        }
        for( int end = 1; end< nums.length; end++)

        {
            if(nums[start] == nums[end])
            {
                return true;
            }

            start++;
        }



        return false;
    }
}