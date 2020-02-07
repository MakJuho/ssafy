package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA_4615_오셀로게임 {

	private static int[] dx = {0,-1,-1,-1,0,1,1,1}; 
	private static int[] dy = {1,1,0,-1,-1,-1,0,1};
	
	class Pair{
		int x;
		int y;
		public Pair(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\4615.txt"));
		
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		
		for(int t=1; t<=TC; t++) {
			int N = sc.nextInt(); // 보드 판 크기
			int cnt = sc.nextInt(); // 횟수
			
			//보드판 생성 W = 2 B = 1
			int[][] board = new int [N][N];
			board[N/2-1][N/2-1] = 2;
			board[N/2-1][N/2] = 1;
			board[N/2][N/2-1] = 1;
			board[N/2][N/2] = 2;
					
			for(int i=0; i<cnt; i++) {
				
				Pair pos = null;
				pos.y = sc.nextInt()-1;
				pos.x = sc.nextInt()-1;
						
				int color = sc.nextInt(); // 1: 검정 , 2: 흰색

				for(int j=0; j<4; j++) {
//				1. 한칸만 이동해서 경계선 초과했는지 ? 0인지? 아니면 반대 색 돌을 가지고 있는지

					if(pos.x+dx[j]>=0 && pos.y+dy[j]>=0 && pos.x+dx[j] <N && pos.y+dy[j] < N) {
						
						// 주변 살폈을 때 0인가?
						if(board[pos.x+dx[j]][pos.y+dy[j]] == 0) {
							
						}else if(board[pos.x+dx[j]][pos.y+dy[j]] != color) {
						// 주변 바둑돌 색이 반대 색을 가지고 있는가?
						// 뭔가를 코딩	
						}
						
						
					}
				}
				
				// 방향 별로 탐색
//				2. 같은 색 나올 때까지 탐색
//				3. 같은 색 나오면 좌표를 기억해놨다가 시작 점부터 그 사이 좌표 색깔 모두 변경. for문 두번
			
				
				
				
			}
			
//			for(int i=0; i<board.length; i++) {
//				for(int j=0; j<board[i].length; j++) {
//					System.out.print(board[i][j]+" ");
//				}
//				System.out.println();
//			}
			
		}
		
	}

}
