package io.justice.algorithm.binarysearch;

public class BinarySearch {
	
public static int binarySerach(long[] arr, long value) {
		
	
	return binarySearch(arr,value,0,arr.length-1);
	
}


private static int binarySearch(long[] arr, long value, int startIdx, int endIdx) {
	if(startIdx > endIdx) {
		return -1;
	}
	int mid = (startIdx + endIdx)/2;
	
	if(arr[mid] == value) {
		return mid;
	}else if(arr[mid]> value) {
		return binarySearch(arr, value, startIdx, mid-1);
	} else {
		return binarySearch(arr, value, mid +1, endIdx);
	}
	
	
}


public static int binarySerachIterative(long[] arr, long value) {
	
	int start = 0;
	int end = arr.length-1;
	int mid = 0;
	
	while(start <= end) {
		mid = (start + end)/2;
		if(value == arr[mid]) {
			return mid;
		}else if(arr[mid] > value) {
			end = mid-1;
		} else {
			start = mid +1;
		}
	}
	
		
	
	return -1;
	
}




}
