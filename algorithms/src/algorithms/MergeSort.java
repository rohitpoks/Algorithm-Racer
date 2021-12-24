package algorithms;

import java.util.Arrays;

public class MergeSort {
	
	public MergeSort(int[] array) {
		recursiveCall(array, 0, array.length - 1, new int[array.length]);
	}
	
	public void recursiveCall(int[] list, int start, int end, int[] temp) {
		if (start < end) {
			int midPoint = (int) (start+end)/2;
			recursiveCall(list, start, midPoint, temp);
			recursiveCall(list, midPoint + 1, end, temp);
			merge(list, start, midPoint, end, temp);
		}
	}
	
	
	public void merge(int[] list, int start, int mid, int end, int[] temp) {
		int p1 = start, p2 = mid+1, p3 = start;
		
		while (p1 <= mid && p2 < end) {
			if (list[p1] <= list[p2]) {
				temp[p3] = list[p1];
				p3++;
				p1++;		
			}
			else {
				temp[p3] = list[p2];
				p3++;
				p2++;
			}
		}

		while (p1 <= mid) {
			temp[p3] = list[p1];
			p1++;
			p3++;
		}


		while (p2 <= end) {
			temp[p3] = list[p2];
			p2++;
			p3++;
		}
		
		
		for (int i = start; i<= end; i++) {
			list[i] = temp[i];
		}
		
	}
}
