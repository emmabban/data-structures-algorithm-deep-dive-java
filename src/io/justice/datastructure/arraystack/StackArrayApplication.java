package io.justice.datastructure.arraystack;

public class StackArrayApplication {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee markDacascos = new Employee("Mark", "Dacascos", 3346);
		Employee beforeJohnDoe = new Employee("BeforeJohn", "Doe", 765);
		ArrayStack stack = new ArrayStack(5);
		System.out.println(stack.peep());
		System.out.println(stack.pop());
		stack.printStack();
		System.out.println(stack.stackSize());

		System.out.println("=======");

		stack.push(janeJones);
		stack.push(johnDoe);
		stack.push(marySmith);
		
		stack.push(mikeWilson);
		stack.push(markDacascos);
		stack.push(beforeJohnDoe);
		System.out.println("size: " +stack.stackSize());
		System.out.println(stack.peep());
		System.out.println(stack.pop());
		stack.push(beforeJohnDoe);
		stack.printStack();
		System.out.println("size: " +stack.stackSize());

	}

}
