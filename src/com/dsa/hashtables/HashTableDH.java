package com.dsa.hashtables;

public class HashTableDH {
	private DataItem[] hashArray;
	private int arraySize;
	private DataItem nonItem;
	
	public HashTableDH(int size) {
		hashArray = new DataItem[size];
		arraySize = size;
		nonItem = new DataItem(-1);
	}
	
	public void displayTable() {
		for (int i = 0; i < arraySize; i++) {
			if (hashArray[i] == null) {
				System.out.print("**" + " ");
			} else {
				System.out.print(hashArray[i].iData + " ");
			}
		}
		System.out.println();
	}
	
	private int hash1(int key) {
		return key % arraySize;
	}

	private int hash2(int key) {
		return 5 - (key % 5);
	}
	
	public DataItem find(int key) {
		int hashVal = hash1(key);
		int stepSize = hash2(key);
		while (hashArray[hashVal] != null) {
			if (hashArray[hashVal].iData == key) {
				return hashArray[hashVal];
			} else {
				hashVal += stepSize;
				hashVal %= arraySize;
			}
		}
		return null;
	}
	
	public void insert(DataItem dataItem) {
		int key = dataItem.iData;
		int hashVal = hash1(key);
		int stepSize = hash2(key);
		while (hashArray[hashVal] != null && hashArray[hashVal].iData != -1) {
			hashVal += stepSize;
			hashVal %= arraySize;
		}
		hashArray[hashVal] = dataItem;
	}
	
	public DataItem delete(int key) {
		int hashVal = hash1(key);
		int stepSize = hash2(key);
		while (hashArray[hashVal] != null) {
			if (hashArray[hashVal].iData == key) {
				DataItem temp = hashArray[hashVal];
				hashArray[hashVal] = nonItem;
				return temp;
			}
			hashVal += stepSize;
			hashVal %= arraySize;
		}
		return null;
	}
}
