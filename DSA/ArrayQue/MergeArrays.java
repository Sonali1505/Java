import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        // Example input arrays
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        // Merging the arrays
        int[] mergedArray = mergeArrays(arr1, arr2);

        // Output the result
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        // Create a new array of size arr1.length + arr2.length
        int[] mergedArray = new int[arr1.length + arr2.length];

        // Copy elements from arr1 to the merged array
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }

        // Copy elements from arr2 to the merged array
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[arr1.length + i] = arr2[i];
        }

        return mergedArray;
    }
}
