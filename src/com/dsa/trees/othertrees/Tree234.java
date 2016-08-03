package com.dsa.trees.othertrees;

public class Tree234 {
	Node root = new Node();
	
	public int find(double key) {
		Node currentNode = root;
		int childNumber;
		while (true) {
			if ((childNumber = currentNode.findItem(key)) != -1) {
				return childNumber;
			} else if (currentNode.isLeaf()) {
				return -1;
			} else {
				currentNode = getNextChild(currentNode, key);
			}
		}
	}

	public int insert(double key) {
		DataItem newItem = new DataItem(key);
		Node currentNode = root;
		while (true) {
			if (currentNode.isFull()) {
				split(currentNode);
				currentNode = currentNode.getParent();
				currentNode = getNextChild(currentNode, key);
				break;
			} else if(currentNode.isLeaf()) {
				break;
			} else {
				currentNode = getNextChild(currentNode, key);
			}
		}
		return currentNode.insertItem(newItem);
	}
	
	public void split(Node thisNode) {
		DataItem itemB, itemC;
		itemC = thisNode.removeItem();
		itemB = thisNode.removeItem();
		Node parent, child2, child3;
		child2 = thisNode.disconnectChild(2);
		child3 = thisNode.disconnectChild(3);
		if (thisNode == root) {
			root = new Node();
			parent = root;
			root.connectChild(0, thisNode);
		} else {
			parent = thisNode.getParent();
		}
		int itemIndex = parent.insertItem(itemB);
		int n = parent.getNumItems();
		for (int x = n; x > itemIndex; x--) {
			Node temp = parent.disconnectChild(x);
			parent.connectChild(x + 1, temp);
		}
		Node newRight = new Node();
		parent.connectChild(itemIndex + 1, newRight);
		newRight.insertItem(itemC);
		newRight.connectChild(0, child2);
		newRight.connectChild(1, child3);
	}
	
	public Node getNextChild(Node currentNode, double key) {
		int index;
		int numItems = currentNode.getNumItems();
		for (index = 0; index < numItems; index++) {
			if (key < currentNode.dataArray[index].dData) {
				return currentNode.getChild(index);
			}
		}
		return currentNode.getChild(index);
	}
	
	public void displayTree() {
		recDisplayTree(root, 0, 0);
	}
	
	private void recDisplayTree(Node thisNode, int level, int childNum) {
		System.out.print("Level-->" + level + " Child-->" + childNum);
		thisNode.displayNode();
		for (int index = 0; index <= thisNode.getNumItems(); index++) {
			Node childNode = thisNode.getChild(index);
			if (childNode != null) {
				recDisplayTree(childNode, level, index); 
			} else {
				return;
			}
		}
	}
}
