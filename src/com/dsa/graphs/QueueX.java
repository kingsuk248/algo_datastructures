package com.dsa.graphs;

public class QueueX {
	private final int SIZE = 20;
	private int[] queueArray;
	private int front;
	private int rear;
	
	public QueueX() {
		queueArray = new int[SIZE];
		front = 0;
		rear = -1;
	}
	
	public void insert(int element) {
		if (rear == SIZE - 1) {
			rear = -1;
		}
		queueArray[++rear] = element;
	}
	
	public int remove() {
		int temp = queueArray[front++];
		if (front == SIZE) {
			front = 0;
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return (front == rear + 1) || (front + SIZE == rear + 1);
	}
}
