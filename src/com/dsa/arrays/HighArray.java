package com.dsa.arrays;

public class HighArray {
	private long[] arr;
	private int nElems;

	public HighArray(int size) {
		arr = new long[size];
		nElems = 0;
	}

	public boolean insert(int elem) {
		boolean isInserted = true;
		if (nElems == arr.length) {
			isInserted = false;
		} else {
			arr[nElems++] = elem;
		}
		return isInserted;
	}

	public boolean delete(int elem) {
		boolean isDeleted = true;
		int i;
		for (i = 0; i < nElems; i++) {
			if (arr[i] == elem) {
				break;
			}			
		}
		if (i == nElems) {
			return false;
		} else {
			nElems--;
			for (int j = i; j < nElems; j++) {
				arr[j] = arr[j + 1];
			}
		}		
		
		delete(elem); //Recursive call to clean up all occurrences of the element
		return isDeleted;
	}

	public boolean find(int elem) {
		boolean isFound = true;
		int i;
		for (i = 0 ; i < nElems; i++) {
			if (arr[i] == elem) {
				break;
			}
		}
		if (i == nElems) {
			isFound = false;
		}
		return isFound;
	}

	public void display() {
		if (nElems == 0) {
			System.out.println("Empty array collection!");
		} else {
			for (int i = 0; i < nElems; i++) {
				System.out.print(arr[i] + " ");				
			}
			System.out.println();
		}
	}
}
