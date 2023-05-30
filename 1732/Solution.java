/* 
 There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

 

Example 1:

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
Example 2:

Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
 
 */
class Solution {
    public int largestAltitude(int[] gain) {
        int maxlength =0;
        int behind = 0;
        int count = 0;
        int lastcurrent = 0;

         if(gain.length ==1)
            {
                return Math.max(0, gain[0]);
            } 
        for(int end =1; end< gain.length; end++)
        {

           
            if(count == 0 )
            {
                lastcurrent = gain[behind] + 0;
                maxlength = Math.max(maxlength, lastcurrent);
                  System.out.println(lastcurrent);
                  count ++;
            }
             lastcurrent = lastcurrent+ gain[end];
            maxlength= Math.max(maxlength,lastcurrent );
         
            behind++;

    /*
    max((0), gain(0)+ 0) 
    max(0, -5+ 0 )
    max(0)
    lastcurrent = -5


    max((0), -5 + 1)
    max(0, -4)
    max(0)
    lastcurrent = -5+ 1 = -4

    behind = 1;
    end = 2;
     
    lastcurrent = -4+ 5 = 1
    max((0), 1)
    max(1)

    behind = 2;
    end = 3;
    lastcurrent = 1 +0 = 1
    max((1), 1) 
    
    behind =3;
    end = 4;
    last current = 1 + -7 
    max = (1, -6)
    
    
    
    
    */

        }

        return maxlength;
    }
}