import java.util.*;

public class Prime_no{
    public static int checkprime(int n){
        if(n<=1){
            return 0;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int result=checkprime(n);
        if(result==0){
        System.out.println(n+" not prime");

        }else{
            System.out.println(n+" is prime");
        }
    }
}