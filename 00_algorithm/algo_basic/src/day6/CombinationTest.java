package day6;

import java.util.Arrays;



public class CombinationTest {

	public static char[] chars = { 'A', 'B', 'C', 'D' };
	
	public static void main(String[] args) {
		// 4개의 원소에서 2개를 선택하는 순열을 구하시오.
		int r =2;
//		makePermutation(r, new char[r], 0, new boolean[chars.length]);
//		makeCombinationByIter();
		makeCombination(r, new char[r], 0, 0);
	}

	public static void makeCombinationByIter() {
		for(int i=0; i<chars.length; i++) {
			for(int j=i+1; j<chars.length; j++) {
				System.out.println(chars[i]+" : "+chars[j]);
			}
		}
	}
	
	public static void makeCombination(int r, char[] temp, int ti, int next) {
		
		if( ti == r) {
			System.out.println(Arrays.toString(temp));
			return;
		}
		else {
			for(int i=next; i<chars.length; i++) {
				temp[ti] = chars[i];
				makeCombination(r, temp, ti+1, i+1);
			}
		}
	}
	
	public static void makePermutation(int r, char[] temp, int ti, boolean [] visited) {
		
		if( ti == r) {
			System.out.println(Arrays.toString(temp));
			return;
		}
		else {
			for(int i=0; i<chars.length; i++) {
				if(!visited[i]) {
					visited[i] = true;
					temp[ti] = chars[i];
					makePermutation(r, temp, ti+1, visited);
					visited[i] = false;
				}
			}
			
		}
	}
	
}
