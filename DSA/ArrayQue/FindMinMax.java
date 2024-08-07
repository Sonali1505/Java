//import java.util.*;
// public class FindMinMax{
//     public static int minMax(int arr[],int n){
//         if(n==1){
//             return arr[0];
//         }
//         Arrays.sort(arr);
//         System.out.println("min:"+arr[0]+"max:"+arr[n-1]);
//         return 0;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int arrLength = sc.nextInt();
//         int arr[] = new int[arrLength];
//         for(int i=0;i<arrLength;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println(minMax(arr,arrLength));
//     }
// }

import java.util.*;
public class FindMinMax{
    public static int min(int arr[],int n){
        int res=arr[0];
        for(int i=0;i<n;i++){
            res=Math.min(res,arr[i]);
        }
        return res;
    }
    public static int max(int arr[],int n){
        int res=arr[0];
        for(int i=0;i<n;i++){
            res=Math.max(res,arr[i]);
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int arr[] = new int[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Smallest element is:"+min(arr,arrLength));
        System.out.println("maximum element is:"+max(arr,arrLength));
    }
}