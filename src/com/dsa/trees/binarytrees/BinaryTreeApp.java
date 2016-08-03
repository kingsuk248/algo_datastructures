package com.dsa.trees.binarytrees;

import com.dsa.util.methods.Utility;

public class BinaryTreeApp {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		//performTreeOperations(tree);
		performSmallerTest(tree);
	}
	
	static public void performSmallerTest(BinaryTree tree) {
		tree.insert(5, 10.0);
		tree.insert(8, 10.0);
		tree.insert(3, 10.0);
		tree.insert(1, 10.0);
		tree.insert(9, 10.0);
		tree.insert(7, 10.0);
		tree.insert(6, 10.0);
		tree.insert(10, 10.0);
		tree.insert(2, 10.0);
		Node node = tree.find(6);
		if (node != null) {
			System.out.println("Node found...");
		}
		System.out.print("Inorder traversal...");
		tree.inOrder(tree.root);
		System.out.println();
		System.out.println("Max value is: " + tree.maximum().iData);
		System.out.println("Min value is: " + tree.minimum().iData);
		tree.delete(8);
	}
	
	static void performTreeOperations(BinaryTree tree) {
		int size = 20;
		for (int i = 0; i < size; i++) {
			int iRdm = (int)(Math.random() * 100);
			double dRdm = Math.random() * 100;
			tree.insert(iRdm, dRdm);
		}
		System.out.println("Operation ? (s=show, f=find, d=delete, in=inorder, pr=preorder, po=postorder, e=exit)");
		int key;
		while (true) {
			String choice = Utility.getString();
			switch (choice) {
			case "s":
				tree.display();
				break;
			case "f":
				System.out.println("Key to find ?");
				key = Utility.getInt();
				tree.find(key);
				break;
			case "d":
				System.out.println("Key to delete ?");
				key = Utility.getInt();
				tree.delete(key);
				break;
			case "in":
				tree.inOrder(tree.root);
				break;
			case "pr":
				tree.preOrder();
				break;
			case "po":
				tree.postOrder();
				break;
			case "e":
				return;
			}
			System.out.println("Key in next choice...");
		}
	}
}
