package io.justice.datastructure.doublylinedlist;

public class DoublyLinkedlistNode {
	Employee data;
	DoublyLinkedlistNode next;
	DoublyLinkedlistNode previous;
	
	

	public DoublyLinkedlistNode(Employee data) {
		super();
		this.data = data;
	}



	@Override
	public String toString() {
		return this.data.toString();
		//return "LinkedlistNode [data=" + data + "]";
	}
	
	
	
	

}
