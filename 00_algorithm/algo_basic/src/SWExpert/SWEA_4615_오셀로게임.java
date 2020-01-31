package SWExpert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA_4615_오셀로게임 {

	private static int[] dx = {0,-1,-1,-1,0,1,1,1}; 
	private static int[] dy = {1,1,0,-1,-1,-1,0,1};
	
	
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
				int r = sc.nextInt()-1;
				int c = sc.nextInt()-1;
				int color = sc.nextInt();
				
				// 확인 후 조건이 맞는 다면 바둑돌을 둔다.
				//board[r][c] = color;
				for(int dir=0; dir<dx.length; dir++) {
					// 경계선 초과 했는가? 바둑돌이 없는가(0인지?)? 있다면 그 방향에 같은 색의 바둑돌이 나오는가?
					if((r+dx[dir]) < N && (c+dy[dir]) < N && (r+dx[dir]) >=0 && (c+dy[dir]) >=0 
							&& board[r+dx[dir]][c+dy[dir]]!=0) {
						
//						int goalDolColor = board[r+dir][c+dir]; // 목표 돌 색깔
						int nr=r, nc=c;
						
						while(color != board[nr][nc]) {
							
							nr +=dx[dir];
							nc +=dy[dir];
							
							// 찾는 게 범위 확인
							if(nr < N && nc < N && nr >=0 && nc >=0) {
								if(board[nr][nc] == 0) // 돌이 존재하지 않을때
									break;
								else {
									//확정
									board[nr][nc] = color;
									board[r][c] = color;
									for(int k=0; k<board.length; k++) {
										for(int j=0; j<board[k].length; j++) {
											System.out.print(board[k][j]+" ");
										}
										System.out.println();
									}
									System.out.println();
									
								}
							}else {
								// 범위초과
								break;
							}
							
							
							
						}
						
						
						
					}else
						continue;
					
		
				}
			
				
				
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
