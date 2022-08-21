package io.justice.datastructure.linkedliststackpalindrome;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedStack {

  private LinkedList<Character> entries;
public LinkedStack() {
	this.entries = new LinkedList<>();
}

public boolean push(Character ch) {
	this.entries.push(ch);
	return true;
}

public Character pop() {
	if(this.isEmpty()) {
		System.out.println("Satck is empty");
		return null;
	}
	return this.entries.pop();
}


public Character peek() {
	if(this.isEmpty()) {
		System.out.println("Satck is empty");
	}
	return this.entries.peek();
}

public int stackSize()
{
	return this.entries.size();
}




public boolean isEmpty() {
	return this.entries.isEmpty();
}

  
public void printStack() {
	System.out.print(" Top-> ");
	Iterator<Character> iter = this.entries.iterator();
	while(iter.hasNext()) {
		System.out.print(iter.next() +" -> ");
	}
	System.out.print(" Bottom \n");
}

public boolean isPalindrome(String word) {
	word = word.replaceAll(",", "").replaceAll("[ ]*", "").
			replaceAll("\\?", "").replaceAll("\'", "").replaceAll("\"", "").replaceAll("!", "").toLowerCase().trim();
	if(word == null || word.isBlank()) {
		return false;
	}
	int mid = word.length()/2;
	int stackEnd = mid;
	
	if( word.length() % 2 == 0) {
		stackEnd = stackEnd -1;
	}
	LinkedStack wordToTest = new LinkedStack();
	
	for(int i = 0; i<=stackEnd;i++) {
		wordToTest.push(word.charAt(i));
	}
	
	for(int i = mid; i< word.length();i++) {
		if(word.charAt(i) != wordToTest.pop()) {
			return false;
		}
	}
	
	return true;
	
}


public boolean isPalindromeV2(String word) {
	word = word.replaceAll(",", "").replaceAll("[ ]*", "").
			replaceAll("\\?", "").replaceAll("\'", "").replaceAll("\"", "").replaceAll("!", "").toLowerCase().trim();
	if(word == null || word.isBlank()) {
		return false;
	}
	LinkedStack wordToTest = new LinkedStack();
	
	for(int i = 0; i<word.length();i++) {
		wordToTest.push(word.charAt(i));
	}
	
	for(int i = 0; i<word.length();i++) {
		if(word.charAt(i) != wordToTest.pop()) {
			return false;
		};
	}
	
	return true;
	
}

public boolean isPalindromeV3(String word) {
	word = word.replaceAll(",", "").replaceAll("[ ]*", "").
			replaceAll("\\?", "").replaceAll("\'", "").replaceAll("\"", "").replaceAll("!", "").toLowerCase().trim();
	if(word == null || word.isBlank()) {
		return false;
	}
	LinkedStack wordToTest = new LinkedStack();
	
	for(int i = 0; i<word.length();i++) {
		wordToTest.push(word.charAt(i));
	}
	StringBuilder wordToTestString = new StringBuilder();
	for(int i = 0; i<word.length();i++) {
		wordToTestString.append(wordToTest.pop());
	}
	
	return wordToTestString.toString().equals(word);
	
}
  
  
  

}
