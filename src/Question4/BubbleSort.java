package Question4;

import java.util.Arrays;

public class BubbleSort {
    public static void  bubblesort(int[] bubble) {

		for(int i = bubble.length - 1; i >= 0; i--) {
			 for(int j = 0; j < i; j++) {
				//do swap adjacent letters after comparison
				 if(bubble[j] > bubble[j + 1]) {
					int temp = bubble[j];
					bubble[j] = bubble[j + 1];
					bubble[j + 1] = temp;
				}
			}
		}
		
	}

    public static void main(String[] args) {
        int[] chars = {'A', 'B', 'C', 'D'};
        bubblesort(chars);

        for (int ch : chars) {
            System.out.print(ch + " ");
        }

        System.out.println();
    }
}
