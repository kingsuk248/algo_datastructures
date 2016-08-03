package com.dsa.sorting.advanced;

public class QuickSort2 {
	private int[] theArray;
	private int nElems;
	
	public QuickSort2(int size) {
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
		int size = right - left + 1;
		if (size <= 3) {
			manualSort(size, left, right);
		} else {
			int pivot = median3(left, right);
			int partition = partitionIt(left, right, pivot);
			recQuickSort(left, partition - 1);
			recQuickSort(partition + 1, right);
		}
	}
	
	public int median3(int left, int right) {
		int center = (left + right) / 2;
		if (theArray[left] > theArray[center]) {
			swap(left, center);
		}
		if (theArray[left] > theArray[right]) {
			swap(left, right);
		}
		if (theArray[center] > theArray[right]) {
			swap(center, right);
		}
		swap(center, right - 1);
		return theArray[right - 1];
	}
	
	public int partitionIt(int left, int right, int pivot) {
		int leftPtr = left;
		int rightPtr = right - 1;
		while (true) {
			while (theArray[++leftPtr] < pivot);
			while (theArray[--rightPtr] > pivot);
			if (leftPtr >= rightPtr) {
				break;
			} else {
				swap(leftPtr, rightPtr);
			}
		}
		swap(leftPtr, right - 1);
		return leftPtr;
	}
	
	public void manualSort(int size, int left, int right) {
		if (size == 1) {
			return;
		} else if (size == 2) {
			if (theArray[left] > theArray[right]) {
				swap(left, right);
			}
		} else if (size == 3) {
			if (theArray[left] > theArray[right - 1]) {
				swap(left, right - 1);
			}
			if (theArray[left] > theArray[right]) {
				swap(left, right);
			}
			if (theArray[right - 1] > theArray[right]) {
				swap(right - 1, right);
			}
		}
	}
	
	public void swap(int i, int j) {
		int temp = theArray[i];
		theArray[i] = theArray[j];
		theArray[j] = temp;
	}
}
