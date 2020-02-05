package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeGraph {

	public static void makeGraph1() {
		
		int v = 6;
		String src = "1 2 1 5 2 5 5 4 2 4 4 3 4 6 2 3";
		
		String[] splited = src.split(" ");
		int[][] graph  = new int [v+1][v+1];
		
		
		
		for(int i=0; i<splited.length; i=i+2) {
			int a = Integer.parseInt(splited[i]);
			int b = Integer.parseInt(splited[i+1]);	
			
			graph[a][b] = 1;
			graph[b][a] = 1;
		}
		
		
		for(int[] row: graph)
			System.out.println(Arrays.toString(row));
		
		
		
		
	}
	public static void makeGraph2() {
		
		int v = 6;
		String src = "1 2 2 1 5 7 2 5 5 5 4 7 2 4 4 4 3 1 4 6 3 2 3 2";
		
		String[] splited = src.split(" ");
		int[][] graph  = new int [v+1][v+1];
		
		int[] temp = new int[10];
		Arrays.fill(temp, -1);
		
		for(int [] row: graph) {
			Arrays.fill(row,-1);
		}
		
		
		for(int i=0; i<splited.length; i=i+3) {
			
			int a = Integer.parseInt(splited[i]);
			int b = Integer.parseInt(splited[i+1]);	
			int w = Integer.parseInt(splited[i+2]);	
			
			// 단방향 그래프
			graph[a][b] = w;
			
		}
		
		
		for(int[] row: graph)
			System.out.println(Arrays.toString(row));

	}
	public static void Graph4() {
		
		int v = 7;
		String src = "1 2 1 3 1 6 1 7 6 4 6 5 5 4 7 5";
		
		String[] splited = src.split(" ");
		
		List<Integer>[] graph = new List[7+1];
		for(int i=1; i<graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		
		
		
		
		for(int i=0; i<splited.length; i=i+2) {
			
			int a = Integer.parseInt(splited[i]);
			int b = Integer.parseInt(splited[i+1]);	
				
			
			// 단방향 그래프
			graph[a].add(b);
			graph[b].add(a);
			
		}
		
		
		for(int i=0; i<graph.length; i++)
			System.out.println(i+">"+graph[i]);
	}
	
	public static void makeGraph6() {
		
		int v = 7;
		String src = "1 2 2 1 3 4 1 6 1 1 7 3 6 4 6 6 5 1 5 4 2 7 5 4";
		
		String[] splited = src.split(" ");
		
		List<Pair>[] graph = new List[7+1];
		
		for(int i=1; i<graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		
		
		
		
		for(int i=0; i<splited.length; i=i+3) {
			
			int a = Integer.parseInt(splited[i]);
			int b = Integer.parseInt(splited[i+1]);	
			int w = Integer.parseInt(splited[i+2]);	
			
			
			// 단방향 그래프
			graph[a].add(new Pair(b,w));
//			graph[b].add(new Pair);
			
		}
		
		
		for(int i=0; i<graph.length; i++)
			System.out.println(i+">"+graph[i]);
	}
	
	static class Pair{
		// 관리가 필요한 정보들을 변수로 선언해주자.
		int n;
		int w;
		
		public Pair(int n, int w) {
			this.n = n;
			this.w = w;
		}

		@Override
		public String toString() {
			return "[n=" + n + ", w=" + w + "]";
		}
		
		
		
		
	}
	public static void makeGraph7() {
		
		int v = 7;
		String src = "1 2 1 3 2 4 2 5 4 6 5 6 6 7 3 7";
		
		String[] splited = src.split(" ");
		
		List<Pair>[] graph = new List[7+1];
		
		for(int i=1; i<graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		
		
		
		
		for(int i=0; i<splited.length; i=i+3) {
			
			int a = Integer.parseInt(splited[i]);
			int b = Integer.parseInt(splited[i+1]);	
			int w = Integer.parseInt(splited[i+2]);	
			
			
			// 단방향 그래프
			graph[a].add(new Pair(b,w));
//			graph[b].add(new Pair);
			
		}
		
		
		for(int i=0; i<graph.length; i++)
			System.out.println(i+">"+graph[i]);
	}
	
	
	public static void main(String[] args) {
		//makeGraph1();
		//makeGraph2();
		//Graph4();
		//makeGraph6();
		makeGraph7();
	}

}
