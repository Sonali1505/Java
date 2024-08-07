// Find a peak element which is not smaller than its neighbours
// The array can be traversed and the element whose neighbors are less than that element can be returned.
// Follow the below steps to Implement the idea: 

// If the first element is greater than the second or the last element is greater than the second last, print the respective element and terminate the program.
// Else traverse the array from the second index to the second last index i.e. 1 to N – 1  
// If for an element array[i] is greater than both its neighbors, i.e., array[i] > =array[i-1]  and array[i] > =array[i+1] , then print that element and terminate.
// nput: array[]= {5, 10, 20, 15}
// Output: 20
// Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

// Input: array[] = {10, 20, 15, 2, 23, 90, 67}
// Output: 20 or 90
// Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.
import java.util.*;

public class FindPeak{
    public static int peakElemnet(int arr[],int arrLength){
        if(arrLength==1){
            return 0;
        }
        if(arr[0]>arr[1]){
            return 0;
        }
        if(arr[arrLength-1]>arr[arrLength-2]){
            return arrLength-1;
        }
        for (int i = 1; i < arrLength - 1; i++) {
            // Check if the neighbors are smaller
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
                return i;
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
        System.out.println(peakElemnet(arr,arrLength));


    }
}