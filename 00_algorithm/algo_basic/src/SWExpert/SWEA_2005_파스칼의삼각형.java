package SWExpert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA_2005_파스칼의삼각형 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\2005.txt"));
		Scanner sc = new Scanner(System.in);
		
		int TC = sc.nextInt();
		
		for(int t=1; t<=TC; t++) {
			int N = sc.nextInt(); // 보드의 한변 길이
			int M = sc.nextInt(); // 플레이어가 돌을 놓는 횟수
			
			int [][]map = new int[N][N];
			// 백돌 2, 흑돌 1 초기상태
			/*
			 * 2,2,W 2,3,B 3,2,B 3,3,W
			 */
			
			map[N/2-1][N/2-1] = 2;
			map[N/2-1][N/2] = 1;
			map[N/2][N/2-1] = 1;
			map[N/2][N/2] = 2;
					
			
			for(int i=0; i<M; i++) {
				
			}
		}
	}

}
