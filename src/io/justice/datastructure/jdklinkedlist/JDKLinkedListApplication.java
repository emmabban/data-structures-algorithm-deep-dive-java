package io.justice.datastructure.jdklinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

import io.justice.datastructure.doublylinedlist.Employee;

public class JDKLinkedListApplication {

	public static void main(String[] args) {
		
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe",4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee markDacascos = new Employee("Mark", "Dacascos", 3346);
		
		LinkedList<Employee> list = new LinkedList<>();
		list.addFirst(janeJones);
		list.addFirst(johnDoe);
		list.addFirst(marySmith);
		//list.addLast(mikeWilson);
		list.add(mikeWilson);
		list.addFirst(markDacascos);
		
		System.out.println(list.peek());
		System.out.println("======");
		Iterator<Employee> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		list.removeFirst();
		list.removeLast();
		list.remove();
		
		System.out.println("======");
		
		for(Employee emp : list) {
			System.out.println(emp);
		}
		
		/*
		 * List<Employee> employeeList = new ArrayList<>();
		 * 
		 * employeeList.add(new Employee("Jane", "Jones", 123)); employeeList.add(new
		 * Employee("John", "Doe",4567)); employeeList.add(new Employee("Mary", "Smith",
		 * 22)); employeeList.add(new Employee("Mike", "Wilson", 3245));
		 * //System.out.println(employeeList.indexOf(new Employee("John", "Doe",4567)));
		 * employeeList.stream().forEach(System.out::println);
		 * System.out.println("======"); employeeList.forEach(System.out::println);
		 * System.out.println("======");
		 * 
		 * employeeList.stream().skip(1).limit(1).forEach(System.out::println);
		 * System.out.println("======");
		 * 
		 * System.out.println(employeeList.get(1));
		 * 
		 * System.out.println("======");
		 * 
		 * System.out.println(employeeList.isEmpty());; employeeList.set(1, new
		 * Employee("John", "Adams", 4568)); System.out.println("======");
		 * employeeList.stream().forEach(System.out::println);
		 * System.out.println("======"); employeeList.add(3, new Employee("John",
		 * "Doe",4567)); employeeList.stream().forEach(System.out::println);
		 * System.out.println("======");
		 * 
		 * Object[] employeeArrayObject = employeeList.toArray();
		 * Stream.of(employeeArrayObject).forEach(System.out::println);
		 * System.out.println("======array"); Employee[] employeeArray =
		 * employeeList.toArray(new Employee[employeeList.size()]);
		 * Stream.of(employeeArray).forEach(System.out::println);
		 * System.out.println("======array");
		 * 
		 * System.out.println(employeeList.contains(employeeList.get(1)));
		 * 
		 * System.out.println("======");
		 * 
		 * System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
		 * 
		 * System.out.println("======");
		 * 
		 * System.out.println(employeeList.indexOf(new Employee("John", "Doe",4567)));
		 * 
		 * System.out.println("======"); System.out.println(employeeList.remove(new
		 * Employee("Mary", "Smith", 22))); System.out.println("======");
		 * System.out.println(employeeList.remove(0)); System.out.println("======");
		 * employeeList.stream().forEach(System.out::println);
		 * System.out.println("======"); System.arraycopy(employeeArray, 1,
		 * employeeArray, 0, employeeArray.length-1);
		 * Stream.of(employeeArray).forEach(System.out::println);
		 */


	}

}
