/*
  Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring
 consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
 * 
 */

 class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        int pos = 0 ;
        String lastword = "";
    if(s.length() == 1)
    {   
        return s.length();
    }
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == ' ')
            {
                pos = i;
            }
        }

        if(pos == 0)
        {
            lastword = s;
        }
        /* 
        0   1   2   3   4   5   6   7   8   9   10  11
        H   e   l   l   o       W   o   r   l   d
        */
        else
        {
         lastword = s.substring(pos+1,s.length());
        }
        return lastword.length();

    }
}