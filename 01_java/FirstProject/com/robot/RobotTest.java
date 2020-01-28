package com.robot;

import java.io.FileInputStream;
import java.util.Scanner;

public class RobotTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\Solution11.txt"));
		Scanner sc = new Scanner(System.in); // keyboard 입력
		StringBuilder sb = new StringBuilder();
		int TC = sc.nextInt();
		
		for(int t=0; t<TC; t++) {
			sb.append("#").append(t).append(" ");
			
			int len = sc.nextInt();
			
			char [][] map = new char [len][len];
			
			for(int r =0; r<map.length; r++) {
				for(int c=0; c<map[r].length; c++) {
					map[r][c] = sc.next().charAt(0);
				}
			}
			for(int r =0; r<map.length; r++) {
				for(int c=0; c<map[r].length; c++) {
					System.out.print(map[r][c]+" ");
				}
				System.out.println(" ");
			}
			
			System.out.println(checkBot(map));
		
		}
	}
	
static int checkBot(char[][] map) {
		
		int A_sum=0;
		int B_sum=0;
		int C_sum=0;
		int nc=0, nr =0;
		for(int r=0; r<map.length; r++) {
			for(int c=0; c<map[r].length; c++) {
				
				nc = c;
				nr = r;
				
				if(map[r][c] == 'A') {
					nc = c;
					nr = r;
					while(nc+1 < map[r].length && map[r][nc+1] == 'S' ) {
						
						A_sum ++;
						nc = nc+1;
						
					}
					
				}else if(map[r][c] == 'B') {
					nc = c;
					nr = r;
					// 오른쪽
					while(map[r][nc+1] == 'S' && nc < map[r].length) {

						B_sum++;
						nc = nc+1;
						
					}
					
					// 왼쪽
					nc = c;
					nr = r;
					while(nc > 0 && map[r][nc-1] == 'S' && nc < map.length-1 ) {
						
						B_sum++;
						nc = nc-1;
					}
					
				}else if(map[r][c] == 'C') {
					// 오른쪽
					nc = c;
					nr = r;
					while(nc < map.length-1 && map[r][nc+1] == 'S' ) {
						
						C_sum ++;
						nc = nc + 1;
					}
					
					// 왼쪽
					nc = c;
					nr = r;
					while(map[r][nc-1] == 'S' && nc < map.length-1 && nc >= 0) {
						
						C_sum++;
						nc = nc -1;
					}
					nc = c;
					nr = r;
					// 아래
					while(map[nr+1][c] == 'S' && nr < map.length-1) {
						
						C_sum ++;
						nr = nr+1;
					}
					nc = c;
					nr = r;
					// 위
					while(map[nr-1][c] == 'S' && nr < map.length-1) {
					
						C_sum ++;
						nr = nr-1;
					}
				}
			}
		}
		System.out.println("A_sum:"+A_sum);
		System.out.println("B_sum:"+B_sum);
		System.out.println("C_sum:"+C_sum);
		return A_sum;
		
	}

}
