package com.dsa.stack;

public class StackX {
	private int top; 
	private double stackArray[];
	
	public StackX(int maxElems) {
		stackArray = new double[maxElems];
		top = -1;
	}
	
	public double push(double element) {
		if (isFull()) {
			System.out.println("Stack is Full!! Can't push");
		} else {
			stackArray[++top] = element;
		}
		return element;
	}
	
	public double pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty!! Can't pop");
		} else {
			return stackArray[top--];
		}
		return 0;
	}
	
	public double peek() {
		if (isEmpty()) {
			System.out.println("Stack is Empty!! Can't peek");
		} else {
			return stackArray[top];
		}
		return 0;
	}
	
	public boolean isFull() {
		return top == stackArray.length - 1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
}
