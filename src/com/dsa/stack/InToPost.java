package com.dsa.stack;

public class InToPost {
	private String input;
	private String output;
	private StackY stack;
	
	public InToPost(String in) {
		output = "";
		input = in;
		stack = new StackY(in.length());
	}
	
	public String doTranslation() {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			stack.displayStack("For: " + ch + " ");
			switch(ch) {
			case '+':
			case '-':
				getOperator(ch, 1);
				break;
			case '*':
			case '/':
				getOperator(ch, 2);
				break;
			case '(':
				stack.push(ch);
				break;
			case ')':
				popEnclosingOperators(ch);
				break;
			default:
				output = output + ch;
			}
			System.out.println(" Output: " + output);
		}
		while (!stack.isEmpty()) {
			stack.displayStack("While ");
			output = output + stack.pop();
		}
		stack.displayStack("End ");
		return output;
	}
	
	public void getOperator(char optThis, int precThis) {
		while (!stack.isEmpty()) {
			char optTop = stack.pop();
			if (optTop == '(') {
				stack.push(optTop);
				break;
			} else {
				int precTop;
				if (optTop == '+' || optTop == '-') {
					precTop = 1;
				} else {
					precTop = 2;
				}
				if (precTop < precThis) {
					stack.push(optTop);
					break;
				} else {
					output = output + optTop; 
				}
			}
		}
		stack.push(optThis);
	}
	
	public void popEnclosingOperators(char ch) {
		while (!stack.isEmpty()) {
			char chx = stack.pop();
			if (chx == '(') {
				break;
			} else {
				output = output + chx;
			}
		}
	}
}
