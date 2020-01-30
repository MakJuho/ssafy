package day4;

public class PermutationTest {
	
	private static char [] src = {'A', 'B', 'C', 'D'};
	
	public static void main(String[] args) {
		// src의 원소 중 3개를 선택하는 순열을 만들어보자.!
		makePermutation(3, 0, new char[3], new boolean[src.length]);
	}
	
	// int r : 몇 개를 선택해야하는 지?
	// int current : 현재 진행되고 있는 depth
	// char [] temp : 선택된 요소들
	// boolean [] visited : 방문 이력
	public static void makePermutation(int r, int current, char[] temp, boolean[] visited){
		
		//base case
		if( r == current) {
			System.out.println(temp);
			return ;
		}
		
		//recur case
		else {
			// 사용 가능한 요소가 있다면 가보자!!
			for(int i=0; i<src.length; i++) {
				if(!visited[i]) {	 			// 방문 여부 체크
					visited[i] = true;			// 방문 처리
					temp[current] = src[i]; 	// 사용
					makePermutation(r, current+1, temp, visited);
					visited[i] = false;
				}
			}
		}
		
	}	
}
