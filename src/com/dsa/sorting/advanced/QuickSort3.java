package com.dsa.sorting.advanced;

public class QuickSort3 {
	private int[] theArray;
	private int nElems;
	
	public QuickSort3(int size) {
		theArray = new int[size];
	}
	
	public void quickSort() {
		recQuickSort(0, nElems - 1);
	}
	
	public void recQuickSort(int left, int right) {
		int size = right - left + 1;
		if (size < 10) {
			insertionSort(left, right);
		} else {
			int median = median3(left, right);
			int partition = partitionIt(left, right, median);
			recQuickSort(left, partition - 1);
			recQuickSort(partition + 1, right);
		}
	}
	
	public int partitionIt(int left, int right, int pivot) {
		int leftPtr = left;
		int rightPtr = right - 1;
		while(true) {
			while(theArray[++leftPtr] < pivot);
			while(theArray[--rightPtr] > pivot);
			if (leftPtr >= rightPtr) {
				break;
			} else {
				swap(leftPtr, rightPtr);
			}
		}
		swap(leftPtr, right - 1);
		return leftPtr;
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
	
	public void swap(int left, int right) {
		int temp = theArray[left];
		theArray[left] = theArray[right];
		theArray[right] = temp;
	}
	
	public void insertionSort(int left, int right) {
		int in, out;
		for (out = left + 1; out <= right; out++) {
			int temp = theArray[out];
			in = out;
			while (in > left && theArray[in - 1] > temp) {
				theArray[in] = theArray[in - 1];
				--in;
			}
			theArray[in] = temp;
		}
	}
	
	public void insert(int element) {
		theArray[nElems++] = element;
	}
	
	public void display() {
		for (int i = 0; i < nElems; i++)
			System.out.print(theArray[i] + " ");
		System.out.println();
	}
}
