package io.justice.algorithm.bubblesort;

public class BubbleSort {

	public static void bubbleSort(long[] arr) {
		int endIdx = arr.length - 1;
		long temp = 0;

		for (int i = 0; i < endIdx; i++) {

			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}

			if (i == endIdx - 1) {
				endIdx--;
				i = 0;
			}

		}

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}

		}
	}
	
	
	public static void bubbleSort1(long[] arr) {
		int endIdx = arr.length - 1;
		long temp = 0;
		boolean wasSwapped = false;
		
		while(true) {
			int i=0;
		for(;i< arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				wasSwapped = true;
			}
			
			if (i == endIdx - 1) {
				endIdx--;
			}
			
			
		}
		if(wasSwapped) {
			i= 0;
			wasSwapped = false;
		}else {
			break;
		}
		}
		
		
	}
	
	public static void bubbleSort2(long[] arr) {
		
		for(int i= 0; i< arr.length; i++) {
		bubbleSort(arr,0,(arr.length-1-i));
		}
		
		
	}
	
	private static void bubbleSort(long[] arr, int startIdx, int endIdx) {
		if(startIdx == endIdx) {
			return;
		}
		if(arr[startIdx] > arr[startIdx +1]) {
			long temp = arr[startIdx];
			arr[startIdx] = arr[startIdx + 1];
			arr[startIdx + 1] = temp;
		}
		startIdx++;
		bubbleSort(arr,startIdx,endIdx);
		
		
		
	}
	

}
