/* 
  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 * 
 */

 class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int pos = 0 ;
        int[] answer = new int[2];

        while(pos < nums.length-1)
        {
            for(int i = pos+1; i< nums.length; i++)
            {
                if (nums[pos] + nums[i] == target )
                {
                    answer[0] = pos;
                    answer[1] = i;
                }
            }

            pos++;
        }
        return answer;
    }
}


    /* target = 26
    int pos = 0; 
    int i = pos+1 (1).

    Int [] answer = new Int[2]
    while pos < nums.length-1 (pos < 3) 
    {
    for(int i = pos+1: i< nums.length; i++)
    {
        if nums[pos] + nums[i] == target
        {
            answer[0] = pos;
            answer[1] = i;
        }
       
    }
    pos++
    }


    pos = 0
    is 0< 3? yes
    i = 1; 1< 4; 
        nums[0] + nums[1] = 26? (2+7 ?= 26)No

        i = 2
        nums[0] + nums[2] ?= 26 (2+11  != 26)? No

        i = 3

        nums[0] + nums[3] == 26 (2+ 15 != 26) No 
        pos ++ 
        
        
        
        
        pos = 1
        1< 3? yes
        i = 2; 2< 4? yes
        nums[1] + nums[2] == 26 (7+11 != 26) No
        i =3; 3<4? yes 
        nums[1] + nums[3] == 26 (7+15 != 26) No
        i =4; 4<4? No


        pos = 2;
        is 2< 3? yes

        i =3; 3< 4? yes

        nums[2] + nums[3] = (11,15) = 26 yes.
        answer[0]= 2
        answer[1]= 3
  
    
    
    
    
    
    
    
    */
    