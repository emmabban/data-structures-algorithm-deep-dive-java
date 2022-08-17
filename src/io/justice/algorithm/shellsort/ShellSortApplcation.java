package io.justice.algorithm.shellsort;

public class ShellSortApplcation {
	
	public static void main(String[] args) {
	long[] inputArray = { 9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0 };
	ShellSort.shellSort(inputArray);

	for (int i = 0; i < inputArray.length; i++) {
		System.out.println(inputArray[i]);
	}

	System.out.println("=========");
	
	long[] inputArray4 = { 20, 35, -15, 7,55,1,-22 };
	ShellSort.shellSort(inputArray4);

	for (int i = 0; i < inputArray4.length; i++) {
		System.out.println(inputArray4[i]);
	}
	
	System.out.println("=========");
	long[] inputArray5 = { 9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0 };
	ShellSort.shellSort1(inputArray5);

	for (int i = 0; i < inputArray5.length; i++) {
		System.out.println(inputArray5[i]);
	}

	System.out.println("=========");
	
	long[] inputArray6 = { 20, 35, -15, 7,55,1,-22 };
	ShellSort.shellSort1(inputArray6);

	for (int i = 0; i < inputArray6.length; i++) {
		System.out.println(inputArray6[i]);
	}
	}

}
