package BaekJoon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_4963_¼¶ÀÇ°³¼ö {

	private static int[] dx = { 0, -1, -1, -1, 0, 1, 1, 1 };
	private static int[] dy = { 1, 1, 0, -1, -1, -1, 0, 1 };
	private static int [][] map;
	private static int [][] isVisited;
	private static int w,h;
	private static int cnt=0;
	
	public static void main(String[] args) throws FileNotFoundException {

		System.setIn(new FileInputStream("res\\4963.txt"));
		Scanner sc = new Scanner(System.in);
		int times=0;
		
		do {
			w = sc.nextInt();
			h = sc.nextInt();
			map = new int[h][w];
			isVisited = new int[h][w];

			for (int r = 0; r < h; r++) {
				for (int c = 0; c < w; c++) {
					
					map[r][c] = sc.nextInt();
				}
			}

			/*
			 * for(int r=0; r<h; r++) { for(int c=0; c<w; c++) {
			 * System.out.print(map[r][c]+" "); } System.out.println(); }
			 */
			
			for (int r = 0; r < h; r++) {
				for (int c = 0; c < w; c++) {
					if(checkMap()) {
						move(r,c,w,h);
						times++;
					}
				}
			}

		} while (w != 0 && h != 0);

		System.out.println(times);
		
	}

	private static boolean checkMap() {
		int sum = 0;
		
		for(int r=0; r<h; r++) {
			for(int c=0; c<w; c++) {
				sum+= map[r][c];
			}
		}
		
		if(sum >0) {
			return true;
		}
		return false;
	}


	private static void move(int r, int c, int w, int h) {
		Queue<Pair> queue = new LinkedList<Pair>();
		
		int tmp =0;
		queue.add(new Pair(r, c));
		
		while(!queue.isEmpty()) {
	
			Pair pos = queue.poll();
			map[pos.x][pos.y] = 0;
						
			for(int dir=0; dir<8; dir++) {
				if(isIn(pos.x+dx[dir], pos.y+dy[dir], w, h) && map[pos.x+dx[dir]][pos.y+dy[dir]] == 1) {
					
					pos.x = pos.x+dx[dir];
					pos.y = pos.y+dy[dir];
					
					queue.add(new Pair(pos.x, pos.y));
					
					
					
					
				}
			}
			
			
			
		}
	
		
		
		
	}
	
	
	private static boolean isIn(int r, int c, int w, int h) {
		return r >= 0 && c >= 0 && r < h && c < w;
	}

	static class Pair{
		int x, y;

		public Pair(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Pair [x=" + x + ", y=" + y + "]";
		}
		
	}
	
}


