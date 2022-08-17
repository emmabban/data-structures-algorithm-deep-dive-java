package io.justice.algorithm.radixsort;

public class RadixSortApplication {

	public static void main(String[] args) {
		long[] arr = {4725,4586,1303,8792,1594,5729};

		RadixSort.radixSort(arr, 10, 4);
		
		for( int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("=======");
		String[] stringArr = {"bcdef","dbaqc","abcde","omadd","bbbbb"};

		RadixSortString.radixSort(stringArr, 26, 5);
		
		for( int i=0; i< stringArr.length; i++) {
			System.out.println(stringArr[i]);
		}
		

	}

}
