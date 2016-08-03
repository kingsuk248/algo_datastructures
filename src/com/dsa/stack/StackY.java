package com.dsa.stack;

public class StackY {
	private char[] stackArray;
	private int top;
	
	public StackY(int size) {
		stackArray = new char[size];
		top = -1;
	}
	
	public void push(char c) {
		stackArray[++top] = c;
	}
	
	public char pop() {
		return stackArray[top--];
	}
	
	public char peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public int size() {
		return top + 1;
	}
	
	public char peekN(int n) {
		return stackArray[n];
	}
	
	public void displayStack(String s) {
		System.out.println();
		System.out.print(s);
		System.out.print("Stack bottom --> top ");
		for (int i = 0; i < size(); i++) {
			System.out.print(peekN(i) + " ");
		}
	}
	
}
