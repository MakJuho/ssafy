package BaekJoon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_7576_토마토 {

	private static int[][] map;
	private static int [] dx = {0,1,0,-1};
	private static int [] dy = {1,0,-1,0};
	private static Queue<Pair> queue = new LinkedList<>();
	
	private static int M,N, pre_cnt_0=0, days=0, first_child=0;
	
	public static void main(String[] args) throws FileNotFoundException {

		System.setIn(new FileInputStream("res\\7576.txt"));
		Scanner sc = new Scanner(System.in);
		
		M = sc.nextInt();
		N = sc.nextInt();
		
		map = new int[N][M];
		
		for(int r=0; r<N; r++) {
			for(int c=0; c<M; c++) {
				map[r][c] = sc.nextInt();
				if(map[r][c] == 1) {
					queue.add(new Pair(r,c));
					
				}
			}
		}
		
		/*
		 * for(int r=0; r<N; r++) { for(int c=0; c<M; c++) {
		 * System.out.print(map[r][c]+" "); } System.out.println(); }
		 */
		
		BFS();
		int max = Integer.MIN_VALUE;
		if(isAllrot() == 0) {
			for(int r=0; r<N; r++) {
				for(int c=0; c<M; c++) {
					if(max < map[r][c])
						max = map[r][c]; 
				}
			}
			System.out.println(max-1);
		}
		
		return ;
		
		
		
		
		
		
	}
	
	private static void BFS() {
		
		
		int ch=0;
//		1. 1인 썩은토마토를 큐에서 빼면서 4방향으로 자식 확인
//		2. 자식이 썩지 않은 0 이라면 큐에 넣어주면서 맵상 1로 만든다.
		while(!queue.isEmpty()) {
			// 결과가 나올 때까지 반복해  
			
			Pair pos = queue.poll();
			
			for(int dir=0; dir<4; dir++) {
				if(isIn(pos.x+dx[dir], pos.y+dy[dir], N, M)) { // 해당 영역 안에 있는 가?
					if(map[pos.x+dx[dir]][pos.y+dy[dir]] == 0 ) { // 썩지 않는 토마토인가?
						queue.add(new Pair(pos.x+dx[dir], pos.y+dy[dir])); 
						map[pos.x+dx[dir]][pos.y+dy[dir]] = map[pos.x][pos.y] +1;
					}
				}
			}
			
			
				
		
			
		}
		
		
		
	}

	
	private static int isAllrot() {
		int cnt_0=0;
		
		for(int r=0; r<N; r++) {
			for(int c=0; c<M; c++) {
				if(map[r][c] == 0) {
					System.out.println(-1);
					return -1;
				}
			}
		}
	
		
		return 0;
		
	}

	private static boolean isIn(int x, int y, int N, int M) {
		return x>=0 && y>=0 && x<N && y<M;
	}
	
	static class Pair{
		
		int x, y;
		int child;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Pair [x=" + x + ", y=" + y + "]";
		}
		
		
	}
	

}
