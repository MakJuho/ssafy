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
	private static int w,h;
	private static Queue<Pair> queue = new LinkedList<>();
	
	public static void main(String[] args) throws FileNotFoundException {

		System.setIn(new FileInputStream("res\\4963.txt"));
		Scanner sc = new Scanner(System.in);
		
		
		do {
			int cnt=0;
			w = sc.nextInt();
			h = sc.nextInt();
			map = new int[h][w];

			for (int r = 0; r < h; r++) {
				for (int c = 0; c < w; c++) {
					
					map[r][c] = sc.nextInt();
				}
			}


			for (int r = 0; r < h; r++) {
				for (int c = 0; c < w; c++) {
					if(map[r][c] == 1 ) {
						
						move(r,c,w,h);
						cnt++;
					}
				}
			}
			if(w != 0 && h != 0)
				System.out.println(cnt);

		} while (w != 0 && h != 0);

		
		
	}

	/*
	 * private static boolean checkMap() {
	 * 
	 * for(int r=0; r<h; r++) { for(int c=0; c<w; c++) { if(map[r][c] == 1) return
	 * true; } }
	 * 
	 * 
	 * return false; }
	 */


	private static void move(int r, int c, int w, int h) {
		
		queue.add(new Pair(r, c));
		
		map[r][c] = 0;
		
		while(!queue.isEmpty()) {
			Pair pos = queue.poll();
			int nr = pos.x;
			int nc = pos.y;
						
			for(int dir=0; dir<8; dir++) {
				if(isIn(pos.x+dx[dir], pos.y+dy[dir], w, h) && map[pos.x+dx[dir]][pos.y+dy[dir]] == 1) {
					
					nr = pos.x+dx[dir];
					nc = pos.y+dy[dir];
					
					queue.add(new Pair(nr, nc));
					map[nr][nc] = 0;
					
					
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


