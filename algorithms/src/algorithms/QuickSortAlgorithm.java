package algorithms;

import java.util.Arrays;

public class QuickSortAlgorithm {

	public QuickSortAlgorithm(int[] myList) {
		// TODO Auto-generated method stub
		quickSort(myList, 0, myList.length - 1);
	}
	
	public static void quickSort(int[] list, int start, int end) {
		if (start < end) {
			int pivotIndex = partition(list, start, end);
			quickSort(list, start, pivotIndex -1);
			quickSort(list, pivotIndex + 1, end);
		}
		
	}
	
	public static int partition(int[] list, int start, int end) {
		int pivotIndex = end;
		int pivot = list[end];
		int i = start - 1;
		int j = start;
		while (j <= end -1) {
			if (list[j] < pivot) {
				i++;
				int temp = list[i];
				list[i] = list[j];
				list[j] = temp;
			}
			j++;
		}
		i++;
		int tempTwo = list[i];
		list[i] = list[pivotIndex];
		list[pivotIndex] = tempTwo;
		return i;
	}

}
