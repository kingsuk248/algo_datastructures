package com.dsa.recursion;

public class StackX {
	private Params[] params;
	private int top;
	
	public StackX(int s) {
		params = new Params[s];
		top = -1;
	}
	
	public void push(Params param) {
		params[++top] = param;
	}
	
	public Params pop() {
		return params[top--];
	}
	
	public Params peek() {
		return params[top];
	}
}
