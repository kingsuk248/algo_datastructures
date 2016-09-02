package com.dsa.graphs;

public class GraphBFSApp {
	public static void main(String[] args) {
		GraphBFS graph = new GraphBFS(5);
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 4);
		graph.addEdge(0, 4);
		graph.addEdge(1, 3);
		graph.addEdge(3, 4);
		System.out.println("Visits");
		graph.bfs();
	}
}
