package io.justice.datastructure.arraystack;

public class ArrayStack {
  //private int capacity;
  private Employee[] entries;
  private int size ;
  private int top;
public ArrayStack(int capacity) {
	//this.capacity = capacity;
	this.entries = new Employee[capacity];
	this.size = 0;
	this.top = -1;
}

public boolean push(Employee emp) {
	/*
	 * if(this.isfull()) { System.out.println("Satck is full"); return false; }
	 */
	if(this.isfull()) {
		System.out.println("Satck is full");
		Employee[] newStackArray = new Employee[2* this.entries.length];
		System.arraycopy(entries, 0, newStackArray, 0, entries.length);
		this.entries = newStackArray;
	}

	this.entries[++this.top] = emp;
	this.size++;
	return true;
}

public Employee pop() {
	if(this.isEmpty()) {
		System.out.println("Satck is empty");
		return null;
	}
	
	this.size--;
	return this.entries[this.top--];
}


public Employee peep() {
	if(this.isEmpty()) {
		System.out.println("Satck is empty");
		return null;
	}
	return this.entries[this.top];
}

public int stackSize()
{
	return this.size;
}




public boolean isEmpty() {
	return this.top == -1;
}

public boolean isfull() {
	return  this.size == this.entries.length-1;
}
  
public void printStack() {
	System.out.print(" Top-> ");
	for(int i = this.top; i>=0;i--) {
		System.out.print(entries[i] +" -> ");
	}
	/*
	 * for(Employee emp : entries) { System.out.print(emp +"->"); }
	 */
	System.out.print(" Bottom \n");
}
  
  
  

}
