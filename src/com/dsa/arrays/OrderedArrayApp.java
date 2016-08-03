package com.dsa.arrays;

public class OrderedArrayApp {
	public static void main(String[] args) {
		OrderedArray orderedArray = new OrderedArray(10);
		System.out.println("Initialize...");
		initialize(orderedArray);
		orderedArray.display();
		System.out.println("Insert..." + 3);
		orderedArray.insert(3);
		orderedArray.display();
		System.out.println("Insert..." + 9);
		orderedArray.insert(9);
		orderedArray.display();
		System.out.println("Delete..." + 9);
		orderedArray.delete(9);
		orderedArray.display();
		System.out.println("Find..." + 6);
		int findIndex = orderedArray.find(6);
		if (findIndex == orderedArray.getNElems()) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index: " + findIndex);
		}
	}

	private static void initialize(OrderedArray orderedArray) {
		orderedArray.insert(1);
		orderedArray.insert(2);
		orderedArray.insert(4);
		orderedArray.insert(5);
		orderedArray.insert(6);
		orderedArray.insert(7);
		orderedArray.insert(8);
	}
}
