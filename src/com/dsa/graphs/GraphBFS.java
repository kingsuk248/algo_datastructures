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
	
	public void addVertex(Vertex vertex) {
		vertices[numVertices++] = vertex;
	}
	
	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}
	
	public void displayVertex(int v) {
		System.out.print(vertices[v].label + " ");
	}
	
	public void bfs() {
		//TODO
	}
	
	public int getAdjUnvisitedVertex(int v) {
		return 0;
	}
}
