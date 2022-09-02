package io.justice.datastructure.heap;

import javax.naming.OperationNotSupportedException;

public class HeapApplication {

	public static void main(String[] args) {
		MaxHeap heap = new MaxHeap(7);
		heap.insert(25);
		heap.insert(20);
		heap.insert(15);
		heap.insert(10);
		heap.insert(5);
		heap.insert(12);
		heap.insert(6);
		
		for(long val : heap.getEntries()) {
			System.out.println(val);
		}
		System.out.println("=====");
		heap.delete(20);
		for(int i = 0; i <heap.getEntIdx();i++) {
			System.out.println(heap.getEntries()[i]);
		}
		
		
		System.out.println("=====");
		
		try {
			System.out.println("Peek: "+ heap.peek());
		} catch (OperationNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		heap = new MaxHeap(10);
		heap.insert(80);
		heap.insert(75);
		heap.insert(60);
		heap.insert(68);
		heap.insert(55);
		heap.insert(40);
		heap.insert(52);
		heap.insert(67);
		
		heap.printHeap();
		//heap.deleteV2(1); // 80 68 60 67 55 40 52
		//heap.delete(75);
		//heap.printHeap();
		//heap.deleteV2(5);//80 75 67 68 55 60 52 
		//heap.delete(40);
		//heap.printHeap();
		
		//heap.deleteV2(0);//75 68 60 67 55 40 52
		heap.delete(80);
		heap.printHeap();
		System.out.println("=====");
		try {
			System.out.println("Peek: "+ heap.peek());
		} catch (OperationNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("=====");
		heap.sort(0,heap.getEntIdx());
		heap.printHeap();
		 
	}

}
