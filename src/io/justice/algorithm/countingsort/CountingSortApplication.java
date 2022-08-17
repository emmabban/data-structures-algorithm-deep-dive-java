package io.justice.algorithm.countingsort;

public class CountingSortApplication {

	public static void main(String[] args) {
		long arr[] = {2,5,9,8,2,8,7,10,4,3};
		CountingSort.countingSort(arr);
		
		for( int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("======");
		long arr1[] = {2,5,9,8,2,8,7,10,4,3};
		CountingSort.countingSortV1(arr1);
		
		for( int i=0; i< arr1.length; i++) {
			System.out.println(arr1[i]);
		}

	}

}
