package io.justice.datastructure.hashtablewitharrayv2;

import java.util.stream.Stream;

public class HashTableV3 {
	private StoredEmployee[] storage;

	public HashTableV3() {
		super();
		
		this.storage = new StoredEmployee[10];
		
	}

	

	public StoredEmployee[] getStorage() {
		return storage;
	}



	/*
	 * public boolean putValue(String key, Employee emp) {
	 * 
	 * if(this.storage[this.hashMeth(key)] != null) {
	 * System.out.println("There is no spot at this key to add entry"); return
	 * false;
	 * 
	 * } this.storage[this.hashMeth(key)] = emp; return true;
	 * 
	 * }
	 */
	
	public boolean putValueProbing(String key, Employee emp) {
		int hashedKey = this.hashMeth(key);
		int startIndex = hashedKey;
		hashedKey = hashMeth(hashedKey, startIndex);
		
		this.storage[hashedKey] = new StoredEmployee(key,emp);
		return true;

	}

	/*
	 * public Employee getValue(String key) { return this.storage[(hashMeth(key))];
	 * 
	 * 
	 * }
	 */
	
	
	public Employee getValueProbing(String key) {
		int hashedKey = this.hashMeth(key);
		int startIndex = hashedKey;
		if(this.storage[hashedKey] != null && key.equals(this.storage[hashedKey].getKey())) {
			return  this.storage[hashedKey].getEmployee();
		}else  {
			return getValueProbing( key, hashedKey + 1, startIndex) ;
		}

		
	}
	
	private Employee getValueProbing(String key,int hashedKey,int startIndex) {
		int hashedKeyLocal = hashedKey%this.storage.length;
		if(this.storage[hashedKeyLocal] != null  && key.equals(this.storage[hashedKeyLocal].getKey())) {
			return  this.storage[hashedKeyLocal].getEmployee();
		}else if(hashedKeyLocal != startIndex) {
			return getValueProbing(key,hashedKeyLocal+1,startIndex);
		} else {
			System.out.println(" There is no value associated with key provided");
			return null;
		}

		
	}
	
	public Employee removeProbing(String key) {
		int hashedKey = this.hashMeth(key);
		int startIndex = hashedKey;
		if(this.storage[hashedKey] != null && key.equals(this.storage[hashedKey].getKey())) {
			Employee employee =  this.storage[hashedKey].getEmployee();
			/*
			 * this.storage[hashedKey].setEmployee(null);
			 * this.storage[hashedKey].setKey(null);
			 */
			this.storage[hashedKey]= null;
			return  employee;
		}else  {
			return removeValueProbing( key, hashedKey + 1, startIndex) ;
		}

		
	}
	
	private Employee removeValueProbing(String key,int hashedKey,int startIndex) {
		int hashedKeyLocal = hashedKey%this.storage.length;
		if(this.storage[hashedKeyLocal] != null  && key.equals(this.storage[hashedKeyLocal].getKey())) {
			Employee employee =  this.storage[hashedKeyLocal].getEmployee();
			/*
			 * this.storage[hashedKeyLocal].setEmployee(null);
			 * this.storage[hashedKeyLocal].setKey(null);
			 */
			this.storage[hashedKeyLocal] = null;
			return  employee;
		}else if(hashedKeyLocal != startIndex) {
			return removeValueProbing(key,hashedKeyLocal+1,startIndex);
		} else {
			System.out.println(" The key provided does not exit");
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
