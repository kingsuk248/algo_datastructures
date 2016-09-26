package com.dsa.graphs;

public class Edge {
	public int srcVertex;
	public int destVertex;
	public int distance;
	
	public Edge(int src, int dest, int dist) {
		this.srcVertex = src;
		this.destVertex = dest;
		this.distance = dist;
	}
}
