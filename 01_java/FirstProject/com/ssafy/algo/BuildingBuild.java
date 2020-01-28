package com.ssafy.algo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class BuildingBuild {

	private static int[][] dir = {{+1,0}, {+1,-1}, {0,-1}, {-1,-1}, {-1,0}, {-1,+1}, {0,+1}, {+1,+1}};
	
	static int checkAroundGreen(char[][] map) {
		
		int max = Integer.MIN_VALUE;
		int rlt = 0;
		
		for(int r=0; r<map.length; r++ ) {
			for(int c=0; c<map[r].length; c++) {
				max = Integer.MIN_VALUE;
				if(map[r][c] =='G') 
					continue;
				
				int rev = 0;
				for(int dir_cnt=0; dir_cnt<dir.length; dir_cnt++) {
					if(r+dir[dir_cnt][0]>=0 && r+dir[dir_cnt][0]<map.length && c+dir[dir_cnt][1]>=0 && c+dir[dir_cnt][1]<map.length)
					{
						if(map[r+dir[dir_cnt][0]][c+dir[dir_cnt][1]] == 'G') {
							rev = -1;
							break;	
						}
						
					}
				}
				
				if(rev == -1)
					continue;
				
				int fixed_row= r;
				int fixed_col= c;
				int building_sum = 0;
				for(int building_r = 0; building_r<map.length; building_r++) {
					if(map[building_r][fixed_col]=='B') {
						building_sum++;
					}
					if(map[fixed_row][building_r]=='B') {
						building_sum++;
					}
				}
				
				if( max < building_sum-1) {
					rlt = building_sum-1;
				}
				
				
			}
		}
		
		return rlt;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\Solution12.txt"));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int TC = sc.nextInt();
		
		for(int t=1; t<=TC; t++) {
			sb.append("#").append(t).append(" ");
			int N = sc.nextInt();
			char [][]map = new char[N][N];
			
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					map[r][c] = sc.next().charAt(0);
				}
			}
			
//			for(int r=0; r<N; r++) {
//				for(int c=0; c<N; c++) {
//					System.out.print(map[r][c]+" ");
//				}
//				System.out.println(" ");
//			}
			
			
			sb.append(checkAroundGreen(map)).append("\n");
	
	
		}
		System.out.println(sb);
	}

}
