package com.dsa.heap;

import com.dsa.util.methods.Utility;

public class HeapSortApp {
	public static void main(String[] args) {
		int size, j;
		System.out.println("Enter number of items:");
		size = Utility.getInt();
		HeapForSort hfs = new HeapForSort(size);
		for (j = 0; j < size; j++) {
			int random = (int) (Math.random() * 100);
			Node newNode = new Node(random);
			hfs.insertAt(j, newNode);
			hfs.incrementSize();
		}
		System.out.print("Random: ");
		hfs.displayHeap();
		
		for (j = size/2 - 1; j >= 0; j--) {
			hfs.trickleDown(j);
		}
		System.out.print("Display array: ");
		hfs.displayHeap();
		for (j = size - 1; j >= 0; j--) {
			Node biggestNode = hfs.remove();
			hfs.insertAt(j, biggestNode);
		}
		System.out.print("Sorted");
		hfs.displayHeap();
	}
}
