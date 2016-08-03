package com.dsa.sorting.advanced;

public class PartitionApp {
	public static void main(String[] args) {
		int size = 20;
		Partition partition = new Partition(size);
		int pivot = 100;
		for (int i = 0; i < size; i++) {
			partition.insert((int)(Math.random() * 200));
		}
		System.out.println("Before partitioning the elements....");
		partition.display();
		partition.partitionIt(0, size - 1, pivot);
		System.out.println("After partitioning the elements....");
		partition.display();
	}
}
