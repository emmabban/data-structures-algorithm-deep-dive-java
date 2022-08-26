package io.justice.datastructure.hashtablechallenge;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class HashTableChallengeApplication {

	public static void main(String[] args) {

		        int[] nums = new int[10];
		        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
		        for (int i = 0; i < numsToAdd.length; i++) {
		            nums[hash(numsToAdd[i])] = numsToAdd[i];
		        }
		        for (int i = 0; i < nums.length; i++) {
		            System.out.println(nums[i]);
		        }
		        
		        System.out.println("=========");
		        LinkedList<Employee> employees = new LinkedList<>();
		        employees.add(new Employee("Jane", "Jones", 123));
		        employees.add(new Employee("John", "Doe", 5678));
		        employees.add(new Employee("Mike", "Wilson", 45));
		        employees.add(new Employee("Mary", "Smith", 5555));
		        employees.add(new Employee("John", "Doe", 5678));
		        employees.add(new Employee("Bill", "End", 3948));
		        employees.add(new Employee("Jane", "Jones", 123));
		        
		        Map<Employee,Employee> mapVal = removeDuplicates(employees);
		        
		        for(Employee emp : mapVal.values() ) {
		        	employees.remove(emp);
		        }

		        employees.forEach(e -> System.out.println(e));

		        
		    }

		    public static int hash(int value) {
		    	int valueCopy = value;
		    	int sum = 0;
		    	while(Math.abs(valueCopy) > 10) {
		    		sum += valueCopy%10;
		    		valueCopy/=10;
		    	}
		    	
		    	return Math.abs(sum) % 10;

		    }
		    
		    public static Map removeDuplicates(LinkedList<Employee> employeeshead) {
		    	ListIterator<Employee> iter = employeeshead.listIterator();
		    	Employee temp;
		    	int[] result = new int[employeeshead.size()];
		    	Map<Employee, Employee> map = new HashMap<>();
		    	Map<Employee, Employee> dupMap = new HashMap<>();
		    	int cur = -1;
		    	int arridx =0;
		    	while(iter.hasNext()) {
		    		temp = iter.next();
		    		cur++;
		    		if(map.containsKey(temp)) {
		    			//result[arridx++] = cur;
		    			dupMap.put(temp, temp);
		    		}else {
		    			map.put(temp, temp);
		    		}
		    		
		    	}
		    	
		    	return dupMap;

		    }
		
		/*
		 * Employee janeJones = new Employee("Jane", "Jones", 123); Employee johnDoe =
		 * new Employee("John", "Doe", 4567); Employee marySmith = new Employee("Mary",
		 * "Smith", 22); Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		 * Employee markDacascos = new Employee("Mark", "Dacascos", 3346); Employee
		 * beforeJohnDoe = new Employee("BeforeJohn", "Doe", 765);
		 * 
		 * Map<String, Employee> map = new HashMap<>();
		 * map.put(beforeJohnDoe.getLastName(),beforeJohnDoe);
		 * map.put(markDacascos.getLastName(),markDacascos);
		 * map.put(mikeWilson.getLastName(),mikeWilson);
		 * map.put(marySmith.getLastName(),marySmith); Employee emp =
		 * map.put(johnDoe.getLastName(),johnDoe);
		 */
		///Employee emp = map.putIfAbsent(johnDoe.getLastName(),johnDoe);
		/*
		 * map.put(janeJones.getLastName(),janeJones);
		 * System.out.println("Remove : janeJones : "+
		 * map.remove(janeJones.getLastName())); map.entrySet().stream().forEach(e ->
		 * {System.out.println(e.getKey() + ": "+ e.getValue());});
		 * 
		 * System.out.println(map.containsKey(mikeWilson.getLastName()));
		 * System.out.println(map.containsValue(mikeWilson));
		 * System.out.println("GET : markDacascos : "+
		 * map.get(markDacascos.getLastName())); System.out.println("GET : someone : "+
		 * map.getOrDefault("someone",marySmith));
		 * 
		 * System.out.println("Replacement value: "+ emp);
		 */
		
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



	//}

}
