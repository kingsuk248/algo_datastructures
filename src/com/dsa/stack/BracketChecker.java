package com.dsa.stack;

public class BracketChecker {
	private String input;
	
	public BracketChecker(String input) {
		this.input = input;
	}
	
	public void check() {
		int len = input.length();
		StackY stack = new StackY(len);
		for (int i = 0; i < len; i++) {
			char ch = input.charAt(i);
			switch (ch) {
			case '{':
			case '[':
			case '(':
				stack.push(ch);
				break;
			case '}':
			case ']':
			case ')':
				if (!stack.isEmpty()) {
					char chY = stack.pop();
					if ((ch == '}' && chY != '{')
							&& (ch == ']' && chY != '[')
							&& (ch == ')' && chY != '(')) {
						System.out.println("Error at: " + i + " char: " + ch);
					} 
				} else {
					System.out.println("Error at: " + i + " char: " + ch);
				}
				break;
			default:
				break;
			}
		}
	}
}
