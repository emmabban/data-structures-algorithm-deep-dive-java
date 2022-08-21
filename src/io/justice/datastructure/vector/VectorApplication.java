package io.justice.datastructure.vector;

import java.util.List;
import java.util.Vector;
import java.util.stream.Stream;

public class VectorApplication {

	public static void main(String[] args) {
		List<Employee> employeeList = new Vector<>();
		
		employeeList.add(new Employee("Jane", "Jones", 123));
		employeeList.add(new Employee("John", "Doe",4567));
		employeeList.add(new Employee("Mary", "Smith", 22));
		employeeList.add(new Employee("Mike", "Wilson", 3245));
		
		
		
		
		
		//System.out.println(employeeList.indexOf(new Employee("John", "Doe",4567)));
		employeeList.stream().forEach(System.out::println);
		System.out.println("======");
		employeeList.forEach(System.out::println);
		System.out.println("======");

		employeeList.stream().skip(1).limit(1).forEach(System.out::println);
		System.out.println("======");

		System.out.println(employeeList.get(1));

		System.out.println("======");

		System.out.println(employeeList.isEmpty());;
		employeeList.set(1, new Employee("John", "Adams", 4568));
		System.out.println("======");
		employeeList.stream().forEach(System.out::println);
		System.out.println("======");
		employeeList.add(3, new Employee("John", "Doe",4567));
		employeeList.stream().forEach(System.out::println);
		System.out.println("======");
		
		Object[] employeeArrayObject = employeeList.toArray();
		Stream.of(employeeArrayObject).forEach(System.out::println);
		System.out.println("======array");
		Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
		Stream.of(employeeArray).forEach(System.out::println);
		System.out.println("======array");
		
		System.out.println(employeeList.contains(employeeList.get(1)));
		
		System.out.println("======");
		
		System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
		
		System.out.println("======");
		
		System.out.println(employeeList.indexOf(new Employee("John", "Doe",4567)));
		
		System.out.println("======");
		System.out.println(employeeList.remove(new Employee("Mary", "Smith", 22)));
		System.out.println("======");
		System.out.println(employeeList.remove(0));
		System.out.println("======");
		employeeList.stream().forEach(System.out::println);
		System.out.println("======");
		System.arraycopy(employeeArray, 1, employeeArray, 0, employeeArray.length-1);
		Stream.of(employeeArray).forEach(System.out::println);



	}

}
