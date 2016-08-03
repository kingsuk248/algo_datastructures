package com.dsa.sorting.simple;

public class InsertionSort {
	private int[] integers;
	private int numElems;
	private int size;
	public static int noOfComparisons;
	public static int noOfSwaps;
	
	public InsertionSort(int max) {
		integers = new int[max];
		size = max;
	}
	
	public void insert(int element) {
		if (numElems < size) {
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
		for (int outer = 1; outer < numElems; outer++) {
			int temp = integers[outer];
			int inner = outer;
			for (inner = outer; inner > 0 && integers[inner - 1] > temp; inner--) {
				integers[inner] = integers[inner - 1];
			}
			integers[inner] = temp;
		}
	}
}
