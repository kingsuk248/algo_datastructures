package com.dsa.queue;

import com.dsa.custom.exception.CollectionFull;
import com.dsa.custom.exception.CollectionEmpty;

public class QueueApp {
	public static void main(String[] args) throws CollectionFull {
		Queue queue = new Queue(5);
		try {
			queue.insert(56);
			queue.insert(8);
			queue.insert(332);
			queue.insert(48);
			queue.insert(25);
			queue.insert(112);
		} catch (CollectionFull ex) {
			ex.getMessage();
		}
		queue.display();
		try {
			System.out.println("Removed element: " + queue.remove());
			System.out.println("Removed element: " + queue.remove());
			System.out.println("Removed element: " + queue.remove());
		} catch (CollectionEmpty ex) {
			ex.getMessage();
		}
		try {
			queue.insert(15);
			queue.insert(128);
		} catch (CollectionFull ex) {
			ex.getMessage();
		}
		queue.display();
		
	}
}
