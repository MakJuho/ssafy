package day6;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P323_BFS_Basic {
	private static int V = 7;
	private static String data = "1,2,1,3,2,4,2,5,4,6,5,6,7,6,3,7";
	private static List<Integer>[] graph;
	private static int[][] map = new int[V+1][V+1];
	public static void makeGraph() {
	
		String[] splited = data.split(",");
		for(int i=0; i<splited.length; i=i+2) {
			Integer x = Integer.parseInt(splited[i]);
			Integer y = Integer.parseInt(splited[i+1]);
		
			map[x][y] = 1;
			map[y][x] = 1;
			
		}
		
	
		
	}
	public static void bfs(int start) {
		
		// 방문 표시
		boolean[] visited = new boolean[V+1];
		
		// 큐 생성
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			// 맨 앞에 한놈 빼서
			Integer front = queue.poll();
			

			System.out.print(front+" - ");
			// 자식에 대한 탐방
//			List<Integer> childs = graph[front];
			
			for(int k=1; k<=V; k++) {
				if(map[front][k]==1) {
					if(!visited[k]) {
						queue.offer(k);
						visited[k] = true;
					}
				}
			}
		}
		
		
	}
		
	
	public static void main(String[] args) {
		makeGraph();
		bfs(1);
	}

}
