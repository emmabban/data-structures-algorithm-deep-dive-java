package io.justice.algorithm.linearsearch;

public class LinearSearchApplication {

	public static void main(String[] args) {

		long[] inputArray = { 90, 70, 30, 10, 60, 30, 20, 60, 80, 90, 20, 30, 0 };
		long findval = 20;
		
		
		 int idx = LinearSearch.linearSerach(inputArray, findval);

		 
		 System.out.println("Negative index: -1 means, value is not in array ");
			System.out.println("findval : "+ findval + " is at first index: " + idx);
			System.out.println("==============");
			findval = -15;
			long[] inputArray1 = { 20, 35, -15, 7, 55, 1, -22 };
			idx = LinearSearch.linearSerach(inputArray1, findval);
			System.out.println("findval : "+ findval + " is at first index: " + idx);
			System.out.println("==============");
			findval = 1;
			idx = LinearSearch.linearSerach(inputArray1, findval);
			System.out.println("findval : "+ findval + " is at first index: " + idx);
			System.out.println("==============");
			findval = 8888;
			idx = LinearSearch.linearSerach(inputArray1, findval);
			System.out.println("findval : "+ findval + " is at first index: " + idx);
			System.out.println("==============");
			findval = -22;
			idx = LinearSearch.linearSerach(inputArray1, findval);
			System.out.println("findval : "+ findval + " is at first index: " + idx);
	}

		

}
