package com.dsa.stack;

public class ParsePost {
	private String input;
	private StackX stack;
	
	public ParsePost(String input) {
		this.input = input;
		stack = new StackX(10);
	}
	
	public int doParse() {
		int result = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch >= '0' && ch <= '9') {
				stack.push((int)(ch - '0'));
			} else {
				int num1 = (int)(stack.pop());
				int num2 = (int)(stack.pop());
				switch(ch) {
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num2 - num1;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					result = num2 / num1;
					break;
				default:
					result = 0;
				}
				stack.push(result);
			}
		}
		result = (int)stack.pop();
		return result;
	}
}
