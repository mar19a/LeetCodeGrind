/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
*/

class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> shash = new HashMap<>();
        HashMap<Character, Integer> thash = new HashMap<>();
    for(int i = 0; i< s.length(); i++)

    {
         if(shash.containsKey(s.charAt(i)))
        {
            shash.put(s.charAt(i),(shash.get(s.charAt(i))+1));
        }
        else{
        shash.put(s.charAt(i), 1);
       
        }

         if(thash.containsKey(t.charAt(i)))
        {
            thash.put(t.charAt(i),(thash.get(t.charAt(i))+1));
        }
        else{
            thash.put(t.charAt(i), 1);
        }

        
       



    }
        /* 
        
        {a, 1}
        {n, 1}

        
        
        
        */
        return shash.equals(thash);
    }
}