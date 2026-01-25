package dsa.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class DijkastraPriorityQueue {
	static class Pair {
		int node;
		int weight;

		public Pair(int node, int weight) {
			this.node = node;
			this.weight = weight;
		}
	}

	LinkedList<Pair>[] adjList = null;

	public DijkastraPriorityQueue(int noOfVertex) {
		adjList = new LinkedList[noOfVertex];
		for (int i = 0; i < noOfVertex; i++) {
			adjList[i] = new LinkedList<Pair>();
		}
	}

	public void add(int vertex, int adjVertex, int weight) {
		adjList[vertex].add(new Pair(adjVertex, weight));
	}
	// TODO Auto-generated constructor stub
	public int[] findMinDistance(int start) {
		int[] distance = new int[adjList.length];
		Arrays.fill(distance, Integer.MAX_VALUE);
		PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> a.weight - b.weight);
		pq.add(new Pair(start,0));
		while(!pq.isEmpty()) {
			Pair current= pq.poll();
			int u = current.node;
			int distU = current.weight;
			if(distance[u] < distU)
				continue;
			distance[u] = distU;
			for(Pair neighbour: adjList[u]) {
				int v = neighbour.node;
				int weightUV = neighbour.weight;
				if(distance[u]+weightUV < distance[v]) {
					distance[v] = weightUV + distance[u];
					pq.add(new Pair(v, distance[v]));
				}
			}
		}
		return distance;
	}
	public static void main(String args[]) {
		DijkastraPriorityQueue g = new DijkastraPriorityQueue(6);
		g.add(0, 1, 4);
		g.add(0, 2, 4);
		g.add(1, 0, 4);
		g.add(1, 2, 2);
		g.add(2, 0, 4);
		g.add(2, 1, 2);
		g.add(2, 3, 3);
		g.add(2, 4, 1);
		g.add(2, 5, 6);
		g.add(3, 2, 3);
		g.add(3, 5, 2);
		g.add(4, 2, 1);
		g.add(4, 5, 3);
		g.add(5, 3, 2);
		g.add(5, 2, 6);
		g.add(5, 4, 3);
		int distanceFinal[]=g.findMinDistance(0);
		//print the shortest distance 
		for(int i=0;i<distanceFinal.length;i++) {
			System.out.println("The shortest distance from 0 to "+i+" is "+distanceFinal[i]);
			
		}
	}

}
