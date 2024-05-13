package Question5;
import Question1.SearchOccurrance;

public class Merge {
    public void mergeSort(int[] array) {
        if (array.length <= 1) {
            return; // Base case: array with 0 or 1 element is already sorted
        }
        
        // Divide the array into two halves
        int mid = array.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[array.length - mid];
        
        // Copy elements to left and right arrays
        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }

        for (int i = mid; i < array.length; i++) {
            rightArray[i - mid] = array[i];
        }
        // Recursively sort the two halves
        mergeSort(leftArray);
        mergeSort(rightArray);
        // Merge the sorted halves

        merge(array, leftArray, rightArray);
         
       }

       public void merge(int[] array, int[] leftArray, int[] rightArray) {
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;
        int i = 0, j = 0, k = 0;
        // Compare elements of left and right arrays and merge them into array
        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            }
            else {
                array[k++] = rightArray[j++];
            }
        } 
       // Copy remaining elements of left array if any
        while (i < leftLength) {
            array[k++] = leftArray[i++];
        } 
       // Copy remaining elements of right array if any
        while (j < rightLength) {
            array[k++] = rightArray[j++];
        }
       }

       public static void main(String[] args) {
        System.out.println(myNums);
       }
}
    

