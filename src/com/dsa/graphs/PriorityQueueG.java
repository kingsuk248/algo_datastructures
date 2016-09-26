package com.dsa.graphs;

public class PriorityQueueG {
	private final int SIZE = 20;
	private Edge[] edgeArray;
	private int size;
	
	public PriorityQueueG() {
		edgeArray = new Edge[SIZE];
	}
	
	public void insert(Edge edge) {
		int i;
		for (i = 0; i < size; i++) {
			if (edge.distance > edgeArray[i].distance)
				break;
		}
		for (int j = size-1; j >= i; j--) {
			edgeArray[j+1] = edgeArray[j];
		}
		edgeArray[i] = edge;
		size++;
	}
	
	public Edge removeMin() {
		return edgeArray[--size];
	}
	
	public Edge removeN(int n) {
		for (int i=n; i < size-1; i++) {
			edgeArray[i] = edgeArray[i+1];
		}
		size--;
		return edgeArray[n];
	}
	
	public Edge peekMin() {
		return edgeArray[size - 1];
	}
	
	public Edge peekN(int n) {
		return edgeArray[n];
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int find(int destVertex) {
		for (int i = 0; i < size; i++) {
			if (edgeArray[i].destVertex == destVertex) {
				return i;
			}
		}
		return -1;
	}
	
	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.print(edgeArray[i].distance + " ");
		}
	}
}
