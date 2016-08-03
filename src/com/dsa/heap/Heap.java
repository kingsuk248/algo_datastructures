package com.dsa.heap;

public class Heap {
	private Node[] heapArray;;
	private int maxSize;
	private int currentSize;
	
	public Heap(int ms) {
		heapArray = new Node[ms];
		maxSize = ms;
	}
	
	public boolean isEmpty() {
		return currentSize == 0;
	}
	
	public boolean insert(int element) {
		if (currentSize == maxSize) {
			return false;
		}
		Node newNode = new Node(element);
		heapArray[currentSize] = newNode;
		trickleUp(currentSize++);
		return true;
	}
	
	public Node remove() {
		Node root = heapArray[0];
		heapArray[0] = heapArray[--currentSize];
		trickleDown(0);
		return root;
	}
	
	public void trickleUp(int index) {
		int parent = (index - 1) / 2;
		Node bottom = heapArray[index];
		while (index > 0 && heapArray[parent].iData < bottom.iData) {
			heapArray[index] = heapArray[parent];
			index = parent;
			parent = (parent - 1) / 2;
		}
		heapArray[index] = bottom;
	}
	
	public void trickleDown(int index) {
		int largerChild;
		Node top = heapArray[index];
		while (index < currentSize / 2) {
			int leftChild = index * 2 + 1;
			int rightChild = leftChild + 1;
			if (rightChild < currentSize 
					&& heapArray[rightChild].iData > heapArray[leftChild].iData) {
				largerChild = rightChild;
			} else {
				largerChild = leftChild;
			}
			if (top.iData >= heapArray[largerChild].iData) {
				break;
			}
			heapArray[index] = heapArray[largerChild];
			index = largerChild;
		}
		heapArray[index] = top;
	}
	
	public boolean change(int index, int newValue) {
		if (index < 0 || index >= currentSize) {
			return false;
		}
		int oldValue = heapArray[index].iData;
		heapArray[index].iData = newValue;
		if (oldValue < newValue) {
			trickleUp(index);
		} else {
			trickleDown(index);
		}
		return true;
	}
	
	public void displayHeap() {
		System.out.println("Heap Array...");
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
}
