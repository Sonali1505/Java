// import java.util.*;
// public class CopyArray{
//     public static void copyA(int arr[],int arrLength){
//         int newArr[]= new int[arrLength];
//         for(int i=0;i<newArr.length;i++){
//             newArr[i]=arr[i];

//         }
//         for(int i=0;i<newArr.length;i++){
//             System.out.println(newArr[i]);

//         }
        
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int arrLength = sc.nextInt();
//         int arr[] = new int[arrLength];
//         for(int i=0;i<arrLength;i++){
//             arr[i]=sc.nextInt();
//         }
//         copyA(arr,arrLength);
//     }
// }
import java.util.*;
public class CopyArray{
    public static int[] copyA(int arr[] , int arrLength){
        int newarr[] = new int[arrLength];
        System.arraycopy(arr,0,newarr,0,arrLength);
        for(int i=0;i<newarr.length;i++){
            System.out.println(newarr[i]);

        }
        return new int[]{};
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int arr[] = new int[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i]=sc.nextInt();
        }
        copyA(arr,arrLength);
    }
}


