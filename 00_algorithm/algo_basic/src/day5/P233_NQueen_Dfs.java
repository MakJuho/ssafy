package day5;

import java.util.Arrays;

public class P233_NQueen_Dfs {

	// 체스판 크기
	private static int size = 4;
	
	// 위 체스판에 queen을 각 행마다 배치할 수 있는지 리턴하시오.
	private static int [][]map = new int[size][size];
	
	private static boolean answer = false;
	
	// 적합한 행동인지 확인해보기.
	public static boolean isPromising() {
		for(int r=0; r<size; r++) {
			for(int c=0; c<size; c++) {
				if(map[r][c] ==1) {
					// 위로 쭉 가면서 수직 위와 대각선으로 체크
					for(int k=1; k<=r; k++) {
						if(map[r-k][c] == 1) {
							return false;
						}
						if(c-k>=0 && map[r-k][c-k]==1) {
							return false;
						}
						if(c+k <size && map[r-k][c+k]==1) {
							return false;
						}
					}
					
				}
			}
		}
		return true;
	}
	public static boolean isPromisingBacktracking(int row) {
		for(int r=0; r<row; r++) {
			for(int c=0; c<row; c++) {
				if(map[r][c] ==1) {
					// 위로 쭉 가면서 수직 위와 대각선으로 체크
					for(int k=1; k<=r; k++) {
						if(map[r-k][c] == 1) {
							return false;
						}
						if(c-k>=0 && map[r-k][c-k]==1) {
							return false;
						}
						if(c+k <size && map[r-k][c+k]==1) {
							return false;
						}
					}
					
				}
			}
		}
		return true;
	}
	
	public static void dfs(int row) {
		if(row == size ) {
			// 4개의 체스를 모두 놓았을 때
			if(isPromising()) {
			for(int [] line: map) {
				System.out.println(Arrays.toString(line));
				answer = true;
			}
			
			System.out.println("배치 가능하다");
			return ;
			}
		}else {
			// 순차적으로 하나씩 넣어본다.
			for(int c=0; c<size; c++) {
				map[row][c]=1;
				dfs(row+1); // 다음 줄에 놓는다.
				map[row][c] = 0;
			}
		}
		
		
	}
	
	public static void dfsBacktracking(int row) {
		if(row == size ) {
			// 4개의 체스를 모두 놓았을 때
			if(isPromising()) {
			for(int [] line: map) {
				System.out.println(Arrays.toString(line));
				answer = true;
			}
			
			System.out.println("배치 가능하다");
			//System.exit(0);
			return ;
			}
		}else {
			// 순차적으로 하나씩 넣어본다.
			for(int c=0; c<size; c++) {
				map[row][c]=1;

				if(isPromisingBacktracking(row+1)) // 다음 줄에 놓는다.
					dfsBacktracking(row+1);
				map[row][c] = 0;
			}
		}
		
		return;
		
		
	}
	
	public static void main(String[] args) {
		/*dfs(0);
		if(answer) {
			System.out.println("배치 가능하다.");
		}else {
			System.out.println("배치 불가능 하다.");
		}*/
		dfsBacktracking(0);
	}

}
