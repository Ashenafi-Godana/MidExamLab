package Question6;

import java.util.Arrays;

public class DelArrayElement {

    public static void deleteElement(int[] arry, int n) {
        if (n == 0 || n >= arry.length) {
            System.out.println("Invalid Index");
            return;
        }

        int[] newArray = new int[arry.length-1];

        for (int i = 0; i < arry[n-1]; i++) {
            newArray[i] = arry[i];
        }

        for (int i = n; i < arry.length-1; i++) {
            newArray[i] = arry[i];
        }
    }

    public static void main(String[] args) {

        int[] nums = {3, 7, 1, 9, 4};
        
        deleteElement(nums, 1);
        
        System.out.println(Arrays.toString(nums));
    }
}
