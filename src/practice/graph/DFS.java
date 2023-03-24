package practice.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {
	
	public List<Integer> printDfs(int[][] list, int m, int n) {
		Stack<Integer> st = new Stack<Integer>();
		int startVertex = 0;
		st.push(startVertex);
		List<Integer> visited = new ArrayList<>();
		
		while(!st.isEmpty()) {
			int vertex = st.pop();
			visited.add(vertex);
			for(int i=0;i<m;i++) {
				if(list[vertex][i]==1) {
					if(!visited.contains(i)) {
						st.push(i);
					}
				}
			}
		}
		return visited;
	}

	public static void main(String[] args) {
		DFS obj = new DFS();
		 int[][] list = {{ 0,1, 1, 0},{1, 0, 0, 1 },{1, 0, 0, 0 },{0, 1, 0, 0}};
		 //int[][] list = {{ 0,1, 1, 0},{0, 0, 1, 0 },{1, 0, 0, 1 },{0, 0, 0, 1}};
		List<Integer> visited = obj.printDfs(list, 4, 4);
		for(int a: visited) {
			System.out.println(a);
		}

	}

}
