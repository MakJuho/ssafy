package JungOl;

import java.util.Arrays;
import java.util.Scanner;

public class JA_1169_주사위던지기1 {
	
	private static int[] dice = {1,2,3,4,5,6};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		if(M == 1) {
			M1_permutation(N, 0, new int[N]);
		}
		if(M == 2) {
			M2_permutation(N, 0, new int[N], 1);
		}
		if(M == 3) {
			M3_permutation(N, 0, new int[N], new boolean[6]);
		}
	}
	private static void M1_permutation(int N, int cur, int[] temp) {
		
		if(cur==temp.length) {
			for(int i =0; i< temp.length; i++) {
				System.out.print(temp[i]+" ");
			}
			System.out.println( );
			
			return;
		}
		else {
			for(int i=0; i<dice.length; i++) {
				temp[cur] = dice[i];
				M1_permutation(N, cur+1, temp);	
			}
			
		}
	}
	
	private static void M2_permutation(int N, int cur, int[] temp, int before) {
		if(cur == N) {
			for(int i =0; i< temp.length; i++) {
				System.out.print(temp[i]+" ");
			}
			System.out.println( );
			return;
		}
		for(int i=before; i<=6; i++) {
			temp[cur] = i;
			M2_permutation(N, cur+1, temp, i);
		}
		
	}
	
	private static void M3_permutation(int N, int cur, int[] temp, boolean[] visited) {
		
		if(cur==temp.length) {
			
			for(int i =0; i< temp.length; i++) {
				System.out.print(temp[i]+" ");
			}
			System.out.println( );
			
			return;
		}
		else {
			for(int i=0; i<dice.length; i++) {
				if(!visited[i]) {
					visited[i] = true;
					temp[cur] = dice[i];
					M3_permutation(N, cur+1, temp, visited);
					visited[i] = false;
				}
			}
			
		}
		
		
		
				
	}

}
