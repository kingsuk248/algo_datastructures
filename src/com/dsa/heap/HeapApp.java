package com.dsa.heap;

import com.dsa.util.methods.Utility;

public class HeapApp {
	public static void main(String[] args) {
		Heap heap = new Heap(31);
		int size = 10;
		for (int i = 0; i < size; i++) {
			int random = (int) (Math.random() * 100);
			heap.insert(random);
		}
		while (true) {
			System.out.println("Enter s:show, i:insert, r:remove, c:change");
			int ch = Utility.getChar();
			switch(ch) {
			case 's':
				heap.displayHeap();
				break;
			case 'i':
				System.out.println("Enter item to insert...");
				heap.insert(Utility.getInt());
				break;
			case 'r':
				if (heap.isEmpty()) {
					System.out.println("Heap is empty !...");
				} else {
					heap.remove();
				}
				break;
			case 'c':
				System.out.println("Enter item to find...");
				int index = Utility.getInt();
				int newValue = Utility.getInt();
				heap.change(index, newValue);
				break;
			default:
				System.out.println("Not a valid choice...");
			}
		}
	}
}
