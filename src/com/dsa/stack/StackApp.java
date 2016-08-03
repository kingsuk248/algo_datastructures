package com.dsa.stack;

public class StackApp {
	public static void main(String[] args) {
		StackX stack = new StackX(10);
		for (int i = 0; i < 10; i++) {
			int elem = (int)(Math.random() * 100);
			System.out.println("Pushing: " + elem);
			stack.push(elem);
		}
		stack.push(50);
		System.out.println("Peeking and received: " + stack.peek());
		while (!stack.isEmpty()) {
			System.out.println("Popped: " + (int)stack.pop());
		}
		stack.pop();
	}
}
