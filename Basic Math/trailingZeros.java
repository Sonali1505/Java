import java.util.*;
public class trailingZeros{
    public static int factorialtrailingZeros(int n){
        int result=0;
        for(int i=5;i<=n;i=i*5){
            result=result+n/i;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorialtrailingZeros(n));
    }
}
