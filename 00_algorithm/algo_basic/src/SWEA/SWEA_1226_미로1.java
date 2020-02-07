package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_1226_미로1 {

	private static int [] dx = {0,1,0,-1};
	private static int [] dy = {1,0,-1,0};
	private static int [][] map= new int[16][16];
			
	private static List<Pair>[] graph;
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("res\\1226.txt"));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int TC = 10;
	
		for(int t=1; t<=10; t++) {
			sb.append("#").append(t).append(" ");
			int k= sc.nextInt();
			
			for(int r=0; r<16; r++) {
				String tmp = sc.next();
				for(int c=0; c<16; c++) {
					map[r][c] = tmp.charAt(c)-'0';
				}
			}
			
			
			/*for(int r=0; r<16; r++) {
				for(int c=0; c<16; c++) {
					System.out.print(map[r][c]+" ");
				}
				System.out.println();
			}*/
			
			boolean anw = bfs();
			if(anw) {
				sb.append(1).append("\n");
			}else {
				sb.append(0).append("\n");
			}
		}
		System.out.println(sb);
	}

	
	public static boolean bfs() {
		
		Queue<Pair> queue = new LinkedList<>();
		
		
		Pair pos = new Pair(1,1);
		
		boolean visited[][] = new boolean[16][16];

		
		/*1. 시작점 1,1로 지정
		2. 우하좌상을 검색해서 0인 곳을 검색한다.
		3. 0이면 pos.x, pos.y 값을 변경 - 위치 이동
		4. 위치 이동할 때마다 queue에 값 add / 자식이 있으면 자기자신을 빼면서 큐에 넣어준다./ visited 배열에 true를 한다.
		5. 다 막혀있으면 뺴주기만 한다.
		6. 큐에서 빼는 값이 -> 3일 때까지 반복한다. <-> 없으면 못찾음.*/
		 
		// 시작
		queue.add(pos);
		
		//System.out.println(pos);
		while(!queue.isEmpty()) {
	
			
			pos = queue.poll(); // 큐에서 제거
			//System.out.println(pos);
			visited[pos.x][pos.y]=true; // 해당 위치에 참
			
			for(int i=0; i<4; i++) {
				
				// visited가 false이고, 길이 있을 때
				if(!visited[pos.x+dx[i]][pos.y+dy[i]] && map[pos.x+dx[i]][pos.y+dy[i]]==0) {
					
					Pair pos2 = new Pair(pos.x+dx[i], pos.y+dy[i]);
					
					/*pos.x = pos.x+dx[i]; // 이동
					pos.y = pos.y+dy[i];*/
					
					
					queue.add(pos2); // 위치 큐에 추가.
					
				// visited가 true일 때
				}else if(visited[pos.x+dx[i]][pos.y+dy[i]]) {
					continue;
				// 길이 막혀있을 때
				}else if(map[pos.x+dx[i]][pos.y+dy[i]] ==1) {
					
					continue;
				// 값을 찾았을 때
				}else if(map[pos.x+dx[i]][pos.y+dy[i]] ==3) {
					return true;
				}
				
			}
		}
			
		return false;
	}
	
	
	static class Pair{
		int x;
		int y;
		
		public Pair(int x, int y) {
		
			this.x = x;
			this.y = y;
		}
		
		@Override
		public String toString() {
			return "Pair [x=" + x + ", y=" + y + "]";
		}
	}
}
