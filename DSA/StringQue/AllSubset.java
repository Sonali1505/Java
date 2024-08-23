// Java Program to find all subsets of a string
// In this program, all the subsets of the string need to be printed. The subset of a string is the character or the group of characters that are present inside the string.

// All the possible subsets for a string will be n(n+1)/2.

// For example, all possible subsets of a string "FUN" will be F, U, N, FU, UN, FUN.


import java.util.*;
public class AllSubset{
    public static void main(String args[]){
         String str = "FUN";
    int len = str.length();
    int temp=0;

    String arr[] = new String[len*(len+1)/2];

    for(int i=0;i<len;i++){
        for(int j=i;j<len;j++){
            arr[temp]=str.substring(i,j+1);
            temp++;
        }
    }

    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }
    
}