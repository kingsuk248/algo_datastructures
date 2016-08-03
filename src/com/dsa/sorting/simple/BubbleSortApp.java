package com.dsa.sorting.simple;

public class BubbleSortApp {
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort(10);
		bubbleSort.insert(5);
		bubbleSort.insert(4);
		bubbleSort.insert(3);
		bubbleSort.insert(2);
		bubbleSort.insert(1);
		System.out.println("Before sorting...");
		bubbleSort.display();
		bubbleSort.sort();
		System.out.println("After sorting...");
		bubbleSort.display();
		System.out.println("Total comparisons: " + BubbleSort.totalComparisons);
		System.out.println("Total swaps: " + BubbleSort.totalSwaps);
	}
}
