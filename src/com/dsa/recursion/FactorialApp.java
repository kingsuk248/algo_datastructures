package com.dsa.recursion;

import com.dsa.util.methods.Utility;

public class FactorialApp {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		int factorial = getFactorial(Utility.getInt());
		System.out.println("Factorial: " + factorial );
	}
	
	public static int getFactorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * getFactorial(n - 1);
		}
	}
}
