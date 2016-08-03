package com.dsa.sorting.simple;

public class BubbleSort {
	private int[] integers;
	private int numElems;
	private int maxElems;
	public static int totalComparisons;
	public static int totalSwaps;
	
	public BubbleSort(int max) {
		integers = new int[max];
		maxElems = max;
	}
	
	public void insert(int element) {
		if (numElems < maxElems) {
			integers[numElems++] = element; 
		} else {
			System.out.println("Array Full !!!");
		}
	}
	
	public void display() {
		for (int i = 0; i < numElems; i++) {
			System.out.println("Element at index " + i + " :" + integers[i]);
		}
	}
	
	public void sort() {
		int outer;
		for (outer = numElems - 1; outer > 1; outer--) {
			for (int inner = 0 ; inner < outer; inner++) {
				totalComparisons++;
				if (integers[inner] > integers[inner+1]) {
					totalSwaps++;
					swap(inner, inner+1);
				}
			}
		}
	}
	
	private void swap(int x, int y) {
		int temp = integers[y];
		integers[y] = integers[x];
		integers[x] = temp;
	}
}

