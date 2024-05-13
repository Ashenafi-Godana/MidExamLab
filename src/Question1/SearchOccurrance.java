package Question1;

import java.util.Scanner;

public class SearchOccurrance {

    public static void main(String[] args) {
        int[] myNums = new int[5];

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the numbers");
        for (int i = 0; i < myNums.length; i++) {
            myNums[i] = in.nextInt();
        }

        System.out.println("Enter the number to be searched");
        
        int n = in.nextInt();

        boolean exists = false;
        for (int i = 0; i < myNums.length; i++) {
            if (myNums[i] == n) {
                exists = true;
            }
        }
        
        int count = 0;
        if (exists) {
            for (int i = 0; i < myNums.length; i++) {
                if (n == myNums[i]) {
                    count++;
                }
            }
            System.out.println("The number exists " + count + " times");
        }

        else {
            System.out.println("The number does not exist in the array");
        }
        
        
    }
}