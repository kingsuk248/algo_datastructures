package com.dsa.trees.binarytrees;

public class BinaryTree {
	Node root;
	
	public Node find(int key) {
		Node current = root;
		while (current.iData != key) {
			if (key < current.iData) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
			if (current == null) {
				return null;
			}
		}
		return current;
		
	}
	
	public void insert(int i, double d) {
		Node newNode = new Node(i, d);
		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node parent = root;
			while (true) {
				parent = current;
				if (i < current.iData) {
					current = current.leftChild;
					if (current == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					current = current.rightChild;
					if (current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	public boolean delete(int key)  {
		Node current = root;
		Node parent = root;
		boolean isLeftChild = false;
		while (current.iData != key) {
			parent = current;
			if (key < current.iData) {
				current = current.leftChild;
				isLeftChild = true;
			} else {
				current = current.rightChild;
				isLeftChild = false;
			}
			if (current == null) {
				return false;
			}
		}
		if (current.leftChild == null && current.rightChild == null) {
			if (current == root) {
				root = null;
			}
			else if (isLeftChild) {
				parent.leftChild = null;
			} else {
				parent.rightChild = null;
			}
		} else if (current.leftChild == null) {
			if (current == root) {
				root = current.rightChild;
			} else if (isLeftChild) {
				parent.leftChild = current.rightChild;
			} else {
				parent.rightChild = current.rightChild;
			}
		} else if (current.rightChild == null)	{
			if (current == root) {
				root = current.leftChild;
			} else if (isLeftChild) {
				parent.leftChild = current.leftChild;
			} else {
				parent.rightChild = current.leftChild;
			}
		} else {
			Node successor = findSuccessor(current);
			if (current == root) {
				root = successor;
			} else if (isLeftChild) {
				parent.leftChild = successor;
			} else {
				parent.rightChild = successor;
			}
			successor.leftChild = current.leftChild;
		}
		return false;
	}
	
	private Node findSuccessor(Node tbdNode) {
		Node successorParent = tbdNode;
		Node successor = tbdNode;
		Node current = tbdNode.rightChild;
		while (current != null) {
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		if (successor != tbdNode.rightChild) {
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = tbdNode.rightChild;
		}
		return successor;
	}
	
	public Node maximum() {
		Node current = root;
		Node parent = root;
		while (true) {
			parent = current;
			current = current.rightChild;
			if (current == null) {
				return parent;
			}
		}
	}
	
	public Node minimum() {
		Node current = root;
		Node parent = root;
		while (true) {
			parent = current;
			current = current.leftChild;
			if (current == null) {
				return parent;
			}
		}
	}
	
	public void inOrder(Node node) {
		if (node == null) {
			return;
		} else {
			inOrder(node.leftChild);
			node.displayNode();
			inOrder(node.rightChild);
		}
	}
	
	public void preOrder() {
		//TODO
	}
	
	public void postOrder() {
		//TODO
	}
	
	public void display() {
		//TODO
		int maxPosDepth = 20;
		displayWithTabSpaces(maxPosDepth, root);
	}
	
	public void displayWithTabSpaces(int tabs, Node node) {
		for (int i = 0; i < tabs; i++) {
			System.out.print("\t");
		}
		System.out.println(node.iData);
	}
	
}
