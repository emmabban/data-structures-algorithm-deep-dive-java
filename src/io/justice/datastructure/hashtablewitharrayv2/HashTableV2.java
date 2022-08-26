package io.justice.datastructure.hashtablewitharrayv2;

import java.util.stream.Stream;

public class HashTableV2 {
	private Employee[] storage;

	public HashTableV2() {
		super();
		
		this.storage = new Employee[6];
		
	}

	

	public Employee[] getStorage() {
		return storage;
	}



	public boolean putValue(String key, Employee emp) {

		if(this.storage[this.hashMeth(key)] != null) {
			System.out.println("There is no spot at this key to add entry");
			return false;
	
		}
		this.storage[this.hashMeth(key)] = emp;
		return true;

	}
	
	public boolean putValueProbing(String key, Employee emp) {
		int hashedKey = this.hashMeth(key);
		int startIndex = hashedKey;
		hashedKey = hashMeth(hashedKey, startIndex);
		
		this.storage[hashedKey] = emp;
		return true;

	}

	public Employee getValue(String key) {
		return  this.storage[(hashMeth(key))];

		
	}
	
	
	public Employee getValueProbing(String key) {
		int hashedKey = this.hashMeth(key);
		int startIndex = hashedKey;
		if(key.equals(this.storage[hashedKey].getLastName())) {
			return  this.storage[hashedKey];
		}else  {
			return getValueProbing( key, hashedKey + 1, startIndex) ;
		}

		
	}
	
	private Employee getValueProbing(String key,int hashedKey,int startIndex) {
		int hashedKeyLocal = hashedKey%this.storage.length;
		if(this.storage[hashedKeyLocal] != null  && key.equals(this.storage[hashedKeyLocal].getLastName())) {
			return  this.storage[hashedKeyLocal];
		}else if(hashedKeyLocal != startIndex) {
			return getValueProbing(key,hashedKeyLocal+1,startIndex);
		} else {
			System.out.println(" There is no value associated with key provided");
			return null;
		}

		
	}


	private int hashMeth(String key) {
		return key.length() % this.storage.length;
	}
	
	private int hashMeth(int key, int startIndex) {
		if(key < this.storage.length && this.storage[key] != null) {
			return hashMeth(key +1, startIndex);
	
		} else if(key >= this.storage.length) {
			int storeCurrentKey = key;
			storeCurrentKey = storeCurrentKey % this.storage.length;
			if(storeCurrentKey < startIndex && this.storage[storeCurrentKey] != null) {
				return hashMeth(key +1, startIndex);
			} else if(storeCurrentKey < startIndex) {
				return hashMeth(storeCurrentKey, startIndex);
			}
			System.out.println("There is no spot at this key to add entry");
			throw new IndexOutOfBoundsException();
		}
		return key;
	}

	public void printHashTable() {
		//for (int i = 0; i < this.storage.length; i++) {
			//System.out.print(i + ": ");
			Stream.of(this.getStorage()).forEach(System.out::println);
			//System.out.println();
		//}
	}

}
