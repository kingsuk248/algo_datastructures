package com.dsa.sorting.advanced;

public class ShellSortApp {
	public static void main(String[] args) {
		int size = 20;
		ShellSort shellSort = new ShellSort(size);
		for (int i = 0; i < size; i++) {
			shellSort.insert((int)(Math.random() * 100));
		}
		System.out.println("Before sorting...");
		shellSort.display();
		shellSort.sort();
		System.out.println("After sorting...");
		shellSort.display();
	}
}
