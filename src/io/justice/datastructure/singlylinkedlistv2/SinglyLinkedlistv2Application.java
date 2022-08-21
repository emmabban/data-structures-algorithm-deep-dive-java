package io.justice.datastructure.singlylinkedlistv2;

public class SinglyLinkedlistv2Application {

	public static void main(String[] args) {
		
		
		SinglyLinkedlistv2 list = new SinglyLinkedlistv2();
		System.out.println(list.length);
		System.out.println(list.isEmpty());
		
		 list.insertValueSorted(1); list.insertValueSorted(2);
		 list.insertValueSorted(3); list.insertValueSorted(4);
		
		
		list.insertValueSorted(4);
		list.insertValueSorted(2);
		list.insertValueSorted(1);
		list.insertValueSorted(5);
		
		
		  list.insertValueSorted(4); list.insertValueSorted(3);
		 list.insertValueSorted(2); list.insertValueSorted(1);
		 list.insertValueSorted(8); list.insertValueSorted(7);
		 list.insertValueSorted(7);
		
		 System.out.println("lenght: " + list.length);
		 System.out.println("deleted ->" +  list.deleteFirst()); 
		 System.out.println("lenght: " + list.length);
		 System.out.println(list.isEmpty());
		
		list.printList();


	}

}
