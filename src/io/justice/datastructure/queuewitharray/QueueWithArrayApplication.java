package io.justice.datastructure.queuewitharray;

public class QueueWithArrayApplication {

	public static void main(String[] args) {
		
		
		QueueWithArray queue = new QueueWithArray(4);
		queue.printQueue();
		System.out.println("Size : "  + queue.queueSize());
		System.out.println("======");
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe",4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee markDacascos = new Employee("Mark", "Dacascos", 3346);
		
		
		queue.enqueue(janeJones);
		queue.enqueue(johnDoe);
		queue.enqueue(marySmith);
		queue.enqueue(mikeWilson);
		queue.enqueue(markDacascos);
		System.out.println("Size : "  + queue.queueSize());
		System.out.println("======");
		
		queue.printQueue();
		System.out.println("======");
		System.out.println("Peek: " + queue.peek());
		System.out.println("======");
		System.out.println("Dequeqe: " + queue.dequeue());
		System.out.println("======");
		queue.printQueue();
		System.out.println("======");
		System.out.println("Dequeqe: " + queue.dequeue());
		System.out.println("======");
		queue.printQueue();
		
		System.out.println("======");
		System.out.println("Dequeqe: " + queue.dequeue());
		System.out.println("Dequeqe: " + queue.dequeue());
		System.out.println("Dequeqe: " + queue.dequeue());
		queue.printQueue();
		System.out.println("======");
		//System.out.println("Dequeqe: " + queue.dequeue());
		queue.enqueue(markDacascos);
		queue.printQueue();
		System.out.println("======");




	}

}
