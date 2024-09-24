// import java.util.*;
// public class factorial{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int number= sc.nextInt();
//         int fact=1;
//         for(int i=1;i<=number;i++){
//             fact= fact*i;
//         }
//         System.out.println(fact);

     
//     }
// }

import java.util.*;
public class factorial{
    public static int factorial(int n){
        if(n==0){
            return 1;

        }
        return n*factorial(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int result=factorial(n);
        System.out.println(result);

    }
}