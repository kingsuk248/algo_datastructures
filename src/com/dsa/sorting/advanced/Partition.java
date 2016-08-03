package com.dsa.sorting.advanced;

public class Partition {
	private int[] theArray;
	private int nElems;
	
	public Partition(int size) {
		theArray = new int[size];
	}
	
	public void insert(int element) {
		theArray[nElems++] = element;
	}
	
	public void partitionIt(int left, int right, int pivot) {
		int leftPtr = left - 1;
		int rightPtr = right + 1;
		while(true) {
			while (leftPtr < right && theArray[++leftPtr] < pivot);
			while (rightPtr > left && theArray[--rightPtr] > pivot);
			if (leftPtr >= rightPtr)
				break;
			else {
				swap(leftPtr, rightPtr);
			}
		}
		
	}
	
	public void swap(int i, int j) {
		int temp = theArray[i];
		theArray[i] = theArray[j];
		theArray[j] = temp;
	}
	
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
	}
}
