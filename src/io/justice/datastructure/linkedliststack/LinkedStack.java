package io.justice.datastructure.linkedliststack;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedStack {
  //private int capacity;
  private LinkedList<Employee> entries;
public LinkedStack() {
	//this.capacity = capacity;
	this.entries = new LinkedList<>();
}

public boolean push(Employee emp) {
	/*
	 * if(this.isfull()) { System.out.println("Satck is full"); return false; }
	 */
	this.entries.push(emp);
	return true;
}

public Employee pop() {
	if(this.isEmpty()) {
		System.out.println("Satck is empty");
		return null;
	}
	return this.entries.pop();
}


public Employee peek() {
	if(this.isEmpty()) {
		System.out.println("Satck is empty");
		//return null;
	}
	return this.entries.peek();
}

public int stackSize()
{
	return this.entries.size();
}




public boolean isEmpty() {
	return this.entries.isEmpty();
}

  
public void printStack() {
	System.out.print(" Top-> ");
	Iterator<Employee> iter = this.entries.iterator();
	while(iter.hasNext()) {
		System.out.print(iter.next() +" -> ");
	}
	/*
	 * for(Employee emp : entries) { System.out.print(emp +"->"); }
	 */
	System.out.print(" Bottom \n");
}


  
  

}
