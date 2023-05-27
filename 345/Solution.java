import java.util.*;

/*Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede" */
class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> newarraylist = new ArrayList<>();
        int firstv = 0;
        /* We check for the position of the first vowel*/
     
        /* This will temporary store a char*/
        char[] arr = new char[s.length()];
        for(int i =0; i< s.length(); i++)
        {
            arr[i] = s.charAt(i);

            if( s.charAt(i)== 'a' || s.charAt(i)== 'e' || s.charAt(i)== 'i' || s.charAt(i)== 'o' || s.charAt(i)== 'u'|| s.charAt(i)== 'A' || s.charAt(i)== 'E' || s.charAt(i)== 'I' || s.charAt(i)== 'O' || s.charAt(i)== 'U' )
            {
                newarraylist.add(s.charAt(i));
            }
        }

/*h e l l o

newarraylist = [e,o]




*/ 
    int lastpos = newarraylist.size()-1;
    String news= "";

    /* 2*/

        for( int j = 0; j< s.length(); j++ )
        {
           if( s.charAt(j)== 'a' || s.charAt(j)== 'e' || s.charAt(j)== 'i' || s.charAt(j)== 'o' || s.charAt(j)== 'u' || s.charAt(j)== 'A' || s.charAt(j)== 'E' || s.charAt(j)== 'I' || s.charAt(j)== 'O' || s.charAt(j)== 'U')
           {
               arr[j] = newarraylist.get(lastpos);
               lastpos --;
           }
           news= news+ arr[j];


        }


        s = news;
        return s;
    }
}