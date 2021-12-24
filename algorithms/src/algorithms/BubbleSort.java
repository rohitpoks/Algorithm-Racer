package algorithms;

import java.util.Arrays;

public class BubbleSort {
	
	public BubbleSort(int[] myList) {
		boolean done = false;
		while (!done) {
			done = true;
			for (int i = 0; i < myList.length - 1; i++) {
				if (myList[i] > myList[i+1]) {
					int temp = myList[i];
					myList[i] = myList[i+1];
					myList[i+1] = temp;
					done = false;
				}
			}
		}
	}
}
