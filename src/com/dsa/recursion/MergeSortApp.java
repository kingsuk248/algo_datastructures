package com.dsa.recursion;

public class MergeSortApp {
	public static void main(String[] args) {
		int size = 5;
		MergeSorter mergeSorter = new MergeSorter(size);
		for (int i = 0; i < size; i++) {
			mergeSorter.insert((int)(Math.random() * 100));
		}
		mergeSorter.display();
		mergeSorter.mergeSort();
		mergeSorter.display();
	}
}
