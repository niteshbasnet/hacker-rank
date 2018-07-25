package cracking.datastructure.sorting.on2;

import java.util.Random;

public class Sorting {

	private int[] theArray = new int[50];
	private int arraySize = 10;

	public void generateRandomArray() {
		for (int i = 0; i < arraySize; i++) {
			theArray[i] = (int) (Math.random() * 10) + 10;
		}
	}

	public void printArray() {
		System.out.println("----------");
		for (int i = 0; i < arraySize; i++) {
			System.out.print("| " + i);
			System.out.println(" | " + theArray[i] + " |");
			System.out.println("----------");
		}
	}

	public void bubbleSort() {
		for (int i = 0; i < arraySize; i++) {
			for (int j = 0; j < (arraySize - i - 1); j++) {
				if (theArray[j] > theArray[j + 1]) {
					int temp;
					temp = theArray[j];
					theArray[j] = theArray[j + 1];
					theArray[j + 1] = temp;
				}
			}
		}
	}

	public void selectionSort() {
		for (int i = 0; i < (arraySize - 1); i++) {
			int min_index = i;
			for (int j = i + 1; j < arraySize; j++) {
				if (theArray[j] < theArray[min_index]) {
					min_index = j;
				}
			}
			int temp = theArray[min_index];
			theArray[min_index] = theArray[i];
			theArray[i] = temp;
		}
	}

	public void insertionSort() {
		for (int i = 1; i < arraySize; i++) {
			int key = i;
			while (key > 0 && theArray[key - 1] > theArray[key]) {
				int temp = theArray[key - 1];
				theArray[key - 1] = theArray[key];
				theArray[key] = temp;
				key--;
			}
		}
	}

	public void shellSort() {
		for (int gap = arraySize / 3; gap > 0; gap /= 3) {
			for (int i = gap; i < arraySize; i++) {

				for (int j = i; j >= gap && theArray[j - 1] > theArray[j]; j -= gap) {
					int temp = theArray[j - 1];
					theArray[j - 1] = theArray[j];
					theArray[j] = temp;
				}
			}
		}
	}

	// Quick Sort Starts here
	public void quickSort() {
		quickSort(theArray, 0, theArray.length - 1);
	}

	private void quickSort(int[] array, int low, int high) {
		if (low < high + 1) {
			int p = partition(array, low, high);
			quickSort(array, low, p - 1);
		}
	}

	private void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	private int partition(int[] array, int low, int high) {

		return 0;
	}

	private int getPivot(int low, int high) {
		Random rand = new Random();
		return rand.nextInt((high - low) + 1) + low;
	}
	// Quick Sort ends here

	
	public static void main(String[] args) {
		Sorting sortArray = new Sorting();
		sortArray.generateRandomArray();
		sortArray.printArray();

		long startTime = System.nanoTime();
		sortArray.bubbleSort();
		long endTime = System.nanoTime();
		System.out.println("Time to execute Bubble sort::" + (endTime - startTime) + "ns");
		sortArray.printArray();

		startTime = System.nanoTime();
		sortArray.selectionSort();
		endTime = System.nanoTime();
		System.out.println("Time to execute selection sort::" + (endTime - startTime) + "ns");
		sortArray.printArray();

		startTime = System.nanoTime();
		sortArray.insertionSort();
		endTime = System.nanoTime();
		System.out.println("Time to execute Insertion sort::" + (endTime - startTime) + "ns");
		sortArray.printArray();

		startTime = System.nanoTime();
		sortArray.shellSort();
		endTime = System.nanoTime();
		System.out.println("Time to execute Shell sort::" + (endTime - startTime) + "ns");
		sortArray.printArray();

		startTime = System.nanoTime();
		sortArray.quickSort();
		endTime = System.nanoTime();
		System.out.println("Time to execute Quick sort::" + (endTime - startTime) + "ns");
		sortArray.printArray();

	}
}
