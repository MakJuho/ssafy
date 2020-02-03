package JungOl;

import java.util.Arrays;
import java.util.Scanner;

public class JA_1175_주사위던지기2 {

	private static int[] nums = {1,2,3,4,5,6};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] temp = new int[N];
		
		Dice(N, M, 0, temp );
		
	}
	
	static void Dice(int N, int M, int cur, int[] temp) {
		
		int tot = 0;
		// N개 만큼 값을 가졌을 때
		if(cur == N) {
			for(int i=0; i<temp.length; i++) {
				tot+=temp[i];
			}
			if(tot == M) {
				for(int j=0; j<temp.length; j++)
					System.out.print(temp[j]+" ");
				System.out.println();
			}
		}
		else {
			for(int i=0; i<nums.length; i++) {
				temp[cur] = nums[i];
				Dice(N, M, cur+1, temp);
				
			}
			
		}
		
	}
	
	

}
