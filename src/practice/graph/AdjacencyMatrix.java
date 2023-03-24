package practice.graph;

import java.util.*;

public class AdjacencyMatrix {
	Scanner sc = new Scanner(System.in);
	void setGraph(int[][] graph, int m,int n) {
		for(int i=0;i<m;i++) {
			System.out.print("From "+ i);
			for(int j=0;j<n;j++) {
				System.out.println("to "+j);
				graph[i][j]= sc.nextInt();
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] graph = new int[3][3];
		AdjacencyMatrix obj = new AdjacencyMatrix();
		obj.setGraph(graph, 3, 3);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}

	}

}
