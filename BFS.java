package com.datastructure.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

	private int V;
	private LinkedList<Integer> adj[];
	public BFS(int V){
		this.V=V;
		adj= new LinkedList[V];
		for(int i=0;i<V;i++){
			adj[i]=new LinkedList<>();
		}
	}
	public void addEdge(int src, int dest){
		adj[src].add(dest);
	}
	public static void main(String[] args) {
		 BFS g = new BFS(4); 
		  
	        g.addEdge(0, 1); 
	        g.addEdge(0, 2); 
	        g.addEdge(1, 2); 
	        g.addEdge(2, 0); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 3); 
	  
	        System.out.println("Following is Breadth First Traversal "+ 
	                           "(starting from vertex 2)"); 
	  
	        g.BFSearch(2); 
	}
	private void BFSearch(int i) {
		// TODO Auto-generated method stub
		boolean[] visitedNode= new boolean[V];
		LinkedList<Integer> queue = new LinkedList<>();
		visitedNode[i]=true;
		queue.add(i);
		while(queue.size()>0){
			int node=queue.poll();
			System.out.println(node+" ");
			Iterator<Integer> it= adj[node].iterator();
			while(it.hasNext()){
				int n=it.next();
				if(!visitedNode[n]){
					queue.add(n);
					visitedNode[n]=true;
				}
			}
		}
	}
}
