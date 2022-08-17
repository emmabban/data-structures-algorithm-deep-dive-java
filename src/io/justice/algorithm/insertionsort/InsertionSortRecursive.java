package io.justice.algorithm.insertionsort;

public class InsertionSortRecursive {
	
	
	
	
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


public static void insertionsort1Recursive(long[] arr, int indexAt) {
	
	if(indexAt > arr.length - 1) {
		return;
	}
	long temp = arr[indexAt];
	int indexAtReturned = insertionsort1InnerRecurse(arr,indexAt,temp);
	arr[indexAtReturned] = temp;
	insertionsort1Recursive(arr,++indexAt);
	
	
	
}


private static int insertionsort1InnerRecurse(long[] arr, int indexAt, long temp) {
	if(indexAt < 1 || arr[indexAt-1]<= temp) {
		return indexAt;
	}
	
	if(arr[indexAt-1] > temp) {
		arr[indexAt] = arr[indexAt - 1];
	}
	indexAt = indexAt - 1;
	
	
	return insertionsort1InnerRecurse(arr,indexAt, temp);
	
	
}


}
