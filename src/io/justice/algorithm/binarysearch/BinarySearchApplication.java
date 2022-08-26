package io.justice.algorithm.binarysearch;

public class BinarySearchApplication {

	public static void main(String[] args) {

		long[] inputArray = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90};
		long findval = 90;
		long[] inputArray1 = { -22, -15, 1, 7, 20, 35 , 55  };
		
		 int idx = BinarySearch.binarySerach(inputArray, findval);

		 
		 System.out.println("Negative index: -1 means, value is not in array ");
			System.out.println("findval : "+ findval + " is at first index: " + idx);
			
			System.out.println("==============");
			findval = -15;
			
			idx = BinarySearch.binarySerach(inputArray1, findval);
			System.out.println("findval : "+ findval + " is at first index: " + idx);
			
			
			System.out.println("==============");
			findval = 35;
			idx = BinarySearch.binarySerach(inputArray1, findval);
			System.out.println("findval : "+ findval + " is at first index: " + idx);
			
			
			System.out.println("==============");
			findval = 1;
			idx = BinarySearch.binarySerachIterative(inputArray1, findval);
			System.out.println("findval : "+ findval + " is at first index: " + idx);  
			
			
			System.out.println("==============");
			findval = 8888;
			idx = BinarySearch.binarySerach(inputArray1, findval);
			System.out.println("findval : "+ findval + " is at first index: " + idx);
			
			
			
			System.out.println("==============v2");
			findval = 90;
			idx = BinarySearch.binarySerachIterative(inputArray, findval);
			System.out.println("findval : "+ findval + " is at first index: " + idx);
			
			System.out.println("==============");
			findval = -15;
			long[] inputArray3 = { -22, -15, 1, 7, 20, 35 , 55  };
			idx = BinarySearch.binarySerachIterative(inputArray3, findval);
			System.out.println("findval : "+ findval + " is at first index: " + idx);
			
			System.out.println("==============");
			findval = 35;
			idx = BinarySearch.binarySerachIterative(inputArray1, findval);
			System.out.println("findval : "+ findval + " is at first index: " + idx);
			
			System.out.println("==============");
			findval = 1;
			idx = BinarySearch.binarySerachIterative(inputArray1, findval);
			System.out.println("findval : "+ findval + " is at first index: " + idx);
			
			System.out.println("==============");
			findval = 8888;
			idx = BinarySearch.binarySerachIterative(inputArray1, findval);
			System.out.println("findval : "+ findval + " is at first index: " + idx);
			
			
	}

		

}
