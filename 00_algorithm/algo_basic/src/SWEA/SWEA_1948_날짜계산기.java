package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA_1948_날짜계산기 {
	

	private static int [] mPd = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\1948.txt"));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int TC = sc.nextInt();
		
		for(int t=1; t<=TC; t++) {
			sb.append("#").append(t).append(" ");
			int[] map = new int[4];
			int sum=0;
			for(int i=0; i<4; i++) {
				map[i] = sc.nextInt();
			}
			
			if(map[0] == map[2]) {
				sum = map[3]-map[1];
			}else {
				// 첫달
				sum += mPd[map[0]-1]-map[1];
				
				// 사이달
				for(int i=map[0]+1; i<map[2]; i++) {
					sum += mPd[i-1];
				}
				
				// 마지막 달
				sum += map[3];
			}
			
//			System.out.println(sum+1);
			sb.append(sum+1).append("\n");
			
		}
		
		System.out.println(sb);
		
		
		
	}

}
