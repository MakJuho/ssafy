package day6;

import java.util.Arrays;

public class Permutation_Recur {

	static char [] candidates = {'A', 'B', 'C'};
	
	static boolean [] visited = new boolean[candidates.length];
	
	public static void main(String[] args) {
		// candidates의 원소 3개를 이용해서 만들 수 있는 순열을 출력하시오.
		
		// 방문 했는 지 안했는 지 확인.
		dfs(new char[candidates.length], 0);
		
	}
	
	public static void dfs(char[] temp, int r) {
		if(r == candidates.length) {
			printSolution(temp);
		}else {
			for(int i=0; i<candidates.length; i++) {
				if(!visited[i]) {
					visited[i] = true;
					temp[r] = candidates[i];
					dfs(temp, r+1);
					visited[i] = false;
				}
			}
		}
	}
	
	
	private static void printSolution(char[] temp) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(temp));
	}

	
}
