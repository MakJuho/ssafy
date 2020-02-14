package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA_1861_정사각형방 {

	private static int[] dx = {0,1,0,-1};
	private static int[] dy = {1,0,-1,0};
	private static int [][]map; 
	private static int [][]temp;
	private static boolean flag;
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("res\\1861.txt"));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int TC = sc.nextInt();
		
		for(int t=1; t<=TC; t++) {
			sb.append("#").append(t).append(" ");
			int N = sc.nextInt();
			map = new int [N][N];
			temp = new int [N][N];
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					map[r][c] = sc.nextInt();
					
				}
			}
			
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					
					flag = false;
					dfs(r,c, r, c, 0, N);
					
					
					
					
					
				}
			}
			
			
			
			int max = Integer.MIN_VALUE;
			int room_num = 9999999;
			int rlt_x =0;
			int rlt_y =0;
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					
//					System.out.print(temp[r][c]+" ");
					if(temp[r][c] > max ) {
						
						max = temp[r][c];
						
						room_num = map[r][c];
						rlt_x = r;
						rlt_y = c;
						
					}else if(temp[r][c] == max && room_num > map[r][c]) {
						
						room_num = map[r][c];
						rlt_x = r;
						rlt_y = c;
					}
					
				}
//				System.out.println();

				
			}
			sb.append(room_num).append(" ").append(temp[rlt_x][rlt_y]).append("\n");
//			System.out.print("방 번호: "+room_num+" ");
//			System.out.println("방 개수: "+temp[rlt_x][rlt_y]);
		}
		System.out.println(sb);
	}
	
	private static void dfs(int r, int c, int nr, int nc, int dir_cnt, int N) {
		
		
		
		for(int dir=0; dir<4; dir++) {
			if(flag) {
				return;
			}
			if(!isOut(nr+dx[dir], nc+dy[dir], N) && map[nr+dx[dir]][nc+dy[dir]] == map[nr][nc] + 1) {
				
				dfs(r, c ,nr+dx[dir], nc+dy[dir], dir_cnt+1, N);
			
			}
		}
		
		if(temp[r][c] < dir_cnt+1)
			temp[r][c] = dir_cnt+1;
		flag = true;
		return;
		
		
	}	
	
	private static boolean isOut(int x, int y, int N) {
		return !(x>=0 && y>=0 && x<N && y<N);
	}

}
