package io.justice.algorithm.linearsearch;

public class LinearSearch {
	
public static int linearSerach(long[] arr, long value) {
		
	
	
	for(int i=0;i<arr.length;i++ ) {
		if(arr[i] == value) {
			return i;
		}
	}

return -1;
	
}




}
