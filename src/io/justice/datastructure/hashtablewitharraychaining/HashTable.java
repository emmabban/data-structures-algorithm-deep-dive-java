package io.justice.datastructure.hashtablewitharraychaining;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class HashTable {
	private List<List<Employee>> storage ;
	private int size;
	
	public HashTable(int size) {
		super();
		
		this.size = size;
		this.storage = new ArrayList<>(this.size);
		
		 List<Employee> temp ;
		 for(int i=0; i< this.size;i++) {
			 temp = new LinkedList<>(); 
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
	

	public Employee removeValue(String key) {
		
		/*
		 * if(hashMeth(key) < 0 || hashMeth(key) >= this.size) {
		 * System.out.println("Index is out of bound"); throw new
		 * IndexOutOfBoundsException(); }
		 */
		List<Employee> temp = this.storage.get(hashMeth(key));
		/*
		 * for(Employee em : temp) { if((em.getLastName().length()) == key.length() &&
		 * em.getLastName().equals(key)){ System.out.println(em); } }
		 */
		Employee foundEmp = temp.stream().filter(e-> 
		(e.getLastName().length()) == key.length() && e.getLastName().equals(key)
				).findAny().orElse(null);
		if(foundEmp != null) {
			temp.remove(foundEmp);
		}
		
		return foundEmp;
		
	}
	
public Employee removeValueV2(String key) {
		
		/*
		 * if(hashMeth(key) < 0 || hashMeth(key) >= this.size) {
		 * System.out.println("Index is out of bound"); throw new
		 * IndexOutOfBoundsException(); }
		 */
		List<Employee> temp = this.storage.get(hashMeth(key));
		/*
		 * for(Employee em : temp) { if((em.getLastName().length()) == key.length() &&
		 * em.getLastName().equals(key)){ System.out.println(em); } }
		 * 
		 */
		
		ListIterator<Employee> iter = temp.listIterator();
		int currentPosition = -1;
		Employee foundEmp = null;
		while(iter.hasNext()) {
			currentPosition++;
			 foundEmp = iter.next();
			 if( foundEmp.getLastName().equals(key)) {
				 break;
			 } else {
				 foundEmp = null;
			 }
		}
		if(foundEmp != null) {
			return temp.remove(currentPosition);
		}
		
		return null;
		
	}
	
	private int hashMeth(String key) {
		//return key.length()% this.size;
		return Math.abs(key.hashCode()% this.size);
	}
	
	
	public void printHashTable() {
		for(int i= 0;i < this.getSize(); i++) {
			System.out.print(i+ ": ");
			this.getStorage().get(i).stream().forEach( e-> {System.out.print( e +" "); });
			System.out.println();
		}
	}
	
	
	
	

}
