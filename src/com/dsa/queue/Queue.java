package com.dsa.queue;

import com.dsa.custom.exception.CollectionFull;
import com.dsa.custom.exception.CollectionEmpty;

public class Queue {
	private int[] queueArray;
	private int front;
	private int rear;
	private int maxSize;
	private int nElems;
	
	public Queue(int s) {
		maxSize = s; 
		queueArray = new int[s];
		nElems = 0;
		front = 0;
		rear = -1;
	}
	
	public void insert(int element) throws CollectionFull {
		if (nElems == maxSize) {
			throw new CollectionFull(this);
		}
		if (rear == maxSize - 1) {
			rear = -1;
		}
		queueArray[++rear] = element;
		nElems++;
	}
	
	public int remove() throws CollectionEmpty {
		if (nElems == 0) {
			throw new CollectionEmpty(this);
		}
		int temp = queueArray[front++];
		if (front == maxSize) {
			front = 0;
		}
		nElems--;
		return temp;
	}
	
	public int peek() {
		return queueArray[front];
	}
	
	public boolean isEmpty() {
		return nElems == 0;
	}
	
	public boolean isFull() {
		return nElems == maxSize;
	}
	
	public int size() {
		return nElems;
	}
	
	public void display() {
		int j = front;
		for (int i = 0; i < nElems; i++) {
			if (j == maxSize) {
				j = 0;
			}
			System.out.println("Elements: " + queueArray[j++]);
		}
	}
}
