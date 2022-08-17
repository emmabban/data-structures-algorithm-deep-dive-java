package io.justice.algorithm.mergeSort;

public class MergeSortApplication {

	public static void main(String[] args) {
		long[] inputArray = { 9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0 };
		MergeSort.mergeSort(inputArray, 0, inputArray.length-1);
		
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}

		System.out.println("=========");
		
		long[] inputArray4 = { 20, 35, -15, 7,55,1,-22 };
		MergeSort.mergeSort(inputArray4, 0, inputArray4.length-1);

		for (int i = 0; i < inputArray4.length; i++) {
			System.out.println(inputArray4[i]);
		}

		
		System.out.println("=========");
		
		long[] inputArray5 = { 20, 35, -15, 7,55,1,-22 };
		MergeSortDescending.mergeSort(inputArray5, 0, inputArray5.length-1);

		for (int i = 0; i < inputArray5.length; i++) {
			System.out.println(inputArray5[i]);
		}
		
		System.out.println("=========");
		
		long[] inputArray6 = { 9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0 };
		MergeSortDescending.mergeSort(inputArray6, 0, inputArray6.length-1);

		for (int i = 0; i < inputArray6.length; i++) {
			System.out.println(inputArray6[i]);
		}
	}

}
