package BaekJoon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_7576_�丶�� {

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
//		1. 1�� �����丶�並 ť���� ���鼭 4�������� �ڽ� Ȯ��
//		2. �ڽ��� ���� ���� 0 �̶�� ť�� �־��ָ鼭 �ʻ� 1�� �����.
		while(!queue.isEmpty()) {
			// ����� ���� ������ �ݺ���  
			
			Pair pos = queue.poll();
			
			for(int dir=0; dir<4; dir++) {
				if(isIn(pos.x+dx[dir], pos.y+dy[dir], N, M)) { // �ش� ���� �ȿ� �ִ� ��?
					if(map[pos.x+dx[dir]][pos.y+dy[dir]] == 0 ) { // ���� �ʴ� �丶���ΰ�?
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
