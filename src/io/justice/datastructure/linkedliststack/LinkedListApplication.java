package io.justice.datastructure.linkedliststack;

public class LinkedListApplication {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee markDacascos = new Employee("Mark", "Dacascos", 3346);
		Employee beforeJohnDoe = new Employee("BeforeJohn", "Doe", 765);
		LinkedStack linkedStack = new LinkedStack();
		System.out.println(linkedStack.peek());
		System.out.println(linkedStack.pop());
		linkedStack.printStack();
		System.out.println(linkedStack.stackSize());

		System.out.println("=======");

		linkedStack.push(janeJones);
		linkedStack.push(johnDoe);
		linkedStack.push(marySmith);
		
		linkedStack.push(mikeWilson);
		linkedStack.push(markDacascos);
		linkedStack.push(beforeJohnDoe);
		System.out.println("size: " +linkedStack.stackSize());
		System.out.println(linkedStack.peek());
		System.out.println(linkedStack.pop());
		//linkedStack.push(beforeJohnDoe);
		linkedStack.printStack();
		System.out.println("size: " +linkedStack.stackSize());

	}

}
