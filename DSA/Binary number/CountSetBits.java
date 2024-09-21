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