package algo_basic.day1;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_2063_D1_중간값찾기 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		
		int cnt = sc.nextInt();
		
		int[] src = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			src[i] = sc.nextInt();
		}
		
		Arrays.sort(src);
	
		System.out.println(src[src.length/2]);
		
		
	}
	
	
	
}
