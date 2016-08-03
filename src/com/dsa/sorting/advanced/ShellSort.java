package com.dsa.sorting.advanced;

public class ShellSort {
	private int nElems;
	private int[] theArray;
	
	public ShellSort(int s) {
		theArray = new int[s];
	}
	
	public void insert(int element) {
		theArray[nElems++] = element;
	}
	
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
	}
	
	public void sort() {
		int outer, inner;
		int h = 1;
		while (h <= nElems/3) {
			h = (h * 3) + 1;
		}
		
		while (h > 0) {
			for (outer = h; outer < nElems; outer++) {
				int temp = theArray[outer];
				inner = outer;
				while (inner > h - 1 && theArray[inner - h] > temp) {
					theArray[inner] = theArray[inner - h];
					inner -= h;
				}
				theArray[inner] = temp;
			}
			h = (h-1) / 3;
		}
	}
}
