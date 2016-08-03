package com.dsa.recursion;

import com.dsa.util.methods.Utility;

public class TriangleApp {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int number = Utility.getInt();
		int result = getTriangle(number);
		System.out.println("Triangle: " + result);
	}
	
	public static int getTriangle(int n) {
		System.out.println("n is now: " + n);
		if (n == 1) {
			return n;
		} else {
			int temp = n + getTriangle(n - 1);
			System.out.println("Temp value: " + temp);
			return temp;
		}
	}
}
