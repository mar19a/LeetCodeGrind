//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".
//Example 1:
//Input: strs = ["flower","flow","flight"]
//Output: "fl"

//Example 2:
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
/* 
Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0 || strs == null)
        {
            return "";
        }

    String prefix = strs[0];

    for ( int i = 0; i< prefix.length(); i ++)
    {
       char currentchar = prefix.charAt(i);
       
       for (int j = 1; j< strs.length; j++)
       {
        if ( i == strs[j].length() || currentchar != strs[j].charAt(i) )
        {
            return prefix.substring(0,i);
        }
       }
    }





    return prefix;
    }
}

class fourteen {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String[] test1 = {"flower","flow","flight"};
        String[] test2 = {"dog","racecar","car"};
        String[] test3 = {"",""};
        String[] test4 = {"ab", "abc", "abcd"};
        String[] test5 = {"abab", "aba", ""};

        System.out.println(solution.longestCommonPrefix(test1)); // Expected: "fl"
        System.out.println(solution.longestCommonPrefix(test2)); // Expected: ""
        System.out.println(solution.longestCommonPrefix(test3)); // Expected: ""
        System.out.println(solution.longestCommonPrefix(test4)); // Expected: "ab"
        System.out.println(solution.longestCommonPrefix(test5)); // Expected: ""
    }
} 





















/* 

        if (strs == null || strs.length == 0) {
            return "";
        }
        String minStr = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < minStr.length()) {
                minStr = strs[i];
            }
        }
        for (int i = 0; i < minStr.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (minStr.charAt(i) != strs[j].charAt(i)) {
                    return minStr.substring(0, i);
                }
            }
        }
        return minStr;
    }
}
class fourteen {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String[] test1 = {"flower","flow","flight"};
        String[] test2 = {"dog","racecar","car"};
        String[] test3 = {"",""};
        String[] test4 = {"ab", "abc", "abcd"};
        String[] test5 = {"abab", "aba", ""};

        System.out.println(solution.longestCommonPrefix(test1)); // Expected: "fl"
        System.out.println(solution.longestCommonPrefix(test2)); // Expected: ""
        System.out.println(solution.longestCommonPrefix(test3)); // Expected: ""
        System.out.println(solution.longestCommonPrefix(test4)); // Expected: "ab"
        System.out.println(solution.longestCommonPrefix(test5)); // Expected: ""
    }
} 
*/