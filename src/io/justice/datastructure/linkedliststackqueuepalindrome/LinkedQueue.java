package io.justice.datastructure.linkedliststackqueuepalindrome;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedQueue {

  private LinkedList<Character> entries;
public LinkedQueue() {
	this.entries = new LinkedList<>();
}

public boolean add(Character ch) {
	this.entries.add(ch);
	return true;
}

public Character remove() {
	if(this.isEmpty()) {
		System.out.println("Queue is empty");
		return null;
	}
	return this.entries.remove();
}


public Character peek() {
	if(this.isEmpty()) {
		System.out.println("Queue is empty");
	}
	return this.entries.peek();
}

public int queueSize()
{
	return this.entries.size();
}




public boolean isEmpty() {
	return this.entries.isEmpty();
}

  
public void printQueue() {
	System.out.print(" Front-> ");
	Iterator<Character> iter = this.entries.iterator();
	while(iter.hasNext()) {
		System.out.print(iter.next() +" -> ");
	}
	System.out.print(" End \n");
}

/*
 * public boolean isPalindrome(String word) { word = word.replaceAll(",",
 * "").replaceAll("[ ]*", ""). replaceAll("\\?", "").replaceAll("\'",
 * "").replaceAll("\"", "").replaceAll("!", "").toLowerCase().trim(); if(word ==
 * null || word.isBlank()) { return false; } int mid = word.length()/2; int
 * stackEnd = mid;
 * 
 * if( word.length() % 2 == 0) { stackEnd = stackEnd -1; } LinkedQueue
 * wordToTest = new LinkedQueue();
 * 
 * for(int i = 0; i<=stackEnd;i++) { wordToTest.push(word.charAt(i)); }
 * 
 * for(int i = mid; i< word.length();i++) { if(word.charAt(i) !=
 * wordToTest.pop()) { return false; } }
 * 
 * return true;
 * 
 * }
 */


/*
 * public boolean isPalindromeV2(String word) { word = word.replaceAll(",",
 * "").replaceAll("[ ]*", ""). replaceAll("\\?", "").replaceAll("\'",
 * "").replaceAll("\"", "").replaceAll("!", "").toLowerCase().trim(); if(word ==
 * null || word.isBlank()) { return false; } LinkedQueue wordToTest = new
 * LinkedQueue();
 * 
 * for(int i = 0; i<word.length();i++) { wordToTest.push(word.charAt(i)); }
 * 
 * for(int i = 0; i<word.length();i++) { if(word.charAt(i) != wordToTest.pop())
 * { return false; }; }
 * 
 * return true;
 * 
 * }
 */

/*
 * public boolean isPalindromeV3(String word) { word = word.replaceAll(",",
 * "").replaceAll("[ ]*", ""). replaceAll("\\?", "").replaceAll("\'",
 * "").replaceAll("\"", "").replaceAll("!", "").toLowerCase().trim(); if(word ==
 * null || word.isBlank()) { return false; } LinkedQueue wordToTest = new
 * LinkedQueue();
 * 
 * for(int i = 0; i<word.length();i++) { wordToTest.push(word.charAt(i)); }
 * StringBuilder wordToTestString = new StringBuilder(); for(int i = 0;
 * i<word.length();i++) { wordToTestString.append(wordToTest.pop()); }
 * 
 * return wordToTestString.toString().equals(word);
 * 
 * }
 */
  
  
  

}
