package io.justice.algorithm.selectionsort;

public class SelectionSortApplication {

	public static void main(String[] args) {

		long[] inputArray = { 9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0 };
		SelectionSort.selectionSort(inputArray);

		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}

		System.out.println("=========");
		
		long[] inputArray4 = { 20, 35, -15, 7,55,1,-22 };
		SelectionSort.selectionSort(inputArray4);

		for (int i = 0; i < inputArray4.length; i++) {
			System.out.println(inputArray4[i]);
		}

	}

}
