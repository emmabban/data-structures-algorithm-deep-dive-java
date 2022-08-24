package io.justice.datastructure.queuewitharray;

public class QueueWithArray {
	private Employee[] employeeQueue;
	private int front;
	private int end;
	private int size;
	public QueueWithArray(int capacity) {
		super();
		this.size = 0;
		this.employeeQueue = new Employee[capacity];
		this.front = -1;
		this.end = -1;
	}
	
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public boolean isFull() {
		return this.end == this.employeeQueue.length-1;
	}
	
	public void enqueue(Employee emp) {
		//if(this.front == this.employeeQueue.length) 
		if(isFull()) 
		{
			Employee[] newEmployeeQueue = new Employee[2*this.employeeQueue.length];
			System.arraycopy(employeeQueue, 0, newEmployeeQueue, 0, this.employeeQueue.length);
			
			this.employeeQueue = newEmployeeQueue;
			
		}
		this.size++;
		
		this.employeeQueue[++this.end] = emp;
		if(this.end == 0) {
			this.front++;
		}
	}
	
	public Employee dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			throw new UnsupportedOperationException("You cannot remove from empty queue");
		}
		this.size--;
		return this.employeeQueue[this.front++];
	}
	
	public Employee peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			throw new UnsupportedOperationException("You cannot peek from empty queue");
		}
		return this.employeeQueue[this.front];
	}
	
	
	public int queueSize() {
		return this.size;
	}
	
	public void printQueue() {
		System.out.println("first -> last:");
		if(this.front <0) {
			System.out.println("Queue is empty");
			return;
		}
		
		for(int i = this.front; i<=this.end; i++) {
			System.out.println(this.employeeQueue[i]);
		}
		
	}

}
