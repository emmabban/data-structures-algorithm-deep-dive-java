package io.justice.algorithm.insertionsort;

public class InsertionSortApplication {

	public static void main(String[] args) {

		long[] inputArray = { 9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0 };
		InsertionSort.insertionsort(inputArray);

		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}

		System.out.println("=========");
		
		long[] inputArray4 = { 20, 35, -15, 7,55,1,-22 };
		InsertionSort.insertionsort(inputArray4);

		for (int i = 0; i < inputArray4.length; i++) {
			System.out.println(inputArray4[i]);
		}
		
		System.out.println("=========");
		
		long[] inputArray5 = { 9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0 };
		InsertionSort.insertionsort1(inputArray5);

		for (int i = 0; i < inputArray5.length; i++) {
			System.out.println(inputArray5[i]);
		}

		System.out.println("=========");
		
		long[] inputArray6 = { 20, 35, -15, 7,55,1,-22 };
		InsertionSort.insertionsort1(inputArray6);

		for (int i = 0; i < inputArray6.length; i++) {
			System.out.println(inputArray6[i]);
		}
		
		
		System.out.println("=========");
		
		long[] inputArray7 = { 20, 35, -15, 7,55,1,-22 };
		InsertionSortRecursive.insertionsort1Recursive(inputArray7, 1);;

		for (int i = 0; i < inputArray7.length; i++) {
			System.out.println(inputArray7[i]);
		}
		
		System.out.println("=========");
		
		long[] inputArray8 = { 9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0 };
		InsertionSortRecursive.insertionsort1Recursive(inputArray8, 1);;

		for (int i = 0; i < inputArray8.length; i++) {
			System.out.println(inputArray8[i]);
		}


	}

}
