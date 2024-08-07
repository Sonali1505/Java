import java.util.*;

public class ArrayReverse{
    public static int reverse(int arr[]){
        int reverseArray[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            reverseArray[i]=arr[arr.length-1-i];
        }
        System.out.println("Reversed array:");
        for(int i:reverseArray){
            System.out.print(i +" ");
        }
    return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int arr[] = new int[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(reverse(arr));
    }
}

public class GFG { 
    /* Function to reverse arr[] from start to end*/
    static void reverseArray(int arr[], int start, int end) { 
        int temp; 
        while (start < end) { 
            temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; 
            end--; 
        } 
    } 

    /* Utility that prints out an array on a line */
    static void printArray(int arr[], int size) { 
        for (int i = 0; i < size; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

    // Driver code 
    public static void main(String args[]) { 
        int arr[] = {1, 2, 3, 4, 5, 6}; 
        printArray(arr, 6); 
        reverseArray(arr, 0, 5); 
        System.out.print("Reversed array is \n"); 
        printArray(arr, 6); 
    } 
}
