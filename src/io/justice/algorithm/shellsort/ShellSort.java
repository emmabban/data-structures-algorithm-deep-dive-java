package io.justice.algorithm.shellsort;

public class ShellSort {
	
	public static void shellSort(long[] arr) {
		int gap = arr.length/2;
		
		for(int i = gap;i<arr.length; i++) {
			long temp = arr[i];
			int j= i;
			for(; j>0 && arr[j-gap]> temp;) {
				arr[j] = arr[j-gap];
				j=j-gap;
			}
			arr[j] = temp;
			gap = gap/2;
			if(gap <= 1) {
				break;
			}
			 
		}
		
		for(int i = 1;i<arr.length; i++) {
			long temp = arr[i];
			int j= i;
			for(; j>0 && arr[j-1]> temp;) {
				arr[j] = arr[j-1];
				j=j-1;
			}
			arr[j] = temp;
			 
		}
	}
	
	public static void shellSort1(long[] arr) {
		
		for(int gap = arr.length/2; gap >0 ; gap/=2) {
			
			
			for(int i = gap; i< arr.length;i++) {
				long temp = arr[i];
				int j = i;
				while(j>=gap && arr[j-gap] > temp) {
					arr[j] = arr[j-gap];
					j-=gap;
				}
				arr[j] = temp;
				
			}
		}
	}

}
