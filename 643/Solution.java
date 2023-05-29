/* You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

 

Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000 */
class Solution {
    public double findMaxAverage(int[] nums, int k) {

       
        int maxsum =0;
        int sum =0;
       for(int i=0; i<k; i++)
       {
           maxsum = maxsum + nums[i];
       } 
    sum = maxsum;
    for(int j = k; j< nums.length; j++ )
    {
        sum= sum - nums[j-k] + nums[j];

        if(sum> maxsum)
        {
            maxsum = sum;
        }
    }


    return maxsum*1.0 / k;
    }
}