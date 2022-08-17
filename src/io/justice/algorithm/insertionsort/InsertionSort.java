package io.justice.algorithm.insertionsort;

public class InsertionSort {
	
	
	
	
public static void insertionsort(long[] arr) {
		
		int curOpenIdx = -1;
		long temp =0;
		
		for(int i = 1; i< arr.length; i++) {
			temp = arr[i];
			curOpenIdx = -1;
			for(int j = i; j> 0; j--) {
				if(arr[j-1]> temp) {
					arr[j] =arr[j-1];
					curOpenIdx = j-1;
				}
			}
			
			if(curOpenIdx != -1) {
			arr[curOpenIdx] = temp;
			}
		}
		
	
}

public static void insertionsort1(long[] arr) {
	for( int i =1; i< arr.length ; i++) {
		  long temp = arr[i];
		  int j = i;
		for(  ; j>0 && (arr[j-1]> temp); j--) {
			arr[j] = arr[j-1];
		}
		arr[j] = temp;
		
	}
}

}
