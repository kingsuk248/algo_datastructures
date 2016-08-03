package com.dsa.sorting.simple;

public class SelectionSort {
	private int[] integers;
	private int numElems;
	private int maxElems;
	public static int noOfComparisons;
	public static int noOfSwaps;
	
	public SelectionSort(int max) {
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
		for (int outer = 0; outer < numElems-1; outer++) {
			int min = outer;
			for (int inner = outer+1; inner < numElems; inner++) {
				if (integers[inner] < integers[min]) {
					noOfComparisons++;
					min = inner;
				}
			}
			noOfSwaps++;
			swap(min, outer);
		}
	}
	
	private void swap(int x, int y) {
		int temp = integers[y];
		integers[y] = integers[x];
		integers[x] = temp;
	}
}
