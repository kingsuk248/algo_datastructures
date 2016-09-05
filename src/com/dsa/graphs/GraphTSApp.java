package com.dsa.graphs;

public class GraphTSApp {
	public static void main(String[] args) {
		GraphTS graph = new GraphTS();
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		graph.addVertex('F');
		graph.addVertex('G');
		graph.addVertex('H');
		graph.addEdge(0, 3);
		graph.addEdge(0, 4);
		graph.addEdge(1, 4);
		graph.addEdge(2, 5);
		graph.addEdge(3, 6);
		graph.addEdge(4, 6);
		graph.addEdge(5, 7);
		graph.addEdge(6, 7);
		graph.topoSort();
	}
}
