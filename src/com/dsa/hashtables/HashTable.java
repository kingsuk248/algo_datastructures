package com.dsa.hashtables;

public class HashTable {
	public DataItem[] hashArray;
	public int arraySize;
	public DataItem nonItem;
	
	public HashTable(int size) {
		hashArray = new DataItem[size];
		arraySize = size;
		nonItem = new DataItem(-1);
	}
	
	public int hash(int key) {
		return key % arraySize;
	}
	
	public void displayTable() {
		for (int i = 0; i < arraySize; i++) {
			if (hashArray[i] != null) {
				System.out.print(hashArray[i].iData + " ");
			} else {
				System.out.print("**" + " ");
			}
		}
		System.out.println();
	}
	
	public void insert(DataItem dataItem) {
		int hashVal = hash(dataItem.iData);
		while (hashArray[hashVal] != null && hashArray[hashVal].iData != - 1) {
			++hashVal;
			hashVal = hashVal % arraySize;
		}
		hashArray[hashVal] = dataItem;
	}
	
	public DataItem delete(int key) {
		int hashVal = hash(key);
		while (hashArray[hashVal] != null) {
			if (hashArray[hashVal].iData == key) {
				DataItem temp = hashArray[hashVal];
				hashArray[hashVal] = nonItem;
				return temp;
			}
			++hashVal;
			hashVal %= arraySize;
		}
		return null;
	}
	
	public DataItem find(int key) {
		int hashVal = hash(key);
		while (hashArray[hashVal] != null) {
			if (hashArray[hashVal].iData == key) {
				return hashArray[hashVal];
			}
			++hashVal;
			hashVal %= arraySize;
		}
		return null;
	}
}
