package io.justice.algorithm.radixsort;

public class RadixSort {
	
	public static void radixSort(long[] arr, int radix, int width) {
		for(int i = 0; i< width; i++) {
			radixSingleSort(arr, i, radix);
		}
		
	}

	private static void radixSingleSort(long[] arr, int position, int radix) {

		int numOfItems = arr.length;
		int[] countArr = new int[radix];
		
		for(long val : arr) {
			countArr[getDigit(position, val,radix)]++;
		}
		
		for(int i = 1; i <radix; i++) {
			countArr[i]+= countArr[i-1];
		}
		
		long[] tempArr = new long[numOfItems];
		
		for(int tempIdx = numOfItems -1; tempIdx >=0 ; tempIdx--) {
			tempArr[--countArr[getDigit(position, arr[tempIdx], radix)]] = arr[tempIdx];
		}
		
		for(int tempIdx = 0; tempIdx < numOfItems ; tempIdx++) {
			arr[tempIdx] =  tempArr[tempIdx];
		}
		
	}

	private static int getDigit(int position, long val, int radix) {
		// TODO Auto-generated method stub
		return (int)val/ (int) Math.pow(radix, position) % radix;
	}

}
