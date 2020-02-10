package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_1873_상호의배틀필드 {

	private static char[] pos = {'>','<','v','^'};
	private static int[] dx = {0,0,1,-1};
	private static int[] dy = {1,-1,0,0};
	private static int n=0,m=0;
	private static char[][] map;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\1873.txt"));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int TC = sc.nextInt();
		for(int t=1; t<=TC; t++)
		{
			sb.append("#").append(t).append(" ");
			n = sc.nextInt();
			m = sc.nextInt();
			
			map = new char[n][m];
			
			for(int r=0; r<n; r++) {
				String tmp = sc.next();
				for(int c=0; c<m; c++) {
					map[r][c] = tmp.charAt(c);
				}
			}
			
			/*for(int r=0; r<n; r++) {
				//String tmp = sc.next();
				for(int c=0; c<m; c++) {
					System.out.print(map[r][c]+" ");
				}
				System.out.println();
			}*/
			
			

			int cmd = sc.nextInt();
			
			Queue<Character> queue = new LinkedList<Character>();
			String cmdString = sc.next();
			
			
			
			for(int i=0; i<cmd; i++) {
				queue.add(cmdString.charAt(i));	
			}
			int cur_x=0;
			int cur_y=0;
			// 시작위치 찾기
			for(int r=0; r<n; r++) {
				for(int c=0; c<m; c++) {
					for(int dir=0; dir<4; dir++) {
						if(map[r][c] == pos[dir]) {
							cur_x = r;
							cur_y = c;
							//System.out.println("start Point:"+map[r][c]);
						}
					}
				}
			}
			
			char cur_shape=map[cur_x][cur_y];
			
			while(!queue.isEmpty()) {
				/*for(int r=0; r<n; r++) {
					//String tmp = sc.next();
					for(int c=0; c<m; c++) {
						System.out.print(map[r][c]+" ");
					}
					System.out.println();
				}
				System.out.println();*/
				
				char key = queue.poll();
				
				
				
				switch (key) {
				case 'U':
					cur_shape='^';
					map[cur_x][cur_y] = cur_shape;
					
					if(isOut(cur_x-1,cur_y))
					//if(cur_x-1<0)
						continue;
					
					if(map[cur_x-1][cur_y] == '.') {
						map[cur_x][cur_y] = '.';
						cur_x = cur_x-1;
						map[cur_x][cur_y] = cur_shape;
					}
					break;

				case 'D':
					cur_shape='v';
					map[cur_x][cur_y] = cur_shape;
					
					if(isOut(cur_x+1,cur_y))
						continue;
					
					if(map[cur_x+1][cur_y] == '.') {
						map[cur_x][cur_y] = '.';
						cur_x = cur_x+1;
						map[cur_x][cur_y] = cur_shape;
					}
					
					break;
					
				case 'L':
					cur_shape='<';
					map[cur_x][cur_y] = cur_shape;
					
					if(isOut(cur_x,cur_y-1))
						continue;
					
					if(map[cur_x][cur_y-1] == '.') {
						map[cur_x][cur_y] = '.';
						cur_y = cur_y-1;
						map[cur_x][cur_y] = cur_shape;
					}
					break;
					
				case 'R':
					cur_shape='>';
					map[cur_x][cur_y] = cur_shape;
					
					if(isOut(cur_x,cur_y+1))
						continue;
					
					if(map[cur_x][cur_y+1] == '.') {
						map[cur_x][cur_y] = '.';
						cur_y = cur_y+1;
						map[cur_x][cur_y] = cur_shape;
					}
					break;
					
				case 'S':
					// 포탄을 발사해 벽돌로 만든 벽을 없애고 평지로 만든다.
					// 만약에 강철로 만들어 져있다면 아무것도 진행되지 않는다.
					/*private static char[] pos = {'>','<','v','^'};
					private static int[] dx = {0,0,1,-1};
					private static int[] dy = {1,-1,0,0};*/
					int misile_x = cur_x;
					int misile_y = cur_y;
					if(cur_shape == pos[0])
					{
						
						misile_func(misile_x, misile_y, 0);
						
					}
					if(cur_shape == pos[1])
					{
						misile_func(misile_x, misile_y, 1);
					}
					if(cur_shape == pos[2])
					{
						misile_func(misile_x, misile_y, 2);
					}
					if(cur_shape == pos[3])
					{
						misile_func(misile_x, misile_y, 3);
					}
					
					
					break;

				
				}
				
				
			}
			
			for(int r=0; r<n; r++) {
				for(int c=0; c<m; c++) {
					sb.append(map[r][c]);
				}
				sb.append("\n");
			}
			
			
			
			
		}
		
		System.out.println(sb);
		
	}

	private static void misile_func(int misile_x, int misile_y, int c) {
		// TODO Auto-generated method stub
		while(misile_x+dx[c] < n && misile_x+dx[c] >=0 && misile_y+dy[c] <m && misile_y+dy[c] >=0) {
			//System.out.println(map[0][0]);
			
			// .이나 물을 만났을 떄는 그냥 투과
			if(map[misile_x+dx[c]][misile_y+dy[c]] == '.' || map[misile_x+dx[c]][misile_y+dy[c]] == '-') {
				misile_x= misile_x+dx[c];
				misile_y= misile_y+dy[c];
				continue;
			}
			// *이면 격파하고 그자리 .으로 채움
			if(map[misile_x+dx[c]][misile_y+dy[c]] == '*') {
				map[misile_x+dx[c]][misile_y+dy[c]] = '.';
				break;
			}
			// #을 만났을 경우 break
			if(map[misile_x+dx[c]][misile_y+dy[c]] == '#') {
				break;
			}
		}
	}
	
	public static boolean isOut(int i, int j) {
		return !(i>=0 && j>=0 && i<n && j<m);
	}

}
