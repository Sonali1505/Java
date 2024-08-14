import java.util.*;
public class Countdigit{
    public static int CountDigit(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        System.out.println(CountDigit(number));
    }
}