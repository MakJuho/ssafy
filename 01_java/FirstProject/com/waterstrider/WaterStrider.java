package com.waterstrider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WaterStrider {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\Solution21.txt"));
		Scanner sc = new Scanner(System.in); // keyboard 입력
		StringBuilder sb = new StringBuilder();
		int TC = sc.nextInt();
		
		for(int t = 1; t <=TC; t++) {
			sb.append("#").append(t).append(" ");
			int N = sc.nextInt();
			int[][] lake = new int[N][N]; // 호수 크기
			int rlt = 0;
			int S = sc.nextInt(); // 소금쟁이 수
			
			int[][] strider = new int[S][3];
			for(int k=0; k < S; k++) {
				strider[k][0] = sc.nextInt(); // 행
				strider[k][1] = sc.nextInt(); // 열
				strider[k][2] = sc.nextInt(); // 방향  하:1, 우:2
				
			}
			
			
			
//			System.out.println(lake.length);
			// 소금쟁이 뛰기 시작
			// 시작점은 -1
			// 뛰는 자국 +1
			for(int cnt=0; cnt<S; cnt++) {
				lake[strider[cnt][0]][strider[cnt][1]] = -1;
						
				// 하
				if(strider[cnt][2] == 1) {
					
					if(strider[cnt][0]+3 < lake.length) {
						if(lake[strider[cnt][0]+3][strider[cnt][1]] == 1 || lake[strider[cnt][0]+3][strider[cnt][1]] == -1 )
							rlt = cnt+1;
							
						else {
							lake[strider[cnt][0]+3][strider[cnt][1]] = 1;
						}
					}
					
					if(strider[cnt][0]+5 < lake.length) {
						if(lake[strider[cnt][0]+5][strider[cnt][1]] == 1 || lake[strider[cnt][0]+5][strider[cnt][1]] == -1)
							rlt = cnt+1;
//							System.out.println("cnt:"+(cnt+1));
						else {
							lake[strider[cnt][0]+5][strider[cnt][1]] = 1;
						}
					}
					
					
					if(strider[cnt][0]+6 < lake.length) {
						if(lake[strider[cnt][0]+6][strider[cnt][1]] == 1 || lake[strider[cnt][0]+6][strider[cnt][1]] == -1)
							rlt = cnt+1;
//							System.out.println("cnt:"+(cnt+1));
						else {
							lake[strider[cnt][0]+6][strider[cnt][1]] = 1;
						}
					}
					
				// 우
				}else if(strider[cnt][2] == 2) {
				
					if(strider[cnt][1]+3 < lake.length) {
						if(lake[strider[cnt][0]][strider[cnt][1]+3] == 1 || lake[strider[cnt][0]][strider[cnt][1]+3] == -1)
							rlt = cnt+1;
//							System.out.println("cnt:"+(cnt+1));
						else {
							lake[strider[cnt][0]][strider[cnt][1]+3] = 1;
						}
					}
					
					if(strider[cnt][1]+5 < lake.length) {
						if(lake[strider[cnt][0]][strider[cnt][1]+5] == 1 || lake[strider[cnt][0]][strider[cnt][1]+5] == -1)
							rlt = cnt+1;
//							System.out.println("cnt:"+(cnt+1));
						else {
							lake[strider[cnt][0]][strider[cnt][1]+5] = 1;
						}
					}
					
					if(strider[cnt][1]+6 < lake.length) {
						if(lake[strider[cnt][0]][strider[cnt][1]+6] == 1 || lake[strider[cnt][0]][strider[cnt][1]+6] == -1)
							rlt = cnt+1;
//						System.out.println("cnt:"+(cnt+1));
						else {
							lake[strider[cnt][0]][strider[cnt][1]+6] = 1;
						}
					}
					
					
				}
				
//				if(t == 1) {
//					for(int r=0; r<lake.length ; r++) {
//						for(int c=0; c<lake.length; c++) {
//							System.out.print(lake[r][c]+" ");
//						}
//						System.out.println(" ");
//						
//					}
//					System.out.println(" ");
//				}
				
			}
			sb.append(rlt).append("\n");
			
		}	
		System.out.println(sb);
	}
}
