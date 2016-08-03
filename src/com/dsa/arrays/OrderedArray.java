package com.dsa.arrays;

public class OrderedArray {
	private int[] oArray;
	private int nElems;
	
	public OrderedArray(int max) {
		oArray = new int[max];
		nElems = 0;
	}
	
	public void insert(int element) {
		if (oArray.length == nElems) {
			System.out.println("Array is full!");
			return;
		}
		int i;
		for (i = 0; i < nElems; i++) {
			if (oArray[i] > element) {
				break;
			} else if (oArray[i] == element) {
				return;
			}
		}
		for (int j = nElems; j > i; j-- ) {
			oArray[j] = oArray[j-1];
		}
		oArray[i] = element;
		nElems++;
	}
	
	public void delete(int element) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (oArray[i] == element) {
				break;
			}
		}
		if (i == nElems) { // Element not found
			return;
		}
		for (int j = i + 1; j < nElems; j++) {
			oArray[j - 1] = oArray[j];
		}
		nElems--;
	}
	
	public int find(int element) {
		int lowerbound = 0;
		int upperbound = nElems - 1;
		while (true) {
			int currInd = (lowerbound + upperbound) / 2;
			if (oArray[currInd] == element) {
				return currInd;
			} else if (oArray[currInd] > element) {
				upperbound = currInd - 1;
			} else if (oArray[currInd] < element) {
				lowerbound = currInd + 1;
			} 
			if (lowerbound > upperbound) {
				return nElems;
			}
		}
	}
	
	public int getNElems() {
		return nElems;
	}
	
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println("Element at index [" + i + "] is : " + oArray[i]);
		}
		System.out.println();
	}
}
