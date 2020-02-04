package SWExpert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA_2805_농작물수확하기 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\2805.txt"));
		Scanner sc =  new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int TC = sc.nextInt();
		
		for(int t=1 ; t<=TC; t++) {
			sb.append("#").append(t).append(" ");
			int N = sc.nextInt();
			int [][] map = new int[N][N];
			int sum=0;
			
			for(int r=0; r<N; r++) {
				String temp = sc.next();
				for(int c=0; c<N; c++) {
					map[r][c]= Character.getNumericValue(temp.charAt(c));
				}
			}
		
			int reverse = 0;
			int cnt=0;
			for(int r=0; r<N; r++) {
				
				if(r<=N/2) {
					
					for(int c=N/2-cnt; c<=N/2+cnt; c++) {
						sum+= map[r][c];
						//System.out.println(map[r][c]);
					}
					cnt++;
				
					
				}else {
					if(reverse == 0) {
						cnt=cnt-2;
						reverse=1;
					}
					
					for(int c=N/2-cnt; c<=N/2+cnt; c++) {
						sum+= map[r][c];
						//System.out.println(map[r][c]);
					}
					cnt--;
					
				}
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
		
	}

}
