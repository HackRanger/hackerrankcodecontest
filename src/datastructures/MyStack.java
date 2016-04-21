package datastructures;

import java.util.Scanner;
import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack();
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			myStack.push(scanner.nextInt());
		}
		System.out.println("Showing all the stack content");
		while (!myStack.isEmpty()) {
			System.out.println(myStack.pop());

		}
	}
}
