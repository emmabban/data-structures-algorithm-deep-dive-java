package io.justice.algorithm.radixsort;

public class RadixSortString {
	
	public static void radixSort(String[] arr, int radix, int width) {
		for(int i = width-1; i>=0 ; i--) {
			radixSingleSort(arr, i, radix);
		}
		
	}

	private static void radixSingleSort(String[] arr, int position, int radix) {

		int numOfItems = arr.length;
		int[] countArr = new int[radix];
		
		for(String val : arr) {
			countArr[getChar(position, val,radix)]++;
		}
		
		for(int i = 1; i <radix; i++) {
			countArr[i]+= countArr[i-1];
		}
		
		String[] tempArr = new String[numOfItems];
		
		for(int tempIdx = numOfItems -1; tempIdx >=0 ; tempIdx--) {
			tempArr[--countArr[getChar(position, arr[tempIdx], radix)]] = arr[tempIdx];
		}
		
		for(int tempIdx = 0; tempIdx < numOfItems ; tempIdx++) {
			arr[tempIdx] =  tempArr[tempIdx];
		}
		
	}

	private static int getChar(int position, String val, int radix) {
		//String alphabets = "abcdefghijklmnopqrstuvwxyz";//26 characters
		//return alphabets.indexOf(val.charAt(position))% radix;
		return val.charAt(position)- 'a';
	}

}
