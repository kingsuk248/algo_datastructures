package com.dsa.hashtables;

public class HashTableChain {
	public SortedList[] hashArray;
	public int arraySize;
	
	public HashTableChain(int size) {
		hashArray = new SortedList[size];
		arraySize = size;
		for (int i = 0; i < size; i++) {
			hashArray[i] = new SortedList();
		}
	}
	
	public int hash(int key) {
		return key % arraySize;
	}
	
	public void displayTable() {
		for (int i = 0; i < arraySize; i++) {
			System.out.print(i + ". ");
			hashArray[i].displayList();
		}
	}
	
	public void insert(Link newLink) {
		int hashValue = hash(newLink.iData);
		hashArray[hashValue].insert(newLink);
	}
	
	public Link find(int key) {
		int hashValue = hash(key);
		return hashArray[hashValue].find(key);
	}
	
	public void delete(int key) {
		int hashValue = hash(key);
		hashArray[hashValue].delete(key);
	}
}
