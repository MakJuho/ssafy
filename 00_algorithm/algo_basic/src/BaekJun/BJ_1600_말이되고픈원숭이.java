package BaekJun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_1600_말이되고픈원숭이 {

	private static int[] mon_dx = {0,1,0,-1};
	private static int[] mon_dy = {1,0,-1,0};
	private static int[] hor_dx = {1,2,2,1,-1,-2,-2,-1};
	private static int[] hor_dy = {2,1,-1,-2,-2,-1,1,2};
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\1600.txt"));
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int cnt = 0; // 이동할 때마다 +1
		Queue<Pair> queue = new LinkedList<Pair>();
		
		int[][] map = new int[n][m];
		
		for(int r=0; r<n; r++) {
			for(int c=0; c<m; c++) {
				map[r][c] = sc.nextInt();
			}
		}

	/*	for(int r=0; r<n; r++) {
			for(int c=0; c<m; c++) {
				System.out.print(map[r][c]+" ");
			}
			System.out.println();
		}
	 */		
		Pair pos = new Pair(0,0);
		Pair goal = new Pair(n,m);
		
		queue.add(pos);
		
		while(queue.poll() != goal) {
			
			
		}
		
		
		
		
	}

}
class Pair{
	int x;
	int y;
	
	public Pair(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
}

