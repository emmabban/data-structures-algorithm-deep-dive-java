package io.justice.datastructure.linkedliststackpalindrome;

public class LinkedListApplication {

	public static void main(String[] args) {

		LinkedStack linkedStack = new LinkedStack();
		System.out.println("size: " +linkedStack.stackSize());
		System.out.println(linkedStack.peek());
		System.out.println(linkedStack.pop());
		linkedStack.printStack();
		System.out.println("isPalindrome : "+ linkedStack.isPalindrome("I did,\"madam\" did I?"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindrome("racecar"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindrome("Racecar"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindrome("hello"));
		System.out.println("======v2");
		
		System.out.println("isPalindrome : "+ linkedStack.isPalindromeV2("I did,\"madam\" did I?"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindromeV2("racecar"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindromeV2("Racecar"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindromeV2("hello"));
		
		System.out.println("======v3");
		
		System.out.println("isPalindrome : "+ linkedStack.isPalindromeV3("I did,\"madam\" did I?"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindromeV3("racecar"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindromeV3("Racecar"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindromeV3("hello"));
		System.out.println("======");
		System.out.println("isPalindrome : "+ linkedStack.isPalindrome("abccba"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindrome("Was it a car or a cat I saw"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindrome("I did, did I?"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindrome("hello"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindrome("Don't nod!"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindrome("Don't nod"));
		System.out.println("======v2");
		System.out.println("isPalindrome : "+ linkedStack.isPalindromeV2("abccba"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindromeV2("Was it a car or a cat I saw"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindromeV2("I did, did I?"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindromeV2("hello"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindromeV2("Don't nod!"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindromeV2("Don't nod"));
		
		System.out.println("======v3");
		System.out.println("isPalindrome : "+ linkedStack.isPalindromeV3("abccba"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindromeV3("Was it a car or a cat I saw"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindromeV3("I did, did I?"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindromeV3("hello"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindromeV3("Don't nod!"));
		System.out.println("isPalindrome : "+ linkedStack.isPalindromeV3("Don't nod"));
		System.out.println("size: " +linkedStack.stackSize());

	}

}
