package algo_basic.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA_1210_D4_Ladder1 {

	private static int[] dx = {0,0,-1}; // 좌, 우, 상
	private static int[] dy = {-1,1,0}; // 좌, 우, 상
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\1210.txt"));
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			int TC = sc.nextInt();
			int goal_index =0;
			int [][] map = new int[100][100];
			
			for(int r=0; r<100; r++) {
				for(int c=0; c<100; c++) {
					map[r][c] = sc.nextInt();
				}
			}
			
			for(int index=0; index<100; index++) {
				if(map[99][index]==2) {
					goal_index = index;
				}
			}
			
			int cx = 100;
			int cy = goal_index;
			

			if(isCheck(map,cx,cy)==0) { // 좌
				
			}else if(isCheck(map,cx,cy)==1) { // 우
				
			}
			// 좌, 우 살피고 0이면 위로 올리기
			else {
				map[start_x][start_y]
			}
		}
		
	}

	private static int isCheck(int[][] map,int cx, int cy) {
		if(map[cx+dx[0]][cy+dy[0]]==1) { // 좌
			return 0;
		}
		else if(map[cx+dx[0]][cy+dy[0]]==1) { // 우
			return 1;
		}
		
		return 2; // 상
	}

}
