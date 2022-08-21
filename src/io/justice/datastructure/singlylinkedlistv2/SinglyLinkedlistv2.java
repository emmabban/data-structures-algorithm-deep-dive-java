package io.justice.datastructure.singlylinkedlistv2;

public class SinglyLinkedlistv2 {
	SinglyLinkedv2listNode head;
	int length;
	
	public void insertFirst(int val) {
		SinglyLinkedv2listNode valueToInsert = new SinglyLinkedv2listNode(val, null);
		if(head == null) {
			head = valueToInsert;
			length++;
			return;
		}
		
		valueToInsert.next = head;
		head = valueToInsert;
		length++;
		
	}
	
	
	public void insertValueSorted(int val) {
		SinglyLinkedv2listNode valueToInsert = new SinglyLinkedv2listNode(val, null);
		if(head == null) {
			head = valueToInsert;
			length++;
			return;
		}
		
		SinglyLinkedv2listNode cur = head;
		SinglyLinkedv2listNode beforeCur = head;
		while(cur != null && cur.data <= val) {
			beforeCur = cur;
			cur = cur.next;
		}
		
		if(cur == head) {
			valueToInsert.next = head;
			head = valueToInsert;
			length++;
			return;
		}
		
		/*
		 * if(cur == null) { beforeCur.next = valueToInsert; length++; return; }
		 */
		
		beforeCur.next = valueToInsert;
		valueToInsert.next = cur;
		length++;
		
	}
	
	public SinglyLinkedv2listNode deleteFirst() {
		//if(head == null) {
		if(isEmpty()) {
			return null;
		}
		SinglyLinkedv2listNode delNode = head;
		
		head = head.next;
		length--;
		delNode.next = null;
		return delNode;
		
	}
	
	public void printList() {
		SinglyLinkedv2listNode cur = head;
		while(cur != null) {
			System.out.println(cur.data);
			cur = cur.next;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}
	

}
