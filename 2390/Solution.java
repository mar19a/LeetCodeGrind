/*
 

 
 */

 class Solution {
    public String removeStars(String s) {
        
        Stack<Character> newstack = new Stack<>();

        for(int i =0; i< s.length(); i++)
        {
            if(s.charAt(i) != '*')
            {
                newstack.push(s.charAt(i));
               
            }
            else
            {
                newstack.pop();
                //System.out.println(i);
               
            }
        }

   // Stack <Character>  reverseofstack = new Stack<>();
    String newstring = "";  
       while(!newstack.isEmpty())
       {
           //reverseofstack.push(newstack.pop());

        newstring = newstack.pop()+ newstring;

       }

    /*
        while(!reverseofstack.isEmpty())
        {
            newstring = newstring + reverseofstack.pop();
        }
        return newstring;
        */

        return newstring;
    }

    
}

