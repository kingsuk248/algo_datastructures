package com.dsa.sorting.simple;

public class SelectionSortApp {
	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort(10);
		selectionSort.insert(35);
		selectionSort.insert(445);
		selectionSort.insert(23);
		selectionSort.insert(1452);
		selectionSort.insert(115);
		System.out.println("Before sorting...");
		selectionSort.display();
		selectionSort.sort();
		System.out.println("After sorting...");
		selectionSort.display();
		System.out.println("Total comparisons: " + SelectionSort.noOfComparisons);
		System.out.println("Total swaps: " + SelectionSort.noOfSwaps);
	}
}
