package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA_2001_파리퇴치 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\2001.txt"));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int TC = sc.nextInt();
		
		for(int t=1; t<=TC; t++) {
			sb.append("#").append(t).append(" ");
			int N = sc.nextInt(); // 파리 공간
			int M = sc.nextInt(); // 파리채 크기
			
			int [][]map = new int[N][N];
			
			for(int r=0; r<map.length; r++) {
				for(int c=0; c<map[r].length; c++) {
					map[r][c] = sc.nextInt();
					
				}
			}
			
			// 파리채 크기로 sum 구해서 비교
			int tot = Integer.MIN_VALUE;
			int sum = 0;
			
			
			for(int r=0; r<map.length-M+1; r++) {
				for(int c=0; c<map.length-M+1; c++) {
					
					for(int a=0; a<M; a++) {
						for(int b=0; b<M; b++) {
							sum += map[r+a][c+b];
						}
					}
					if(tot < sum) {
						tot = sum;
					}
				
					sum =0;
					
				}
			}
			
//			System.out.println(tot);
			sb.append(tot).append("\n");
			
		}
		
		System.out.println(sb);
	}

}
