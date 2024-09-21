// Input: A = 10, B = 20
// Output: 4
// Explanation: Binary representation of A is 00001010
// Binary representation of B is 00010100
// We need to flip highlighted four bits in A to make it B.
import java.util.*;
public class CountSetBits{
    public static int countSetBits(int a, int b){
        int n= a^b;
        int count=0;
        while(n!=0){
            count++;
            n= n&(n-1);
        }
        return count;
    }
    public static void main(String args[]){
        int a= 10;
        int b= 20;
        System.out.println(countSetBits(a,b));
    }
}