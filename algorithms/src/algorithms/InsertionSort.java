package algorithms;

public class InsertionSort {

	public InsertionSort(int[] list) {
		int startIndex = 1;
		int i;
		for (i=startIndex; i<list.length; i++) {
			int itemToInsert = list[i];
			int current = i - 1;
			while (current != -1 && itemToInsert < list[current]) {
				list[current+1] = list[current];
				current -= 1;
			}
			current += 1;
			list[current] = itemToInsert;
		}
	}

}
