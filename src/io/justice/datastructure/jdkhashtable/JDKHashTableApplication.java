package io.justice.datastructure.jdkhashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class JDKHashTableApplication {

	public static void main(String[] args) {
		
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee markDacascos = new Employee("Mark", "Dacascos", 3346);
		Employee beforeJohnDoe = new Employee("BeforeJohn", "Doe", 765);

		Map<String, Employee> map = new HashMap<>();
		map.put(beforeJohnDoe.getLastName(),beforeJohnDoe);
		map.put(markDacascos.getLastName(),markDacascos);
		map.put(mikeWilson.getLastName(),mikeWilson);
		map.put(marySmith.getLastName(),marySmith);
		Employee emp = map.put(johnDoe.getLastName(),johnDoe);
		///Employee emp = map.putIfAbsent(johnDoe.getLastName(),johnDoe);
		map.put(janeJones.getLastName(),janeJones);
		System.out.println("Remove : janeJones : "+ map.remove(janeJones.getLastName()));
		map.entrySet().stream().forEach(e -> {System.out.println(e.getKey() + ": "+ e.getValue());});
		
		System.out.println(map.containsKey(mikeWilson.getLastName()));
		System.out.println(map.containsValue(mikeWilson));
		System.out.println("GET : markDacascos : "+ map.get(markDacascos.getLastName()));
		System.out.println("GET : someone : "+ map.getOrDefault("someone",marySmith));
		
		System.out.println("Replacement value: "+ emp);
		
		/*
		 * System.out.println("Get ->beforeJohnDoe :" +
		 * 
		 * map.getValue(beforeJohnDoe.getLastName()));
		 * System.out.println("Get ->markDacascos :" +
		 * map.getValue(markDacascos.getLastName()));
		 * System.out.println("Get ->mikeWilson :" +
		 * map.getValue(mikeWilson.getLastName()));
		 * System.out.println("Get ->marySmith :" +
		 * map.getValue(marySmith.getLastName())); System.out.println("Get ->johnDoe :"
		 * + map.getValue(johnDoe.getLastName()));
		 * System.out.println("Get ->janeJones :" +
		 * map.getValue(janeJones.getLastName()));
		 */
		
		/*
		 * List<Employee> employeeList = new ArrayList<>();
		 * 
		 * employeeList.add(new Employee("Jane", "Jones", 123)); employeeList.add(new
		 * Employee("John", "Doe",4567)); employeeList.add(new Employee("Mary", "Smith",
		 * 22)); employeeList.add(new Employee("Mike", "Wilson", 3245));
		 */
		
		
		//System.out.println(employeeList.indexOf(new Employee("John", "Doe",4567)));
		/*
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
