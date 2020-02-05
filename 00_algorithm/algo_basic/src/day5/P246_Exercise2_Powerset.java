package day5;

import java.util.Arrays;

public class P246_Exercise2_Powerset {
	
	static int[] arr = {1,2,3,4,5,6,7,8,9,10};
	
	static boolean[] child = {true, false};
	
	static boolean [] status = new boolean[arr.length];
	
	public static void dfs(int r, int n) {
		
		if( r== n) {
			
			int sum =0;
			
			for(int i=0; i<status.length; i++) {
				if(status[i]) {
					sum += arr[i];
				}
			}
			//System.out.print(" "+sum);
			if(sum == 10) {
				for(int i=0; i<status.length; i++) {
					if(status[i]) {
						System.out.print(arr[i]+" ");
						
					}
					
				}
				System.out.println();
			}
		
			return ;
			
		}else {
			for(int i=0; i<child.length; i++) {
				status[r] = child[i];
				dfs(r+1, n);
			}
		}
	}
	
	
	public static void main(String[] args) {
		dfs(0,10);
	}
	
	
}
