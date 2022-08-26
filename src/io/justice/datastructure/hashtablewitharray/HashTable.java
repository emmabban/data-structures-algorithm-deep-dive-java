package io.justice.datastructure.hashtablewitharray;

import java.util.ArrayList;
import java.util.List;

public class HashTable {
	private List<List<Employee>> storage ;
	private int size;
	
	public HashTable(int size) {
		super();
		
		this.size = size;
		this.storage = new ArrayList<>(this.size);
		
		 List<Employee> temp = new ArrayList<>(); 
		 for(int i=0; i< this.size;i++) {
			 temp = new ArrayList<>(); 
		 this.storage.add(temp); }
		
	}

	public List<List<Employee>> getStorage() {
		return storage;
	}

	public int getSize() {
		return size;
	}
	
	public boolean putValue(String key, Employee emp) {
		/*
		 * if(this.storage.get(this.hashMeth(key)) == null) { this.storage.add(new
		 * ArrayList<>()); }
		 */
		this.storage.get(this.hashMeth(key)).add(emp);
		return true;
		
	}
	
	public Employee getValue(String key) {
		
		if(hashMeth(key) < 0 || hashMeth(key) >= this.size) {
			System.out.println("Index is out of bound");
			throw new IndexOutOfBoundsException();
		}
		List<Employee> temp = this.storage.get(hashMeth(key));
		/*
		 * for(Employee em : temp) { if((em.getLastName().length()) == key.length() &&
		 * em.getLastName().equals(key)){ System.out.println(em); } }
		 */
		
		return temp.stream().filter(e-> 
		(e.getLastName().length()) == key.length() && e.getLastName().equals(key)
				).findAny().orElse(null);
		
	}
	
	private int hashMeth(String key) {
		return key.length()% this.size;
	}
	
	
	public void printHashTable() {
		for(int i= 0;i < this.getSize(); i++) {
			System.out.print(i+ ": ");
			this.getStorage().get(i).stream().forEach( e-> {System.out.print( e +" "); });
			System.out.println();
		}
	}
	
	
	
	

}
