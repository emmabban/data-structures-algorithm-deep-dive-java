package io.justice.algorithm.quicksort;

public class QuickSort {
	
	public static void quickSort(long[] arr, int startIdx, int endIdx) {
		if(startIdx >= endIdx) {
			return;
		}
		
		int partitionIdx = endIdx;
		long pivot = arr[partitionIdx];
		int i = startIdx;
		 int j = i-1;
		 
		 for(;i <= endIdx -1; i++) {
			 if(arr[i] <= pivot) {
				 j++;
				 swap(arr,j, i);
			 }
		 }
		 j++;
		 swap(arr,j,i);
		 quickSort(arr, startIdx, j-1);
		 quickSort(arr, j+1, endIdx);
		
	}
	
	private static void swap(long[] arr, int firstIdx, int secondIdx) {
		long temp = arr[firstIdx];
		arr[firstIdx] = arr[secondIdx];
		arr[secondIdx] = temp;
	}

}
