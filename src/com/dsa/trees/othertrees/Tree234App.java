package com.dsa.trees.othertrees;

import com.dsa.util.methods.Utility;

public class Tree234App {
	public static void main(String[] args) {
		Tree234 tree = new Tree234();
		tree.insert(24);
		tree.insert(45);
		tree.insert(32);
		tree.insert(11);
		tree.insert(66);
		tree.insert(78);
		while(true) {
			System.out.println("Enter your choice...s(show), f(find), i(insert)");
			char ch = Utility.getChar();
			switch(ch) {
			case 's':
				tree.displayTree();
				break;
			case 'f':
				System.out.println("Enter key to find:");
				int key = Utility.getInt();
				int i = tree.find(key);
				if (i == -1) {
					System.out.println("Key not found...");
				} else {
					System.out.println("Key found...");
				}
				break;
			case 'i':
				System.out.println("Enter key to insert:");
				int ikey = Utility.getInt();
				tree.insert(ikey);
				break;
				default :
					System.out.println("Invalid choice");
			}
		}
	}
}
