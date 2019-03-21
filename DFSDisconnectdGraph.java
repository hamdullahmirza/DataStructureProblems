package com.datastructure.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSDisconnectdGraph {

	private int v;
	private LinkedList<Integer> adj[];
	public DFSDisconnectdGraph(int v){
		this.v=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++){
			adj[i]=new LinkedList<>();
		}
	}
	public void addEdge(int src,int dest){
		adj[src].add(dest);
	}
	public static void main(String[] args) {
		 DFSDisconnectdGraph g = new DFSDisconnectdGraph(4); 
		  
	        g.addEdge(0, 1); 
	        g.addEdge(0, 2); 
	        g.addEdge(1, 2); 
	        g.addEdge(2, 0); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 3); 
	  
	        System.out.println("Following is Depth First Traversal "+ 
	                           "(starting from vertex 2)"); 
	  
	        g.DFSearch(2);
	}
	private void DFSearch(int i) {
		// TODO Auto-generated method stub
		boolean[] visited= new boolean[v];
		//This is done for dis-connected graph where from node you cannot reach to all nodes
		for(int l=0;l<v;l++){
			if(visited[i]==false)
				DFSUtil(l,visited);
		}
	}
	private void DFSUtil(int i, boolean[] visited) {
		// TODO Auto-generated method stub
		visited[i]=true;
		System.out.println(i+" ");
		Iterator<Integer> it=adj[i].iterator();
		while(it.hasNext()){
			int j=it.next();
			if(!visited[j]){
				DFSUtil(j, visited);
			}
		}
	}
}
