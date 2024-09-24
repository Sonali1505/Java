import java.util.*;
public class Armstrog{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        int temp= number;
        int last=0;
        int digit=0;
        int sum=0;
        while(number>0){
            number=number/10;
            digit++;

        }
        temp=number;
        while(number>0){
            last = temp%10;
            sum=sum+(int)(Math.pow(last,digit));
            temp=temp/10;
        }
        if(number==sum){
            System.out.println("armstrong number");
        }else{
            System.out.println("not armstrong number");
        }
    }
}