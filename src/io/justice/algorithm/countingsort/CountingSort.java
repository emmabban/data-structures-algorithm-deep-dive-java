package io.justice.algorithm.countingsort;

public class CountingSort {
	
	public static  void countingSort(long[] arr) {
		
		int[] countArr = new int[arr.length];
		
		for(int i= 0 ; i<10;i++) {
			int count =0;
			for(int j = 0; j <10; j++) {
				if(i+1 == arr[j]) {
					count++;
				}
			}
			countArr[i]= count;
		}
		
		int lopIdex =0;
		
		for( int k= 0; k< 10; k++) {
			int countVal = countArr[k];
			if(countVal == 0) {
				continue;
			}
			for(int n =0; n< countVal; n++) {
				arr[lopIdex++] = k +1;
			}
		}
		
	}
	
	public static void countingSortV1(long[] arr) {
		int[] countingArr = new int[arr.length];
		
		//int valueAtIndex = 0;
		for(int i= 0; i< arr.length; i++) {
			//valueAtIndex = countingArr[(int)(arr[i] -1)];
			countingArr[(int)(arr[i] -1)] += 1;//valueAtIndex + 1;
		}
		int loopIndex = 0;
		for( int i = 0; i< arr.length;i++) {
			if(countingArr[i] == 0) {
				continue;
			}
			for(int j= 0; j< countingArr[i]; j++) {
				arr[loopIndex++] = i+1;
			}
			
		}
		
	}
	
	

}
