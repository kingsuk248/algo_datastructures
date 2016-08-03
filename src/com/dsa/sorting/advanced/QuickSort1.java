package com.dsa.sorting.advanced;

public class QuickSort1 {
	private int[] theArray;
	private int nElems;
	
	public QuickSort1(int size) {
		theArray = new int[size];
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
	
	public void quickSort() {
		recQuickSort(0, nElems - 1);
	}
	
	public void recQuickSort(int left, int right) {
		if (right - left <= 0) {
			return;
		} else {
			int pivot = theArray[right];
			int partition = partitionIt(left, right, pivot);
			recQuickSort(left, partition - 1);
			recQuickSort(partition, right);
		}
	}
	
	public int partitionIt(int left, int right, int pivot) {
		int leftPtr = left - 1;
		int rightPtr = right;
		while (true) {
			while (theArray[++leftPtr] < pivot);
			while (theArray[--rightPtr] > pivot && rightPtr > 0);
			if (leftPtr >= rightPtr) {
				break;
			} else {
				swap(leftPtr, rightPtr);
			}
		}
		swap(leftPtr, right);
		return leftPtr;
	}
	
	public void swap(int i, int j) {
		int temp = theArray[i];
		theArray[i] = theArray[j];
		theArray[j] = temp;
	}
}
