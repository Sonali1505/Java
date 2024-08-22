// Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

// Example 1:

// Input:
// S = i.like.this.program.very.much
// Output: much.very.program.this.like.i
// Explanation: After reversing the whole
// string(not individual words), the input
// string becomes
// much.very.program.this.like.i


import java.util.*;
public class reverseWord{
    public static String reverseword(String s){
        String[] word=s.split("\\.");
        StringBuilder reverse = new StringBuilder();
        for(int i=word.length-1;i>=0;i--){
            reverse.append(word[i]);
        if(i!=0){
            reverse.append(".");
        }

        }
        return reverse.toString();
        

    }

    public static void main(String args[]){
        String s= "I.Like.Mango";
        System.out.println(reverseword(s));
        
    }
}