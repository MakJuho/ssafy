package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA_4615_오셀로게임 {

	private static int[] dx = {0,-1,-1,-1,0,1,1,1}; 
	private static int[] dy = {1,1,0,-1,-1,-1,0,1};
	
	static class Pair{
		int c;
		int r;
		public Pair(int c, int r) {
			this.c = c;
			this.r = r;
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
	
		System.setIn(new FileInputStream("res\\4615.txt"));
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		
		for(int t=1; t<=TC; t++) {
			int N = sc.nextInt(); 
			int cnt = sc.nextInt(); 
			int[][] board = new int [N+1][N+1];
			
			board[N/2][N/2] = 2;
			board[N/2][N/2+1] = 1;
			board[N/2+1][N/2] = 1;
			board[N/2][N/2] = 2;
					
			for(int i=1; i<=cnt; i++) {
						
				int c = sc.nextInt();
				int r = sc.nextInt();
				
				Pair pos = new Pair(c,r);
				
				int color = sc.nextInt();
				boolean isChange = false;
				for(int dir =0; dir<8; dir ++) {
					
					if(isOut(pos.c+dx[dir],pos.r+dy[dir],N)) {
						continue;
					}
					
					while(!isChange) {
						if(color == 1 && board[pos.c+dx[dir]][pos.r+dy[dir]]==2) {
							pos.c = pos.c+dx[dir];
							pos.r = pos.r+dy[dir];
						}
						else if(color == 2 && board[pos.c+dx[dir]][pos.r+dy[dir]] == 1) {
							pos.c = pos.c+dx[dir];
							pos.r = pos.r+dy[dir];
						}
					}
				}
				
				
				
				
			}
		}
	}
	
	private static boolean isOut(int x, int y, int n) {
		return !(x<n && x>=0 && y<n && y>=0);
	}
}
