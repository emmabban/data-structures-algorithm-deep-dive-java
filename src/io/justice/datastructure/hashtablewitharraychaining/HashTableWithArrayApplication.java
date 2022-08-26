package io.justice.datastructure.hashtablewitharraychaining;

public class HashTableWithArrayApplication {

	public static void main(String[] args) {
		
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee markDacascos = new Employee("Mark", "Dacascos", 3346);
		Employee beforeJohnDoe = new Employee("BeforeJohn", "Doe", 765);

		HashTable map = new HashTable(3);
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
		System.out.println("==========");
		//System.out.println("Remove ->janeJones :" + map.removeValue(janeJones.getLastName()));
		System.out.println("Remove ->janeJones :" + map.removeValueV2(janeJones.getLastName()));
		System.out.println("Remove ->janeJones :" + map.removeValue(janeJones.getLastName()));
		map.printHashTable();
		
		


	}

}
