package algorithms;

import java.util.Arrays;

public class SelectionSort {

	
	public SelectionSort(int[] list) {
		for (int i = 0; i < list.length; i++) {
			int min = i;
			for (int j = i; j < list.length; j++) {
				if (list[min] > list[j]) {
					min = j;
				}
			}
			int temp = list[min];
			list[min] = list[i];
			list[i] = temp;
		}
	}

}
