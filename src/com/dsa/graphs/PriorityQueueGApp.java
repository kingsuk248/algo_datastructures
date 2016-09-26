package com.dsa.graphs;

public class PriorityQueueGApp {
	public static void main(String[] args) {
		PriorityQueueG queue = new PriorityQueueG();
		queue.insert(new Edge(0, 1, 5));
		queue.insert(new Edge(2, 3, 8));
		queue.insert(new Edge(1, 2, 6));
		queue.insert(new Edge(3, 4, 10));
		queue.insert(new Edge(4, 1, 4));
		queue.display();
	}
}
