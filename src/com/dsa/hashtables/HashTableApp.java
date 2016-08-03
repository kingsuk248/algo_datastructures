package com.dsa.hashtables;

import com.dsa.util.methods.Utility;

public class HashTableApp {
	public static void main(String[] args) {
		System.out.println("Enter size of hashTable to be created:");
		int size = Utility.getInt();
		HashTableDH hashTable = new HashTableDH(size);
		System.out.println("Enter initial number of elements:");
		int nElems = Utility.getInt();
		DataItem dataItem;
		for (int i = 0; i < nElems; i++) {
			int key = (int) (Math.random() * 10 * size);
			dataItem = new DataItem(key);
			hashTable.insert(dataItem);
		}
		while(true) {
			System.out.println("Enter s:show, i:insert, d:delete, f:find");
			int ch = Utility.getChar();
			switch(ch) {
			case 's':
				hashTable.displayTable();
				break;
			case 'i':
				System.out.println("Enter item to insert...");
				dataItem = new DataItem(Utility.getInt());
				hashTable.insert(dataItem);
				break;
			case 'd':
				System.out.println("Enter item to delete...");
				hashTable.delete(Utility.getInt());
				break;
			case 'f':
				System.out.println("Enter item to find...");
				hashTable.find(Utility.getInt());
				break;
			default:
				System.out.println("Not a valid choice...");
			}
		}
	}
}
