package SWExpert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA_2005_파스칼의삼각형 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\2005.txt"));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int TC = sc.nextInt();
		
		for(int t=1; t<=TC; t++) {
			int N = sc.nextInt();
			int [][]map = new int[N][N];
			
			sb.append("#").append(t).append("\n");
			
			for(int r=0; r<N; r++) {
				
				// 0열 초기화
				map[r][0] = 1;
				
				for(int c=1; c<r; c++) {
					map[r][c] = map[r-1][c-1]+map[r-1][c];
				}
				
				// 마지막 열 초기화
				map[r][r] = 1;
				
			}
			
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					if(map[r][c] != 0) 
						sb.append(map[r][c]+" ");
				}
				sb.append("\n");
			}
			
		}
		System.out.println(sb);
		
		
	}

}
