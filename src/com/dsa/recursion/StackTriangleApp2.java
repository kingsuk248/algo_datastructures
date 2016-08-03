package com.dsa.recursion;

import com.dsa.util.methods.Utility;
import com.dsa.stack.StackX;

public class StackTriangleApp2 {
	public static int input;
	public static void main(String[] args) {
		System.out.println("Enter a number");
		input = Utility.getInt();
		System.out.println("Triangle: " + getTriangle());
	}
	
	public static int getTriangle() {
		StackX theStack = new StackX(50);
		int theAnswer = 0;
		while (input > 0) {
			theStack.push(input--);
		}
		while (!theStack.isEmpty()) {
			theAnswer = theAnswer + (int)theStack.pop();
		}
		return theAnswer;
	}
}
