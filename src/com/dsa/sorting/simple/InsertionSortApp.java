package com.dsa.sorting.simple;

public class InsertionSortApp {
	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort(10);
		insertionSort.insert(15);
		insertionSort.insert(44);
		insertionSort.insert(314);
		insertionSort.insert(26);
		insertionSort.insert(1);
		System.out.println("Before sorting...");
		insertionSort.display();
		insertionSort.sort();
		System.out.println("After sorting...");
		insertionSort.display();
		System.out.println("Total comparisons: " + InsertionSort.noOfComparisons);
		System.out.println("Total swaps: " + InsertionSort.noOfSwaps);
	}
}
