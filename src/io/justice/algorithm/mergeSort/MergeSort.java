package io.justice.algorithm.mergeSort;

public class MergeSort {
	
	public static void mergeSort(long[] arr, int startIdx, int endIdx) {
		if(startIdx >= endIdx) {
			return;
		}
		
		int mid = (endIdx + startIdx)/2;
		mergeSort(arr, startIdx, mid);
		mergeSort(arr, mid+1, endIdx);
		merge(arr,startIdx, mid,endIdx);
		
	}

	private static void merge(long[] arr, int startIdx, int mid, int endIdx) {
		long[] leftArr = new long[mid - startIdx +1];
		long[] rightArr = new long[endIdx - mid ];
		
		for(int i = 0; i< leftArr.length; i++) {
			leftArr[i] = arr[startIdx +i];
		}
		
		for(int i = 0; i< rightArr.length ; i++) {
			rightArr[i] = arr[i + mid +1];
		}
		
		int m = 0, n = 0;
		
		for( int k = startIdx ; k <= endIdx; k++) {
			if(m > mid) {
				arr[k]= rightArr[n];
				n++;
			} else if (n > rightArr.length -1) {
				arr[k] = leftArr[m];
				m++;
			} else if( m < leftArr.length && leftArr[m] <= rightArr[n]) {
				arr[k] = leftArr[m];
				m++;
			} else if(n< rightArr.length) {
				arr[k]= rightArr[n];
				n++;
				
			}
		}
		
	}

}
