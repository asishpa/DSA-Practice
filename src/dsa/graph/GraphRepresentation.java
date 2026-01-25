package dsa.graph;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class GraphRepresentation {
	LinkedList[] adjList = null;
	public GraphRepresentation(int noOfVertex) {
		adjList = new LinkedList[noOfVertex];
		for(int i=0;i<noOfVertex;i++) {
			adjList[i] = new LinkedList<>();
		}
	}
		public void add(int vertex,int adjVertex) {
			adjList[vertex].add(adjVertex);
		}
		// TODO Auto-generated constructor stub
	public void BFS(int vertex) {
		Queue<Integer> q = new LinkedList<>();
		q.add(vertex);
		Set<Integer> s = new HashSet<>();
		while(!q.isEmpty()) {
			Integer ver = q.poll();
			s.add(ver);
			System.out.print(ver+"->");
			LinkedList l = adjList[ver];
			Iterator<Integer> itr = l.iterator();
			while(itr.hasNext()) {
				Integer integer = (Integer)itr.next();
				if(!s.contains(integer)) {
					q.add(integer);
					s.add(integer);
				}
			}
		}
	}
		
		public void DFS(int vertex) {
			Stack<Integer> stack = new Stack<>();
			stack.add(vertex);
			Set<Integer> s = new HashSet<>();
			while(!stack.isEmpty()) {
				Integer ver = stack.pop();
				s.add(ver);
				System.out.print(ver+"->");
				LinkedList l = adjList[ver];
				Iterator<Integer> itr = l.iterator();
				while(itr.hasNext()) {
					Integer  integer = (Integer) itr.next();
					if(!s.contains(integer)) {
						stack.add(integer);
						s.add(integer);
					}
				}
			}
			
		}
	
	public static void main(String args[]) {
		GraphRepresentation g = new GraphRepresentation(5);
		g.add(0, 1);
		g.add(0, 2);
		g.add(1, 0);
		g.add(1, 3);
		g.add(1, 4);
		g.add(2, 0);
		g.add(2, 3);
		g.add(3, 2);
		g.add(3, 4);
		g.add(4, 1);
		g.add(4, 3);
		g.BFS(0);
		System.out.println("Break");
		g.DFS(0);
		
	}

}
