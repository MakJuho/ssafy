package day5;

import java.util.Arrays;

public class P238_PowersetBacktracking {
	
	static char[] src = {'A', 'B', 'C'};
	// 위 배열의 멱 집합을 모두 출력하시오.
	static boolean[] child = {true, false};
	
	//각 원소의 포함 여부를 저장할 배열
	static boolean [] status = new boolean[src.length];
	
	public static void dfs(int n, int r) {
		if(r == n) {
			System.out.print(Arrays.toString(status) +" : ");
			for(int i=0; i<status.length; i++) {
				if(status[i]) {
					System.out.print(src[i]);
				}
			}
			System.out.println();
		}else {
			for(int i=0; i<child.length; i++) {
				status[r] = child[i];
				dfs(n, r+1);	
			}
			
			
			
		}
	}
	
	public static void main(String[] args) {
		
		dfs(3,0);
		
		
	}
}
