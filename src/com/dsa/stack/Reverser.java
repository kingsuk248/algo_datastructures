package com.dsa.stack;

public class Reverser {
	private String input;
	
	public Reverser(String input) {
		this.input = input;
	}
	
	public String doReversing() {
		int inputLength = input.length();
		StackY stack = new StackY(inputLength);
		for (int i = 0; i < inputLength; i++) {
			stack.push(input.charAt(i));
		}
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < inputLength; i++) {
			buffer.append(stack.pop());
		}
		return buffer.toString();
	}
}
