package io.justice.datastructure.singlylinkedlist;

public class SinglyLinkedlistNode {
	Employee data;
	SinglyLinkedlistNode next;
	
	public SinglyLinkedlistNode(Employee data, SinglyLinkedlistNode next) {
		super();
		this.data = data;
		this.next = next;
	}

	@Override
	public String toString() {
		return this.data.toString();
		//return "LinkedlistNode [data=" + data + "]";
	}
	
	
	
	

}
