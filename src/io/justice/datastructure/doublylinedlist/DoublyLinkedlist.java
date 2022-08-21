package io.justice.datastructure.doublylinedlist;

public class DoublyLinkedlist {
	DoublyLinkedlistNode head;
	DoublyLinkedlistNode tail;
	int length;
	
	public void insertFirst(Employee emp) {
		DoublyLinkedlistNode valueToInsert = new DoublyLinkedlistNode(emp);
		if(tail == null) {
			tail =valueToInsert;
			head = valueToInsert;
			length++;
			return;
		}
		
		valueToInsert.next = head;
		head.previous = valueToInsert;
		head = valueToInsert;
		length++;
		
	}
	
	
	public void insertLast(Employee emp) {
		DoublyLinkedlistNode valueToInsert = new DoublyLinkedlistNode(emp);
		if(head == null) {
			head = valueToInsert;
			tail =valueToInsert;
			length++;
			return;
		}
		
		tail.next = valueToInsert;
		valueToInsert.previous = tail;
		tail = valueToInsert;
		length++;
		
	}
	
	
	public DoublyLinkedlistNode deleteFirst() {
		//if(head == null) {
		if(isEmpty()) {
			return null;
		}
		DoublyLinkedlistNode delNode = head;
		
		head = head.next;
		if(head == null) {
			tail = null;
			length--;
			return delNode;
		}
		head.previous = null;
		length--;
		delNode.next = null;
		return delNode;
		
	}
	
	public DoublyLinkedlistNode deleteLast() {
		//if(head == null) {
		if(isEmpty2()) {
			return null;
		}
		DoublyLinkedlistNode delNode = tail;
		
		tail = tail.previous;
		if(tail == null) {
			head = null;
			length--;
			return delNode;
		}
		tail.next = null;
		length--;
		delNode.previous= null;
		return delNode;
		
	}
	
	public boolean addBefore(Employee emp, Employee ins) {
		//if(head == null) {
		if(isEmpty2()) {
			return false;
		}
		DoublyLinkedlistNode curFromHead = head;
		//DoublyLinkedlistNode curFromTail = tail;
		
		while(curFromHead != null && !curFromHead.data.equals(emp)) {
			curFromHead = curFromHead.next;
		}
		
		if(curFromHead == null) {
			return false;
		}
		
		DoublyLinkedlistNode nodeToAdd = new DoublyLinkedlistNode(ins);
		
		nodeToAdd.next = curFromHead;
		nodeToAdd.previous = curFromHead.previous;
		if(curFromHead == head) {
			head = nodeToAdd;
		} else {
		curFromHead.previous.next = nodeToAdd;
		curFromHead.previous = nodeToAdd;
		}
		
		length++;
		
		return true;
		
	}
	
	public void printList() {
		DoublyLinkedlistNode cur = head;
		while(cur != null) {
			System.out.println(cur);
			cur = cur.next;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}
	
	public boolean isEmpty2() {
		return tail == null;
	}
	

}
