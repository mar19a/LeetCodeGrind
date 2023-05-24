/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        // Initialize a stack to hold the opening brackets
        Stack<Character> stack = new Stack<>();
        
        // Iterate over each character in the string
        for (char c : s.toCharArray()) {
            // If it's an opening bracket, we push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.empty() && stack.peek() == '(') {
                // If it's a closing bracket and the top of the stack is the corresponding opening bracket,
                // we pop the opening bracket from the stack.
                stack.pop();
            } else if (c == '}' && !stack.empty() && stack.peek() == '{') {
                // Similar to the previous step
                stack.pop();
            } else if (c == ']' && !stack.empty() && stack.peek() == '[') {
                // Similar to the previous step
                stack.pop();
            } else {
                // If none of the previous conditions were met, it means that either the stack is empty when we are trying to pop 
                // (which means there are unmatched closing brackets) or the top of the stack doesn't match with the closing bracket
                // (which means the brackets are not correctly nested). In either case, we return false.
                return false;
            }
        }
        
        // If the stack is empty after the iteration, it means that every opening bracket had a corresponding closing bracket, 
        // so we return true. If it's not empty, it means there are unmatched opening brackets, so we return false.
        return stack.empty();
    }
}

class twenty {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isValid("()")); // Expected: true
        System.out.println(solution.isValid("()[]{}")); // Expected: true
        System.out.println(solution.isValid("(]")); // Expected: false
        System.out.println(solution.isValid("([)]")); // Expected: false
        System.out.println(solution.isValid("{[]}")); // Expected: true
    }
}