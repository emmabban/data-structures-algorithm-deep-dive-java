package io.justice.datastructure.singlylinkedlist;

public class SinglyLinkedlist {
	SinglyLinkedlistNode head;
	int length;
	
	public void insertFirst(Employee emp) {
		SinglyLinkedlistNode valueToInsert = new SinglyLinkedlistNode(emp, null);
		if(head == null) {
			head = valueToInsert;
			length++;
			return;
		}
		
		valueToInsert.next = head;
		head = valueToInsert;
		length++;
		
	}
	
	
	public SinglyLinkedlistNode deleteFirst() {
		//if(head == null) {
		if(isEmpty()) {
			return null;
		}
		SinglyLinkedlistNode delNode = head;
		
		head = head.next;
		length--;
		delNode.next = null;
		return delNode;
		
	}
	
	public void printList() {
		SinglyLinkedlistNode cur = head;
		while(cur != null) {
			System.out.println(cur);
			cur = cur.next;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}
	

}
