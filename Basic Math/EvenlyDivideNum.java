import java.util.*;
public class EvenlyDivideNum{
    public static int countdigit(int num){
        int count=0;
        int original_no=num;
        while(num>0){
            int digit=num%10;
            if(digit!=0 && original_no%digit==0){
                count++;
            }
            num /=10;
        }
        return count;
        // int count = 0;
        // int originalN = n;
        
        // while (n > 0) {
        //     int digit = n % 10;  // Get the last digit
        //     if (digit != 0 && originalN % digit == 0) {  // Check divisibility
        //         count++;
        //     }
        //     n /= 10;  // Remove the last digit
        // }
        
       
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        System.out.println(countdigit(number));
    }
}