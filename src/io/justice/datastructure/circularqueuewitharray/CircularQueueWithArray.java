package io.justice.datastructure.circularqueuewitharray;

public class CircularQueueWithArray {
	private Employee[] employeeQueue;
	private int front;
	private int end;
	private int size;
	public CircularQueueWithArray(int capacity) {
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
		return this.size == this.employeeQueue.length;
	}
	
	public void enqueue(Employee emp) {
		//if(this.front == this.employeeQueue.length) 
		if(isFull()) 
		{
			System.out.println("RESIZING!");
			Employee[] newEmployeeQueue = new Employee[2*this.employeeQueue.length];
			System.arraycopy(employeeQueue, 0, newEmployeeQueue, 0, this.employeeQueue.length);
			
			this.employeeQueue = newEmployeeQueue;
			this.end = this.size-1;
			this.front = 0;
			
		}
		this.size++;
		int circularIndex = this.endCircularIndex();//(++this.end)%this.employeeQueue.length;
		this.employeeQueue[circularIndex] = emp;
		if(this.end == 0 && this.front ==-1) {
			this.front++;
		}
	}
	
	public Employee dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			throw new UnsupportedOperationException("You cannot remove from empty queue");
		}
		this.size--;
		int circularIndex = this.frontCircularIndex();//(this.front++)%this.employeeQueue.length;
		Employee del = this.employeeQueue[circularIndex];
		 this.employeeQueue[circularIndex] = null;
		 this.front++;
		return del;
	}
	
	public Employee peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			throw new UnsupportedOperationException("You cannot peek from empty queue");
		}
		return this.employeeQueue[this.frontCircularIndex()];
	}
	
	
	public int queueSize() {
		return this.size;
	}
	
	public void printQueue() {
		System.out.println("first -> last:");
		if(this.isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		
		if(this.frontCircularIndex() <=this.end) {
			for(int i = this.frontCircularIndex(); i<=this.end; i++) {
				System.out.println(this.employeeQueue[i]);
			}
		} else {
			for(int i = this.frontCircularIndex(); i<this.employeeQueue.length; i++) {
				System.out.println(this.employeeQueue[i]);
			}
			
			for(int i = 0; i<=this.end; i++) {
				System.out.println(this.employeeQueue[i]);
			}
		}
		
		
		
	}
	
	private int endCircularIndex () {
		this.end = (++this.end)%this.employeeQueue.length;
		return end;
	}
	
	private int frontCircularIndex () {
		//this.front++;
		this.front = (this.front)%this.employeeQueue.length;
		return this.front;
	}

}
