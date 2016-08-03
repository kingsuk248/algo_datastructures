package com.dsa.sorting.advanced;

public class QuickSortApp {
	public static void main(String[] args) {
		int size = 20;
		QuickSort3 qs = new QuickSort3(size);
		for (int i = 0; i < size; i++) {
			qs.insert((int)(Math.random() * 100));
		}
		qs.display();
		qs.quickSort();
		qs.display();
	}
}
