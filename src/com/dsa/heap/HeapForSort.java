package com.dsa.heap;

public class HeapForSort {
	private Node[] heapArray;
	private int currentSize;
	private int maxSize;
	
	public HeapForSort(int size) {
		maxSize = size;
		heapArray = new Node[maxSize];
	}
	
	public Node remove() {
		Node root = heapArray[0];
		heapArray[0] = heapArray[--currentSize];
		trickleDown(0);
		return root;
	}
	
	public void trickleDown(int index) {
		int largerChild;
		Node top = heapArray[index];
		while (index < currentSize/2) {
			int leftChild = 2 * index + 1;
			int rightChild = leftChild + 1;
			
			if (rightChild < currentSize 
					&& heapArray[rightChild].iData > heapArray[leftChild].iData) {
				largerChild = rightChild;
			} else {
				largerChild = leftChild;
			}
			
			if (top.iData > heapArray[largerChild].iData) {
				break;
			}
			heapArray[index].iData = heapArray[largerChild].iData;
			index = largerChild;
		}
		heapArray[index] = top;
	}
	
	public void displayHeap() {
		for (int i = 0; i < currentSize; i++) {
			if (heapArray[i] != null) {
				System.out.print(heapArray[i].iData + " ");
			} else {
				System.out.print("--");
			}
		}
		System.out.println();
		//TODO Display as heap
	}
	
	public void insertAt(int index, Node newNode) {
		heapArray[index] = newNode;
	}
	
	public void incrementSize() {
		currentSize++;
	}
}
