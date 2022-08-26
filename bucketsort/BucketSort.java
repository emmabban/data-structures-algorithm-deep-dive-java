package io.justice.algorithm.bucketsort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class BucketSort {
	
	private List<Long>[] bucket ;
	
	
	
	
public BucketSort() {
	bucket = new List[10];
	for(int i=0; i< bucket.length; i++) {
		//bucket[i] = new LinkedList<Long>();
		//bucket[i] = new ArrayList<Long>();
		bucket[i] = new Vector<Long>();
	}
	}

public void bucketSort(long[] arr) {
		
	List<Long> temp;
	for(int i=0; i< arr.length;i++) {
		temp = bucket[hash(arr[i])];
		temp.add(arr[i]);
		//Collections.sort(temp);
	}
	
	for(List bck : bucket) {
		Collections.sort(bck);
	}
	
	int arrIdx =0;
	for(int i=0; i< bucket.length;i++) {
		temp = bucket[i];
		//temp.add(arr[i]);
		ListIterator<Long> iter = temp.listIterator();
		while(iter.hasNext()) {
			arr[arrIdx++] = iter.next();
		}
		
	}
	
}

private int hash(long val) {
	return (int) val / (int)Math.pow(10, 1);
	
}

/*
 * public void printBucket() { thi }
 */

/*
 * public static void insertionsort1(long[] arr) { for( int i =1; i< arr.length
 * ; i++) { long temp = arr[i]; int j = i; for( ; j>0 && (arr[j-1]> temp); j--)
 * { arr[j] = arr[j-1]; } arr[j] = temp;
 * 
 * } }
 */

}
