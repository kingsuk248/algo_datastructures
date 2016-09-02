package com.dsa.graphs;

public class GraphBFS {
	private final int MAX_VERTICES = 20;
	private Vertex[] vertices;
	private int numVertices;
	private int[][] adjMatrix;
	private QueueX queue;
	
	public GraphBFS(int size) {
		vertices = new Vertex[MAX_VERTICES];
		adjMatrix = new int[MAX_VERTICES][MAX_VERTICES];
		queue = new QueueX();
	}
	
	public void addVertex(char v) {
		vertices[numVertices++] = new Vertex(v);
	}
	
	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}
	
	public void displayVertex(int v) {
		System.out.print(vertices[v].label + " ");
	}
	
	public void bfs() {
		vertices[0].wasVisited = true;
		displayVertex(0);
		queue.insert(0);
		int v2;
		while (!queue.isEmpty()) {
			int v1 = queue.remove();
			while ((v2 = getAdjUnvisitedVertex(v1)) != -1) {
				vertices[v2].wasVisited = true;
				displayVertex(v2);
				queue.insert(v2);
			}
		}
		for (int i = 0; i < numVertices; i++) {
			vertices[i].wasVisited = false;
		}
	}
	
	public int getAdjUnvisitedVertex(int v) {
		for (int i = 0; i < numVertices; i++) {
			if (adjMatrix[v][i] == 1 && vertices[i].wasVisited == false) {
				return i;
			}
		}
		return -1;
	}
}
