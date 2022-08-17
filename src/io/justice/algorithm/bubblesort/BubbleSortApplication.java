package io.justice.algorithm.bubblesort;

public class BubbleSortApplication {

	public static void main(String[] args) {

		long[] inputArray = { 9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0 };
		BubbleSort.bubbleSort(inputArray);

		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}

		System.out.println("=========");

		long[] inputArray1 = { 9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0 };
		BubbleSort.bubbleSort(inputArray1);

		for (int i = 0; i < inputArray1.length; i++) {
			System.out.println(inputArray1[i]);
		}

		System.out.println("=========");

		long[] inputArray2 = { 9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0 };
		BubbleSort.bubbleSort1(inputArray2);

		for (int i = 0; i < inputArray2.length; i++) {
			System.out.println(inputArray2[i]);
		}
		
		System.out.println("=========");

		long[] inputArray3 = { 9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0 };
		BubbleSort.bubbleSort2(inputArray3);

		for (int i = 0; i < inputArray3.length; i++) {
			System.out.println(inputArray3[i]);
		}
		
		System.out.println("=========");

		long[] inputArray4 = { 20, 35, -15, 7,55,1,-22 };
		BubbleSort.bubbleSort2(inputArray4);

		for (int i = 0; i < inputArray4.length; i++) {
			System.out.println(inputArray4[i]);
		}
		

	}

}
