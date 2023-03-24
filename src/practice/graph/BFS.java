package practice.graph;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Queue;
import java.util.Set;

public class BFS {
	
	public Set<Integer> breadthFirstSearch(int[][] list, int m, int n) {
		Set<Integer> visitedList = new LinkedHashSet<Integer>();
		Queue<Integer> queue = new ArrayDeque<Integer>();
		
		int startVertex=0;
		queue.add(startVertex);
		
		while(!queue.isEmpty()) {			
			int vertex = queue.remove();
			visitedList.add(vertex);
			for(int j=0;j<n;j++) {
				if(list[vertex][j]==1) {					
					if(!visitedList.contains(j)) {
						queue.add(j);						
					}
				}
			}
		}
		
		return visitedList;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BFS obj = new BFS();
		
		  
		 int[][] list = {{ 0,1, 1, 0},{1, 0, 0, 1 },{1, 0, 0, 0 },{0, 1, 0, 0}};
		 //int[][] list = {{ 0,1, 1, 0},{1, 0, 0, 1 },{1, 0, 0, 0 },{0, 1, 0, 0}};
		 Set<Integer> path = obj.breadthFirstSearch(list, 4, 4);
		 System.out.println("path " + path);
		 for(int a: path) {
			 
			 System.out.println(a);
		 }

	}

}
