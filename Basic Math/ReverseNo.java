import java.util.*;
public class ReverseNo{
    public static int reverse(int n){

        int original_no = n;
        int reverse_no= 0;
        while(n>0){
            int lastdigit=n%10;
            reverse_no= reverse_no*10+lastdigit;
            n=n/10;
        }
        if(original_no==reverse_no){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        return reverse_no;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }
}

// class Solution {
//     public int reverse(int x) {
//      int reversedNumber = 0;
//         int sign = x < 0 ? -1 : 1;  // Determine the sign of x
//         x = Math.abs(x);  // Work with the absolute value of x
        
//         while (x != 0) {
//             int lastDigit = x % 10;  // Get the last digit
//             x /= 10;  // Remove the last digit from x
            
//             // Check for overflow before actually adding the digit
//             if (reversedNumber > (Integer.MAX_VALUE - lastDigit) / 10) {
//                 return 0;  // Return 0 if reversing the number would overflow
//             }
            
//             reversedNumber = reversedNumber * 10 + lastDigit;
//         }
        
//         return sign * reversedNumber; 
//     }
// }