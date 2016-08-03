package com.dsa.trees.othertrees;

public class Node {
	private static final int ORDER = 4;
	public DataItem[] dataArray = new DataItem[ORDER - 1];
	public Node[] childArray = new Node[ORDER];
	private int numItems;
	private Node parent;
	
	public void connectChild(int childNum, Node child) {
		childArray[childNum] = child;
		if (child != null) {
			child.parent = this;
		}
	}
	
	public Node disconnectChild(int childNum) {
		Node tempNode = childArray[childNum];
		childArray[childNum] = null;
		return tempNode;
	}
	
	public Node getParent() {
		return parent;
	}
	
	public Node getChild(int childNum) {
		return childArray[childNum];
	}
	
	public boolean isLeaf() {
		return childArray[0] == null;
	}
	
	public int getNumItems() {
		return numItems;
	}
	
	public boolean isFull() {
		return numItems == ORDER - 1;
	}
	
	public DataItem getItem(int index) {
		return dataArray[index];
	}
	
	public int findItem(double key) {
		for (int i = 0; i < numItems; i++) {
			if (key == dataArray[i].dData) {
				return i;
			}
		}
		return -1;
	}
	
	public int insertItem(DataItem item) {
		numItems++;
		double newData = item.dData;
		for (int i = ORDER-2; i >= 0; i--) {
			if (dataArray[i] == null) {
				continue;
			} else {
				double currentData = dataArray[i].dData;
				if (currentData > newData) {
					dataArray[i+1] = dataArray[i]; 
				} else {
					dataArray[i+1] = item;
					return i+1;
				}
			}
		}
		dataArray[0] = item;
		return 0;
	}
	
	public DataItem removeItem() {
		DataItem temp = dataArray[numItems - 1];
		dataArray[numItems - 1] = null;
		numItems--;
		return temp;
	}
	
	public void displayNode() {
		for (int i = 0; i < numItems; i++) {
			dataArray[i].display();
		}
		System.out.println("/");
	}
}
