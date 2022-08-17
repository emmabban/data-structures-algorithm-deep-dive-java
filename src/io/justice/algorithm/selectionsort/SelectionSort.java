package io.justice.algorithm.selectionsort;

public class SelectionSort {
	
	public static void selectionSort(long[] arr) {
		 int temp = -1;
		for(int i = arr.length-1; i>=0; i--) {
			temp = findLargestIdx(arr, 0,i);
			swap(arr, temp,i);
		}
		
	}
	
	
	public static void swap(long[] arr, int firstIdx, int secondIdx) {
		if( firstIdx == secondIdx) {
			return;
		}
		
		long temp = arr[firstIdx];
		arr[firstIdx] = arr[secondIdx];
		arr[secondIdx] = temp;
	}
	
	public static int findLargestIdx(long[] arr, int startIdx, int endIdx) {
		int lgeIdx = -1;
		long lgeVal = Long.MIN_VALUE;
		for(int i= startIdx; i<= endIdx; i++) {
			if(arr[i] > lgeVal){
				lgeVal = arr[i];
				lgeIdx =i;
			}
		}
		
		return lgeIdx;
		
	}

}
