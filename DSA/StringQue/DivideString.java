// Here, our task is to divide the string S into n equal parts. We will print an error message if the string cannot be divisible into n equal parts otherwise all the parts need to be printed as the output of the program.

// To check whether the string can be divided into N equal parts, we need to divide the length of the string by n and assign the result to variable chars.

// If the char comes out to be a floating point value, we can't divide the string otherwise run for loop to traverse the string and divide the string at every chars interval.

import java.util.*;
public class DivideString{
    public static void main(String args[]){
        String str= "aaaabbbbcccc";

        int n= 3;
        int len= str.length();
        int chars=len/n;
        int temp=0;

        String[] s1= new String[n];

        if(len%n!=0){
            System.out.println("Sorry string cannot divide");

        }else{
            for(int i=0;i<len;i=i+chars){
                String part = str.substring(i,i+chars);
                s1[temp]=part;
                temp++;
            }
            System.out.println(n + " equal parts of given string are ");  
            for(int i = 0; i < s1.length; i++) {  
                System.out.println(s1[i]);  
                }  
        }
    }
}