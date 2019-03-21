package com.datastructure.graphs;

import java.util.LinkedList;

public class AdjacencyList {

	static class Graph{
		int V;
		LinkedList<Integer> adListArray[];
		Graph(int V){
			this.V=V;
			// define the size of array as  
            // number of vertices 
			adListArray = new LinkedList[V]; 
			// Create a new list for each vertex 
            // such that adjacent nodes can be stored 
			for(int i=0;i<V;i++){
				adListArray[i]=new LinkedList<>();
			}
		}
		static void addEdge(Graph graph,int src, int dest){
			// Add an edge from src to dest.
			graph.adListArray[src].add(dest);
			// Since graph is undirected, add an edge from dest 
	        // to src also
			graph.adListArray[dest].add(src);
		}
		static void printGraph(Graph graph){
			for(int i=0;i<graph.V;i++){
				for(Integer p:graph.adListArray[i]){
					System.out.print(p.intValue());
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		int V = 5; 
        Graph graph = new Graph(V); 
        graph.addEdge(graph, 0, 1); 
        graph.addEdge(graph, 0, 4); 
        graph.addEdge(graph, 1, 2); 
        graph.addEdge(graph, 1, 3); 
        graph.addEdge(graph, 1, 4); 
        graph.addEdge(graph, 2, 3); 
        graph.addEdge(graph, 3, 4); 
       
        // print the adjacency list representation of  
        // the above graph 
        graph.printGraph(graph); 
	}
}