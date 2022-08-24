package io.justice.datastructure.linkedliststackqueuepalindrome;

public class LinkedListApplication {

	public static void main(String[] args) {
		
		
		
		System.out.println("isPalindrome(\"racecar\") : "+ isPalindrome("racecar"));
		System.out.println("isPalindrome(\"Racecar\") : "+ isPalindrome("racecar"));
		System.out.println("isPalindrome(\"hello\") : "+ isPalindrome("hello"));
		System.out.println("isPalindrome(\"Was it a car or a cat I saw\") : "+ isPalindrome("Was it a car or a cat I saw"));
		System.out.println("isPalindrome(\"I did,\"madam\" did I?\") : "+ isPalindrome("I did,\"madam\" did I?"));
		System.out.println("isPalindrome(\"abccba\") : "+ isPalindrome("abccba"));
		System.out.println("isPalindrome(\"Don't nod!\") : "+ isPalindrome("Don't nod!"));
		System.out.println("isPalindrome(\"Don't nod\") : "+ isPalindrome("Don't nod"));
		System.out.println("isPalindrome(\"Racecar\") : "+ isPalindrome("racecar"));
		
		
		
		/*
		 * LinkedQueue queue = new LinkedQueue();
		 * 
		 * queue.add('A'); queue.add('B'); queue.add('C'); queue.add('D');
		 * queue.printQueue();
		 */

		/*
		 * LinkedStack linkedStack = new LinkedStack(); System.out.println("size: "
		 * +linkedStack.stackSize()); System.out.println(linkedStack.peek());
		 * System.out.println(linkedStack.pop()); linkedStack.printStack();
		 * System.out.println("isPalindrome : "+
		 * linkedStack.isPalindrome("I did,\"madam\" did I?"));
		 * System.out.println("isPalindrome : "+ linkedStack.isPalindrome("racecar"));
		 * System.out.println("isPalindrome : "+ linkedStack.isPalindrome("Racecar"));
		 * System.out.println("isPalindrome : "+ linkedStack.isPalindrome("hello"));
		 * System.out.println("======v2");
		 * 
		 * System.out.println("isPalindrome : "+
		 * linkedStack.isPalindromeV2("I did,\"madam\" did I?"));
		 * System.out.println("isPalindrome : "+ linkedStack.isPalindromeV2("racecar"));
		 * System.out.println("isPalindrome : "+ linkedStack.isPalindromeV2("Racecar"));
		 * System.out.println("isPalindrome : "+ linkedStack.isPalindromeV2("hello"));
		 * 
		 * System.out.println("======v3");
		 * 
		 * System.out.println("isPalindrome : "+
		 * linkedStack.isPalindromeV3("I did,\"madam\" did I?"));
		 * System.out.println("isPalindrome : "+ linkedStack.isPalindromeV3("racecar"));
		 * System.out.println("isPalindrome : "+ linkedStack.isPalindromeV3("Racecar"));
		 * System.out.println("isPalindrome : "+ linkedStack.isPalindromeV3("hello"));
		 * System.out.println("======"); System.out.println("isPalindrome : "+
		 * linkedStack.isPalindrome("abccba")); System.out.println("isPalindrome : "+
		 * linkedStack.isPalindrome("Was it a car or a cat I saw"));
		 * System.out.println("isPalindrome : "+
		 * linkedStack.isPalindrome("I did, did I?"));
		 * System.out.println("isPalindrome : "+ linkedStack.isPalindrome("hello"));
		 * System.out.println("isPalindrome : "+
		 * linkedStack.isPalindrome("Don't nod!"));
		 * System.out.println("isPalindrome : "+ linkedStack.isPalindrome("Don't nod"));
		 * System.out.println("======v2"); System.out.println("isPalindrome : "+
		 * linkedStack.isPalindromeV2("abccba")); System.out.println("isPalindrome : "+
		 * linkedStack.isPalindromeV2("Was it a car or a cat I saw"));
		 * System.out.println("isPalindrome : "+
		 * linkedStack.isPalindromeV2("I did, did I?"));
		 * System.out.println("isPalindrome : "+ linkedStack.isPalindromeV2("hello"));
		 * System.out.println("isPalindrome : "+
		 * linkedStack.isPalindromeV2("Don't nod!"));
		 * System.out.println("isPalindrome : "+
		 * linkedStack.isPalindromeV2("Don't nod"));
		 * 
		 * System.out.println("======v3"); System.out.println("isPalindrome : "+
		 * linkedStack.isPalindromeV3("abccba")); System.out.println("isPalindrome : "+
		 * linkedStack.isPalindromeV3("Was it a car or a cat I saw"));
		 * System.out.println("isPalindrome : "+
		 * linkedStack.isPalindromeV3("I did, did I?"));
		 * System.out.println("isPalindrome : "+ linkedStack.isPalindromeV3("hello"));
		 * System.out.println("isPalindrome : "+
		 * linkedStack.isPalindromeV3("Don't nod!"));
		 * System.out.println("isPalindrome : "+
		 * linkedStack.isPalindromeV3("Don't nod")); System.out.println("size: "
		 * +linkedStack.stackSize());
		 */
	}
	
	public static boolean isPalindrome(String word) {
		
		if(word == null || word.isBlank()) {
			return false;
		}
		
		String smallCasedWord = word.toLowerCase();
		LinkedStack stack = new LinkedStack();
		LinkedQueue queue = new LinkedQueue();
		for(int i = 0; i< word.length(); i++) {
			if(smallCasedWord.charAt(i)>= 'a' && smallCasedWord.charAt(i)<= 'z') {
				stack.push(smallCasedWord.charAt(i));
				queue.add(smallCasedWord.charAt(i));
			}
		}
		
	  int len = stack.stackSize() == queue.queueSize()?  stack.stackSize(): -1;
		
		for(int i = 0; i< len; i++) {
			if(stack.pop() != queue.remove() ) {
				return false;
			}
		}
		
		return true;
	}

}
