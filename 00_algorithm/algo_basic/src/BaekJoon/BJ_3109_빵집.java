package BaekJun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BJ_3109_빵집 {

	private static int [] dx = {-1,0,1};
	static int cnt;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\3109.txt"));
		Scanner sc = new Scanner(System.in);
		
		int R = sc.nextInt();
		int C = sc.nextInt();
		
		int [][] map = new int [R][C];
		
		
		for(int r=0; r<R; r++) {
			String tmp = sc.next();
			for(int c=0; c<C; c++) {
				if(tmp.charAt(c) == '.')
					map[r][c] = 0;
				if(tmp.charAt(c) == 'x')
					map[r][c] = 1;
			}
		}
		
		// 길 :0,  아파트 : 1
		
		/*for(int r=0; r<R; r++) {
			for(int c=0; c<C; c++) {
				System.out.print(map[r][c]+" ");
			}
			System.out.println();
		}*/
		
		
		cnt =0;
//		탐색을 해서 x가 아니고 빈 공간이면 진행 열이 마지막에 도달했으면 종료 하고, 해당 칸에 모두 -1
		for(int i=0; i<R; i++) {
			dfs(map, R, C, new Pair(i,0));
			isPossible = false;
		}
		
		System.out.println(cnt);
	
	
	}

	private static boolean isOut(int x, int y, int r, int c) {
		return !(x>=0 && x<r && y>=0 && y<c);
	}
	
	static class Pair{
		int x, y;

		public Pair(int x, int y) {
		
			this.x = x;
			this.y = y;
		}
		
	}
	private static boolean isPossible = false;
	
	private static void dfs(int[][] map, int r, int c, Pair pos) {
		
		
		if( pos.y == c-1) {
			cnt ++;
			isPossible = true;
			return;
		}
		for(int i=0; i<3; i++) {
			int nr = pos.x + dx[i];
			int nc = pos.y + 1;
			if(isOut(nr, nc, r, c)) {
				continue;
			}
			if(isPossible) {
				return;
			}
			if(map[nr][nc] == 0) {
				
				map[nr][nc] = 2;
				
				for(int a=0; a<r; a++) {
					for(int b=0; b<c; b++) {
						//System.out.print(map[a][b]+" ");
					}
					//System.out.println("");
				}
				//System.out.println("");
				
				dfs(map, r, c, new Pair(nr,nc));
			}
		}
	}
	
}
