package io.justice.datastructure.circularqueuewitharray;

public class CircularQueueWithArrayApplication {

	public static void main(String[] args) {
		
		
		CircularQueueWithArray queue = new CircularQueueWithArray(4);
		queue.printQueue();
		System.out.println("Size : "  + queue.queueSize());
		System.out.println("======");
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe",4567);


		  Employee marySmith = new Employee("Mary", "Smith", 22);
		  Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		   //Employee markDacascos = new  Employee("Mark", "Dacascos", 3346);
		
		
		queue.enqueue(janeJones);
		queue.enqueue(johnDoe);


		  queue.enqueue(marySmith); 
		  queue.enqueue(mikeWilson);
		  //queue.enqueue(markDacascos);
		  
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
		queue.printQueue();
		//System.out.println("Dequeqe: " + queue.dequeue());
		queue.enqueue(janeJones);
		queue.enqueue(johnDoe);


		  queue.enqueue(marySmith); 
		  queue.enqueue(mikeWilson);
		  Employee markDacascos = new  Employee("Mark", "Dacascos", 3346);
		  queue.enqueue(markDacascos);
		  Employee billEnd = new  Employee("Bill", "End", 8346);
		queue.printQueue();
		System.out.println("======");
		queue.enqueue(billEnd);
		//System.out.println("Dequeqe: " + queue.dequeue());
		/* queue.enqueue(markDacascos); */
		queue.printQueue();
		System.out.println("======");
		
		
		
		CircularQueueWithArray queue1 = new CircularQueueWithArray(5);
		queue.printQueue();
		System.out.println("Size : " + queue1.queueSize());
		System.out.println("======");

		Employee janeJones1 = new Employee("Jane", "Jones1", 123);
		Employee johnDoe1 = new Employee("John", "Doe1", 4567);

		Employee marySmith1 = new Employee("Mary", "Smith1", 22);
		Employee mikeWilson1 = new Employee("Mike", "Wilson1", 3245);
		Employee markDacascos1 = new Employee("Mark", "Dacascos1", 3346);

		queue1.enqueue(janeJones1);
		queue1.enqueue(johnDoe1);
		queue1.dequeue();
		queue1.enqueue(marySmith1);
		queue1.dequeue();
		queue1.enqueue(mikeWilson1);
		queue1.dequeue();
		queue1.enqueue(markDacascos1);
		queue1.dequeue();
		queue1.enqueue(janeJones1);
		
		queue1.printQueue();




	}

}
