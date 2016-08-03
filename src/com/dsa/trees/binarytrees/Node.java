package com.dsa.trees.binarytrees;

public class Node {
	int iData;
	double dData;
	int tabSpaces;		
	Node leftChild;
	Node rightChild;
	
	public Node(int iData, double dData) {
		this.iData = iData;
		this.dData = dData;
	}
	
	public void displayNode() {
		System.out.print(iData + " ");
	}
}
