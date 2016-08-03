package com.dsa.recursion;

public class MergeSorter {
	private int[] mArray;
	private int nElems;
	
	public MergeSorter(int size) {
		mArray = new int[size];
		nElems = 0;
	}
	
	public void insert(int element) {
		mArray[nElems++] = element;
	}
	
	public void mergeSort() {
		int[] workSpace = new int[nElems];
		recMergeSort(workSpace, 0, nElems - 1);
	}
	
	public void display() {
		for (int i = 0; i < mArray.length; i++)
			System.out.print(mArray[i] + " ");
		System.out.println();
	}
	
	public void recMergeSort(int[] workSpace, int lowerbound, int upperbound) {
		System.out.println("Entering " + lowerbound + "-" + upperbound);
		if (lowerbound == upperbound) {
			System.out.println("Base case return " + lowerbound + "-" + upperbound);
			return;
		} else {
			int mid = (lowerbound + upperbound) / 2;
			System.out.println("Will sort lowerhalf of " + lowerbound + "-" + mid);
			recMergeSort(workSpace, lowerbound, mid);
			System.out.println("Will sort upperhalf of " + (mid + 1) + "-" + upperbound);
			recMergeSort(workSpace, mid + 1, upperbound);
			merge(workSpace, lowerbound, mid + 1, upperbound);
		}
	}
	
	public void merge(int[] workSpace, int lowerPtr, int upperPtr, int upperbound) {
		System.out.print("Array pre-merge state: ");
		display();
		System.out.println("Merging from " + lowerPtr + "-" + (upperPtr -1) + " and " + upperPtr + "-" + upperbound);
		int nWs = 0;
		int mid = upperPtr - 1;
		int lowerbound = lowerPtr;
		int n = upperbound - lowerbound + 1;
		while (lowerPtr <= mid && upperPtr <= upperbound) {
			if (mArray[lowerPtr] < mArray[upperPtr]) {
				workSpace[nWs++] = mArray[lowerPtr++];
			} else {
				workSpace[nWs++] = mArray[upperPtr++];
			}
		}
		while (lowerPtr <= mid) {
			workSpace[nWs++] = mArray[lowerPtr++];
		}
		while (upperPtr <= upperbound) {
			workSpace[nWs++] = mArray[upperPtr++];
		}
		for (int i = 0; i < n; i++) {
			mArray[lowerbound + i] = workSpace[i];
		}
	}
}
