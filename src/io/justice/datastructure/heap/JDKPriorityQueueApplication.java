package io.justice.datastructure.heap;

import java.util.PriorityQueue;
import java.util.stream.Stream;

public class JDKPriorityQueueApplication {

	public static void main(String[] args) {
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		heap.add(25);
		heap.add(20);
		heap.add(15);
		heap.add(10);
		heap.add(5);
		heap.add(12);
		heap.add(6);
		


		System.out.println("====");
		System.out.println("Peek :"+ heap.peek());
		System.out.println("Remove :"+ heap.remove());
		System.out.println("Peek :"+ heap.peek());
		System.out.println("Poll :"+ heap.poll());
		System.out.println("Peek :"+ heap.peek());
		System.out.println("Remove 25 :"+ heap.remove(25));
		
		Object[] ints = heap.toArray();
		System.out.println("====");
		Stream.of(ints).forEach(e->System.out.print(e+" "));
		System.out.println("\n====");
		Integer[] intsa = heap.toArray(new Integer[1]);
		Stream.of(intsa).forEach(e->System.out.print(e+" "));
		System.out.println("\n====");
		System.out.println("Peek :"+ heap.peek());
		System.out.println("Remove 99999: "+ heap.remove(99999));
		System.out.println("Peek :"+ heap.peek());
		
		heap.add(-1);
		System.out.println("Peek :"+ heap.peek());
		System.out.println("====");
		
		
		heap = new PriorityQueue<Integer>(10);
		heap.add(80);
		heap.add(75);
		heap.add(60);
		heap.add(68);
		heap.add(55);
		heap.add(40);
		heap.add(52);
		heap.add(67);

		System.out.println("====");
		System.out.println("Peek :"+ heap.peek());
		System.out.println("Remove :"+ heap.remove());
		System.out.println("Peek :"+ heap.peek());
		System.out.println("Poll :"+ heap.poll());
		System.out.println("Peek :"+ heap.peek());
		System.out.println("Remove 75  :"+ heap.remove(75));
		
		Object[] ints1 = heap.toArray();
		System.out.println("====");
		Stream.of(ints1).forEach(e->System.out.print(e+" "));
		System.out.println("\n====");
		Integer[] ints1a = heap.toArray(new Integer[0]);
		Stream.of(ints1a).forEach(e->System.out.print(e+" "));
		System.out.println("\n====");
		System.out.println("Peek :"+ heap.peek());
		System.out.println("Remove 99999: "+ heap.remove(99999));
		System.out.println("Peek :"+ heap.peek());

		heap.add(-1);
		System.out.println("Peek :"+ heap.peek());
		System.out.println("====");

		heap = new PriorityQueue<>();
		heap.add(25);
		heap.add(-22);
		heap.add(1343);
		heap.add(54);
		heap.add(0);
		heap.add(-3492);
		heap.add(429);
		
		System.out.println("====");
		System.out.println("Peek :"+ heap.peek());
		System.out.println("Remove :"+ heap.remove());
		System.out.println("Peek :"+ heap.peek());
		System.out.println("Poll :"+ heap.poll());
		System.out.println("Peek :"+ heap.peek());
		System.out.println("Remove 54: "+ heap.remove(54));
		
		Object[] ints2 = heap.toArray();
		System.out.println("====");
		Stream.of(ints2).forEach(e->System.out.print(e+" "));
		System.out.println("\n====");
		Integer[] ints2a = heap.toArray(new Integer[heap.size()]);
		Stream.of(ints2a).forEach(e->System.out.print(e+" "));
		System.out.println("\n====");
		System.out.println("Peek :"+ heap.peek());
		System.out.println("Remove 99999: "+ heap.remove(99999));
		System.out.println("Peek :"+ heap.peek());

		heap.add(-1);
		System.out.println("Peek :"+ heap.peek());
		System.out.println("====");
		
		 
	}

}
