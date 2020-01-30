package SWExpert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA_1948_날짜계산기 {
	

	private static int [] mPd = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\1948.txt"));
		Scanner sc = new Scanner(System.in);
		
		int TC = sc.nextInt();
		
		for(int t=0; t<TC; t++) {
			int[] map = new int[4];
			int sum=0;
			for(int i=0; i<4; i++) {
				map[i] = sc.nextInt();
			}
			
			if(map[0] == map[2]) {
				sum = map[3]-map[1];
			}else {
				// 첫달
				sum += mPd[map[0]]-map[1];
				
				// 사이달
				for(int i=map[0]+1; i<map[2]; i++) {
					sum += mPd[i];
				}
				// 마지막 달
				sum += map[3];
			}
			
			System.out.println(sum);
			
		}
		
		
		
	}

}
