package io.justice.datastructure.hashtablewitharrayv2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class HashTableWithArrayApplicationV2 {

	public static void main(String[] args) {
		
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee markDacascos = new Employee("Mark", "Dacascos", 3346);
		Employee beforeJohnDoe = new Employee("BeforeJohn", "Doe", 765);

		HashTableV2 map = new HashTableV2();
		map.putValue(beforeJohnDoe.getLastName(),beforeJohnDoe);
		map.putValue(markDacascos.getLastName(),markDacascos);
		map.putValue(mikeWilson.getLastName(),mikeWilson);
		map.putValue(marySmith.getLastName(),marySmith);
		map.putValue(johnDoe.getLastName(),johnDoe);
		map.putValue(janeJones.getLastName(),janeJones);
		map.printHashTable();
		System.out.println("Get ->beforeJohnDoe :" + map.getValue(beforeJohnDoe.getLastName()));
		System.out.println("Get ->markDacascos :" + map.getValue(markDacascos.getLastName()));
		System.out.println("Get ->mikeWilson :" + map.getValue(mikeWilson.getLastName()));
		System.out.println("Get ->marySmith :" + map.getValue(marySmith.getLastName()));
		System.out.println("Get ->johnDoe :" + map.getValue(johnDoe.getLastName()));
		System.out.println("Get ->janeJones :" + map.getValue(janeJones.getLastName()));
		
		System.out.println("========================");
		
		HashTableV2 map2 = new HashTableV2();
		map2.putValueProbing(beforeJohnDoe.getLastName(),beforeJohnDoe);
		map2.putValueProbing(markDacascos.getLastName(),markDacascos);
		map2.putValueProbing(mikeWilson.getLastName(),mikeWilson);
		map2.putValueProbing(marySmith.getLastName(),marySmith);
		map2.putValueProbing(johnDoe.getLastName(),johnDoe);
		map2.putValueProbing(janeJones.getLastName(),janeJones);
		map2.printHashTable();
		System.out.println("Get Probing->beforeJohnDoe :" + map2.getValueProbing(beforeJohnDoe.getLastName()));
		System.out.println("Get Probing->markDacascos :" + map2.getValueProbing(markDacascos.getLastName()));
		System.out.println("Get Probing->mikeWilson :" + map2.getValueProbing(mikeWilson.getLastName()));
		System.out.println("Get Probing->marySmith :" + map2.getValueProbing(marySmith.getLastName()));
		System.out.println("Get Probing->johnDoe :" + map2.getValueProbing(johnDoe.getLastName()));
		System.out.println("Get Probing->janeJones :" + map2.getValueProbing(janeJones.getLastName()));
		
		System.out.println("========================");
		
		HashTableV3 map3 = new HashTableV3();
		map3.putValueProbing(beforeJohnDoe.getLastName(),beforeJohnDoe);
		map3.putValueProbing(markDacascos.getLastName(),markDacascos);
		map3.putValueProbing(mikeWilson.getLastName(),mikeWilson);
		map3.putValueProbing(marySmith.getLastName(),marySmith);
		map3.putValueProbing(johnDoe.getLastName(),johnDoe);
		map3.putValueProbing(janeJones.getLastName(),janeJones);
		map3.printHashTable();
		System.out.println("Get Probing->beforeJohnDoe :" + map3.getValueProbing(beforeJohnDoe.getLastName()));
		System.out.println("Get Probing->markDacascos :" + map3.getValueProbing(markDacascos.getLastName()));
		System.out.println("Get Probing->mikeWilson :" + map3.getValueProbing(mikeWilson.getLastName()));
		System.out.println("Get Probing->marySmith :" + map3.getValueProbing(marySmith.getLastName()));
		System.out.println("Get Probing->johnDoe :" + map3.getValueProbing(johnDoe.getLastName()));
		System.out.println("Get Probing->janeJones :" + map3.getValueProbing(janeJones.getLastName()));
		
		
		System.out.println("Remove Probing->beforeJohnDoe :" + map3.removeProbing(beforeJohnDoe.getLastName()));
		System.out.println("Remove Probing->markDacascos :" + map3.removeProbing(markDacascos.getLastName()));
		System.out.println("Remove Probing->janeJones :" + map3.removeProbing(janeJones.getLastName()));
		System.out.println("Remove Probing->doesnotexist :" + map3.removeProbing("doesnotexist"));
		map3.printHashTable();
		
		System.out.println("Get Probing->johnDoe :" + map3.getValueProbing(johnDoe.getLastName()));
		System.out.println("Get Probing->marySmith :" + map3.getValueProbing(marySmith.getLastName()));
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
