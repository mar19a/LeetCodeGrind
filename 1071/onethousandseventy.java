class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Concatenating the two strings in different orders, if they are not equal,
        // then there is no common substring that can form both strings.
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        // If they are equal, that means there is a common substring.
        // The length of the common substring would be the greatest common divisor 
        // of the lengths of str1 and str2. So we calculate the gcd of the lengths 
        // and return the substring of str1 of that length.
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    // Helper function to calculate the greatest common divisor using Euclidean algorithm.
    private int gcd(int a, int b) {
        // If b is 0, a is the gcd
        if (b == 0) {
            return a;
        } else {
            // Otherwise, gcd is the gcd of b and the remainder of a divided by b.
            return gcd(b, a % b);
        }
    }
}

public class onethousandseventy {
    public static void main(String[] args) {
        Solution solution = new Solution();
    
        System.out.println(solution.gcdOfStrings("ABCABC", "ABC")); 
        // Expected output: "ABC"
    
        System.out.println(solution.gcdOfStrings("ABABAB", "ABAB")); 
        // Expected output: "AB"
    
        System.out.println(solution.gcdOfStrings("LEET", "CODE")); 
        // Expected output: ""
    
        System.out.println(solution.gcdOfStrings("A", "A")); 
        // Expected output: "A"
    
        System.out.println(solution.gcdOfStrings("A", "B")); 
        // Expected output: ""
    
        System.out.println(solution.gcdOfStrings("AAAAAA", "AAA")); 
        // Expected output: "AAA"
    
        System.out.println(solution.gcdOfStrings("ABCDEF", "ABCDEG")); 
        // Expected output: ""
    
        System.out.println(solution.gcdOfStrings("ABCABCABC", "ABCABC")); 
        // Expected output: "ABCABC"
    
        System.out.println(solution.gcdOfStrings("ABCABCABC", "ABC")); 
        // Expected output: "ABC"
    }
}
