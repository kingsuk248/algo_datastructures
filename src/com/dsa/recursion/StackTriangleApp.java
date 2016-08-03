package com.dsa.recursion;

import com.dsa.util.methods.Utility;

public class StackTriangleApp {
	private static int theAnswer;
	private static int theNumber;
	private static int codePart;
	private static StackX theStack;
	private static Params theseParams;
	
	public static void main(String[] args) {
		System.out.println("Enter a number");
		theNumber = Utility.getInt();
		recTriangle();
		System.out.println("Triangle: " + theAnswer);
	}
	
	public static void recTriangle() {
		theStack = new StackX(50);
		codePart = 1;
		while (step() == false) {
		}
	}
	
	public static boolean step() {
		switch (codePart) {
		case 1:
			theseParams = new Params(theNumber, 6);
			theStack.push(theseParams);
			codePart = 2;
			break;
		case 2:
			theseParams = theStack.peek();
			if (theseParams.n == 1) {
				codePart = 5;
				theAnswer = 1;
			} else {
				codePart = 3;
			}
			break;
		case 3:
			Params params = new Params(theseParams.n - 1 , 4);
			theStack.push(params);
			codePart = 2;
			break;
		case 4:
			theseParams = theStack.peek();
			theAnswer = theAnswer + theseParams.n;
			codePart = 5;
			break;
		case 5:
			theseParams = theStack.peek();
			codePart = theseParams.returnAddress;
			theStack.pop();
			break;
		case 6:
			return true;
		}
		return false;
	}
}
