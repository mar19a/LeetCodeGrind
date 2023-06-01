/*
 There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).

 

Example 1:

Input: nums = [-1,-2,-3,-4,3,2,1]
Output: 1
Explanation: The product of all values in the array is 144, and signFunc(144) = 1
Example 2:

Input: nums = [1,5,0,2,-3]
Output: 0
Explanation: The product of all values in the array is 0, and signFunc(0) = 0
 */

 class Solution {
    public int arraySign(int[] nums) {
        /* -1 */
        int pos= 1; 

        if(nums[0]< 0)
        {
            pos = pos*-1;
        }
        else if ( nums[0] > 0)
            {
                pos= pos;
            }
            else
            {
                pos = 0;
            }

        if(nums.length>=2){
            
        
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] < 0)
            {
                pos = pos*-1;
            }
            else if ( nums[i] > 0)
            {
                pos= pos;
            }
            else
            {
                pos = 0;
            }
        }

        }


        
        return pos;
     
    }
}