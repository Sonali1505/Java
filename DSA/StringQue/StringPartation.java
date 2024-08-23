// Given a number (as string) and two integers a and b, divide the string in two non-empty parts such that the first part is divisible by a and the second part is divisible by b. In case multiple answers exist, return the string such that the first non-empty part has minimum length.

 

// Example 1:

// Input:
// 1200 4 3
// Output:
// 12 00
// Explanation:
// 12 is divisible by 4, and
// 00 is divisible by 3.
 
import java.util.*;
public class StringPartation{

    public static String partation(String S,int a,int b){
        int len = S.length();
        for(int i=1;i<len;i++){
            String firstPart = S.substring(0,i);
            String lastPart = S.substring(i);

            int firstNum= Integer.parseInt(firstPart);
            int lastNum = Integer.parseInt(lastPart);

            if(firstNum%a==0 && lastNum%b==0){
                return firstNum+" "+lastNum;
            }

        }
        return " ";
    }
    public static void main(String args[]){
        String S= "1200";
        int a= 4;
        int b=3;
        System.out.println(partation(S,a,b));

    }
}