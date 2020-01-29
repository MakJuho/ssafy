package com.ssafy.algo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Solution32 {

	private static int[] dx = {0,1,0,-1};
	private static int[] dy = {1,0,-1,0};
	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int TC = sc.nextInt();
		
		for(int t=1; t<=TC; t++) {
			int Y = sc.nextInt();
			int X = sc.nextInt();
			int N = sc.nextInt();
		
			int[][] map = new int[Y+1][X+1];
			int[][] ch_map = new int[Y][X];
			int sum=0;
			int minus=0;
			for(int r=1; r<=Y; r++) {
				for(int c=1; c<=X; c++) {
					
					map[r][c] = sc.nextInt();
					/*int nr=r;
					int nc=c;
					
					
					
					// 방향
					int dir = map[r][c]/10-1;
					
					// 거리
					int d = map[r][c]%10;	
					
					
					
					// 구역을 넘어가는 지 체크
					if(isOver(map,nr,nc,dir,d)) {
						// 구역 내이면 값 체크
						ch_map[nr+d*dx[dir]][nc+d*dy[dir]]=map[r][c];
						sum+= map[r][c];
					}else {
						// 구역 외이므로 false -1000 횟수 세기
						minus++;
					}*/
					
				}
			}
			int[][] info = new int[N][3];			
			for(int i =0; i<N; i++ ) {
				for(int j=0; j<3; j++) {
					info[i][j] = sc.nextInt();
				}
			}
			
			int troll = sc.nextInt();
			
			int [][]troll_map = new int[troll][2];
			for(int i=0; i<troll; i++) {
				troll_map[i][0] = sc.nextInt();
				troll_map[i][1] = sc.nextInt();

				map[troll_map[i][0]][troll_map[i][1]] = -1;
				
			}
			
			
			for(int i=0; i<N; i++) {
				int nr = info[i][0];
				int nc = info[i][1];
				int chance = info[i][2];
				int dir = 0;
				int d = 0;
				for(int j=0; j<chance ; j++) {
					// 방향
					dir = map[nr][nc]/10-1;
					
					// 거리
					d = map[nr][nc]%10;	
					
					nr = nr+d*dx[dir];
					nc = nc+d*dy[dir];
					
					
				}
				// 구역을 넘어가는 지 체크
				if(isOver(map,nr,nc,dir,d)) {
					// 구역 내이면 값 체크
					
					
				}else {
					// 구역 외이므로 false -1000 횟수 세기
					minus++;
				}
				
			}
			
			
			
			
//			System.out.println("sum:"+sum*100);
//			System.out.println("minus:"+minus*-1000);
			
			
			
			
			
			// 점프했을 때 구역 안에 있는 지 
			
			
		}
	}


	private static boolean isOver(int[][] map, int nr, int nc, int dir, int d) {
		
		// 경계 안에 존재한다면
		if(nr+d*dx[dir]>=0 && nr+d*dx[dir]<map.length && nc+d*dy[dir]>=0 && nc+d*dy[dir]<map.length)
		{
			return true;
		}
		
		
		return false;
	}

}
