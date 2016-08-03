package com.dsa.priorityqueue;

import com.dsa.custom.exception.CollectionEmpty;
import com.dsa.custom.exception.CollectionFull;

public class PriorityQueueApp {
	public static void main(String[] args) {
		PriorityQueue priorityQueue = new PriorityQueue(5);
		try {
			System.out.println("Inserting 6 elements");
			priorityQueue.insert(24);
			priorityQueue.insert(41);
			priorityQueue.insert(10);
			priorityQueue.insert(36);
			priorityQueue.insert(68);
			priorityQueue.insert(4);
		} catch (CollectionFull e) {
			e.getMessage();
		}
		priorityQueue.display();
		try {
			System.out.println("Removing 2 elements");
			System.out.println("Removing element: " + priorityQueue.remove());
			System.out.println("Removing element: " + priorityQueue.remove());
		} catch (CollectionEmpty e) {
			e.getMessage();
		}
		priorityQueue.display();
		while (!priorityQueue.isEmpty()) {
			try {
				System.out.println("Removing element: " + priorityQueue.remove());
			} catch (CollectionEmpty e) {
				e.getMessage();
			}
		}
		try {
			System.out.println("Removing element: " + priorityQueue.remove());
		} catch (CollectionEmpty e) {
			e.getMessage();
		}
	}
}
