// Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

// There may be duplicates in the original array.

// Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation.

 

// Example 1:

// Input: nums = [3,4,5,1,2]
// Output: true
// Explanation: [1,2,3,4,5] is the original sorted array.
// You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
// Example 2:

// Input: nums = [2,1,3,4]
// Output: false
// Explanation: There is no sorted array once rotated that can make nums.
// Example 3:

// Input: nums = [1,2,3]
// Output: true
// Explanation: [1,2,3] is the original sorted array.
// You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        // Iterate through the array to count violations of the non-decreasing order
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            
            // If there is more than one violation, return false
            if (count > 1) {
                return false;
            }
        }
        
        return true;
    }
}
public class Arrayssorting {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {2, 1, 3, 4};
        int[] nums3 = {1, 2, 3};
        
        System.out.println(solution.check(nums1));  // Output: true
        System.out.println(solution.check(nums2));  // Output: false
        System.out.println(solution.check(nums3));  // Output: true
    }
}

//simple code
// class TUF {
//   static boolean isSorted(int arr[], int n) {
//     for (int i = 1; i < n; i++) {
//       if (arr[i] < arr[i - 1])
//         return false;
//     }

//     return true;
//   }

//   public static void main(String args[]) {
//     int arr[] = {1, 2, 3, 4, 5}, n = 5;

//     System.out.println(isSorted(arr, n));
//   }
// }
