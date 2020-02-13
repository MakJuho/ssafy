package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA_1209_Sum {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("res\\1209.txt"));
		Scanner sc=  new Scanner(System.in);
		StringBuilder sb = new StringBuilder(); 
		int TC = 10;
		
		for(int t=1; t<=TC; t++) {
			int a = sc.nextInt();
			sb.append("#").append(t).append(" ");
			int [][]map = new int[100][100];
			
			int sum = 0;
			int max = Integer.MIN_VALUE;
			
			for(int r=0; r<100; r++) {
				for(int c=0; c<100; c++) {
					map[r][c] = sc.nextInt();
				}
			}
			
			for(int r=0; r<100; r++) {
				for(int c=0; c<100; c++) {
					sum += map[r][c];
				}
				
				if(max < sum) {
					max = sum;
				}
				sum =0;

			}
			
			
			for(int r=0; r<100; r++) {
				for(int c=0; c<100; c++) {
					sum += map[c][r];
				}
				
				if(max < sum) {
					max = sum;
				}
				sum =0;

			}
			
			for(int i=0; i<100; i++) {
				sum += map[i][i];
				
			}
			if(max< sum) {
				max = sum;
				
			}
			sum =0;
			
			for(int i=99; i>=0; i--) {
				sum += map[i][i];
			}
			if(max < sum) {
				max = sum;
			}
			sum =0;
			sb.append(max).append("\n");
			
		}
		
		System.out.println(sb);
		
	}

}
