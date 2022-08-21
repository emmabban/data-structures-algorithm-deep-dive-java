package io.justice.datastructure.singlylinkedlist;

public class SinglyLinkedlistApplication {

	public static void main(String[] args) {
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe",4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		
		SinglyLinkedlist list = new SinglyLinkedlist();
		System.out.println(list.length);
		System.out.println(list.isEmpty());
		list.insertFirst(janeJones);
		list.insertFirst(johnDoe);
		list.insertFirst(marySmith);
		list.insertFirst(mikeWilson);
		System.out.println(list.length);
		System.out.println("deleted ->" + list.deleteFirst());
		System.out.println(list.length);
		System.out.println(list.isEmpty());
		
		list.printList();


	}

}
