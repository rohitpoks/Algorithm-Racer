package algorithms;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Racer {
	boolean bubbleSort = false;
	boolean insertionSort = false;
	boolean mergeSort = false;
	boolean quickSort = false;
	boolean selectionSort = false;
	boolean timSort = true;
	public static void main(String[] args) {
		new Racer();
	}
	
	public Racer() {
		System.out.println("enter the size of random array");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = genArray(size);
		
		if (bubbleSort) {
			Long start = System.currentTimeMillis();
			new BubbleSort(array);
			Long end = System.currentTimeMillis();
			System.out.println("Bubble Sort Took " + (end - start) + " ms"); 
		}
		array = genArray(size);
		if (insertionSort) {
			Long start = System.currentTimeMillis();
			new InsertionSort(array);
			Long end = System.currentTimeMillis();
			System.out.println("Insertion Sort Took " + (end - start) + " ms"); 
		}
		array = genArray(size);
		if (mergeSort) {
			Long start = System.currentTimeMillis();
			new MergeSort(array);
			Long end = System.currentTimeMillis();
			System.out.println("Merge Sort Took " + (end - start) + " ms"); 
		}
		array = genArray(size);
		if (quickSort) {
			Long start = System.currentTimeMillis();
			new QuickSortAlgorithm(array);
			Long end = System.currentTimeMillis();
			System.out.println("Quick Sort Took " + (end - start) + " ms"); 
		}
		array = genArray(size);
		if (selectionSort) {
			Long start = System.currentTimeMillis();
			new SelectionSort(array);
			Long end = System.currentTimeMillis();
			System.out.println("Selection Sort Took " + (end - start) + " ms"); 
		}
		array = genArray(size);
		if (timSort) {
			Long start = System.currentTimeMillis();
			Arrays.sort(array);
			Long end = System.currentTimeMillis();
			System.out.println("Tim Sort Took " + (end - start) + "ms");
		}
	}
	
	public static int[] genArray(int size) {
		Random rand = new Random();
		int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			result[i] = rand.nextInt(size);
		}
		return result;
	}

}
