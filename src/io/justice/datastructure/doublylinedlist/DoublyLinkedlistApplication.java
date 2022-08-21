package io.justice.datastructure.doublylinedlist;

public class DoublyLinkedlistApplication {

	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane", "Jones", 123);
	Employee johnDoe = new Employee("John", "Doe",4567);
	Employee marySmith = new Employee("Mary", "Smith", 22);
	Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
	Employee markDacascos = new Employee("Mark", "Dacascos", 3346);
	Employee beforeJohnDoe = new Employee("BeforeJohn", "Doe", 765);
	
	DoublyLinkedlist list = new DoublyLinkedlist();
	System.out.println(list.length);
	System.out.println(list.isEmpty());
	System.out.println(list.isEmpty2());
	//list.addBefore(johnDoe,beforeJohnDoe);
	list.insertFirst(janeJones);
	list.insertFirst(johnDoe);
	list.insertFirst(marySmith);
	list.insertFirst(mikeWilson);
	list.insertLast(markDacascos);
	list.addBefore(johnDoe,beforeJohnDoe);
	System.out.println(list.length);
	/*
	 * System.out.println("deleted first->" + list.deleteFirst());
	 * System.out.println("deleted last->" + list.deleteLast());
	 * 
	 * System.out.println("deleted first->" + list.deleteFirst());
	 * System.out.println("deleted last->" + list.deleteLast());
	 */
	
	/*
	 * System.out.println("deleted first->" + list.deleteFirst());
	 * System.out.println("deleted last->" + list.deleteLast());
	 */
	System.out.println(list.length);
	System.out.println(list.isEmpty());
	
	list.printList();

		


	}

}
