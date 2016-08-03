package com.dsa.priorityqueue;

import com.dsa.custom.exception.CollectionEmpty;
import com.dsa.custom.exception.CollectionFull;

public class PriorityQueue {
	private int[] pqArray;
	private int nElems;
	private int maxSize;
	
	public PriorityQueue(int s) {
		maxSize = s;
		pqArray = new int[s];
		nElems = 0;
	}
	
	public void insert(int element) throws CollectionFull {
		if (nElems == maxSize) {
			throw new CollectionFull(this);
		}
		if (isEmpty()) {
			pqArray[0] = element;
		} else {
			int j;
			for (j = nElems - 1; j >= 0; j--) {
				if (pqArray[j] < element) {
					pqArray[j+1] = pqArray[j];
				} else {
					break;
				}
			}
			pqArray[j+1] = element;
		}
		nElems++;
	}
	
	public int remove() throws CollectionEmpty {
		if (isEmpty()) {
			throw new CollectionEmpty(this);
		}
		return pqArray[--nElems];
	}
	
	public int peek() {
		return pqArray[nElems-1];
	}
	
	public boolean isEmpty() {
		return nElems == 0;
	}
	
	public boolean isFull() {
		return nElems == maxSize;
	}
	
	public void display() {
		System.out.print("Elements: ");
		for (int i = nElems-1; i >= 0; i--) {
			System.out.print(pqArray[i] + " ");
		}
		System.out.println();
	}
}
