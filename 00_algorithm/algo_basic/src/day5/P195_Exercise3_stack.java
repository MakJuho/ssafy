package day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P195_Exercise3_stack {

	private static int V = 7;
	private static String src = "1 2 1 3 2 4 2 5 4 6 5 6 6 7 3 7";
	private static List<Integer> [] graph;
	
	
	private static boolean[] visited = new boolean[V+1];
	private static List<Integer> path = new ArrayList<>();

	
	public static void dfs(int start) {
		
		// 처음 방문이면 해야할 일 하기
		visited[start] = true;
		path.add(start);
		
		// 갈 때까지 가보자
		List<Integer> childs = graph[start];
		
		// 자식 중 가능한 정점 방문
		for(int c=childs.size()-1; c>=0; c--) {
			Integer child = childs.get(c); // 다음 정점
			if(!visited[child]) {
				dfs(child);
				//System.out.println(child);
			}
		}
		
	}
	
	
	/*
	public static void dfs(int start) {
		boolean[] visited = new boolean[V+1];
		Stack<Integer> st = new Stack<>();
		List<Integer> path = new ArrayList<>();
		
		//출발
		st.add(start);
		
		while(!st.isEmpty()) {
			// 가장 마지막에 있는 녀석을 뺀다.
			Integer top = st.pop();
			// 방문했던 지점은 관심이 없다.
			if(visited[top]) {
				continue;
			}
			// 처음 방문이면 해야할 일 하기.
			visited[top]=true;
			path.add(top);
			
			// 갈때까지 가보자... 이 정점을 통해 갈 수 있는 다음 정점은?
			List<Integer> childs = graph[top];
			
			// 자식 중 가능한(아직 미방문인)정점 방문
			for(int c=childs.size()-1; c>=0; c--) {
				Integer child = childs.get(c); // 다음 정점
				if(!visited[child]) {
					st.push(child);
				}
			}
		}
		
		// 경로 출력
		System.out.println(path);
		
		
	}
	*/
	private static void makeGraph() {
		
		graph = new List[V+1];
		String[] splited = src.split(" ");
		
		for(int i=0; i<graph.length; i++){ // 배열 초기화
			graph[i] = new ArrayList<>();
		}
		
		for(int i=0; i<splited.length; i=i+2) {
			int a = Integer.parseInt(splited[i]);
			int b = Integer.parseInt(splited[i+1]);
			graph[a].add(b);
			graph[b].add(a);		
		}
		
		for(int i=0; i<graph.length; i++) {
			System.out.println(i+">"+graph[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeGraph();
		dfs(1);
	}

}
