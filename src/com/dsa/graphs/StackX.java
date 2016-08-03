package com.dsa.graphs;

public class StackX {
	private final int SIZE = 20;
	private int top;
	private int[] stackArray;
	
	public StackX() {
		stackArray = new int[SIZE];
		top = -1;
	}
	
	public void push(int i) {
		stackArray[++top] = i;
	}
	
	public int pop() {
		return stackArray[top--];
	}
	
	public int peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == SIZE - 1);
	}
}
