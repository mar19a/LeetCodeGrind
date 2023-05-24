import java.util.*;



class Solution {
    public int maxDepth(String s) {
        // Initialize maximum depth and current depth
        int maxdepth = 0;
        int depth = 0;
    
        // Loop over each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // If the character is an opening bracket, increment depth
            if (c == '(') {
                depth++;
                // If the current depth is greater than the maximum depth, update maximum depth
                if (depth > maxdepth) {
                    maxdepth = depth;
                }
            }
            // If the character is a closing bracket, decrement depth
            else if (c == ')') {
                depth--;
            }
        }
        // Return the maximum depth
        return maxdepth;
    }
}

public class onesixonefour{
    public static void main(String [] args){
        Solution sol = new Solution();
        // Test cases
        System.out.println(sol.maxDepth("(1+(2*3)+((8)/4))+1")); // Output: 3
        System.out.println(sol.maxDepth("(1)+((2))+(((3)))")); // Output: 3
        System.out.println(sol.maxDepth("1+(2*3)/(2-1)")); // Output: 1
        System.out.println(sol.maxDepth("1")); // Output: 0
        System.out.println(sol.maxDepth("")); // Output: 0
    }
}