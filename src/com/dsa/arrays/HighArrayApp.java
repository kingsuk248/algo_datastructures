package com.dsa.arrays;

public class HighArrayApp {
	public static void main(String[] args) {
		HighArray highArray = new HighArray(10);
		
		highArray.display();
		for(int i = 0; i < 10; i++) {
			highArray.insert((int) (Math.random() * 10));
		}
		highArray.display();
		
		int elem = 5;
		boolean isElementFound = highArray.find(elem);
		if(isElementFound) {
			System.out.println("Element " + elem + " is found");
		} else {
			System.out.println("Element " + elem + " is not found");
		}
		if(isElementFound) {
			highArray.delete(elem);
		}
		highArray.display();
	}
}
