package io.justice.algorithm.bucketsort;

public class BucketSortApplication {

	public static void main(String[] args) {

		BucketSort br = new BucketSort();
		long[] inputArray = { 90, 70, 30, 10, 60, 30, 20, 60, 80, 90, 20, 30, 0 };
		br.bucketSort(inputArray);

		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}

		/*
		 * System.out.println("========="); br = new BucketSort(); long[] inputArray4 =
		 * { 20, 35, -15, 7,55,1,-22 }; br.bucketSort(inputArray4);
		 * 
		 * for (int i = 0; i < inputArray4.length; i++) {
		 * System.out.println(inputArray4[i]); }
		 */
		
		System.out.println("=========");
		br = new BucketSort();
		long[] inputArray5 = { 9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0 };
		br.bucketSort(inputArray5);

		for (int i = 0; i < inputArray5.length; i++) {
			System.out.println(inputArray5[i]);
		}
		
		System.out.println("=========");
		br = new BucketSort();
		long[] inputArray7 = { 54, 46, 83, 66, 95, 92, 43 };
		br.bucketSort(inputArray7);

		for (int i = 0; i < inputArray7.length; i++) {
			System.out.println(inputArray7[i]);
		}

		
		/*
		 * System.out.println("========="); br = new BucketSort(); long[] inputArray6 =
		 * { 20, 35, -15, 7,55,1,-22 }; br.bucketSort(inputArray6);
		 * 
		 * for (int i = 0; i < inputArray6.length; i++) {
		 * System.out.println(inputArray6[i]); }
		 */
		 
		
		
		/*
		 * System.out.println("=========");
		 * 
		 * long[] inputArray7 = { 20, 35, -15, 7,55,1,-22 };
		 * BucketSortRecursive.insertionsort1Recursive(inputArray7, 1);;
		 * 
		 * for (int i = 0; i < inputArray7.length; i++) {
		 * System.out.println(inputArray7[i]); }
		 * 
		 * System.out.println("=========");
		 * 
		 * long[] inputArray8 = { 9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0 };
		 * BucketSortRecursive.insertionsort1Recursive(inputArray8, 1);;
		 * 
		 * for (int i = 0; i < inputArray8.length; i++) {
		 * System.out.println(inputArray8[i]); }
		 */


	}

}
