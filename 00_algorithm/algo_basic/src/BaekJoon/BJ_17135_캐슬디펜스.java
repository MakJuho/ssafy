package BaekJun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_17135_캐슬디펜스 {

	private static int[][] map;
	private static int N, M, D;
	private static boolean[] visited;

	private static int[] dx = { -1, 0, 0 };
	private static int[] dy = { 0, 1, -1 };

	private static Queue<Pair> queue;
	private static Pair pos;
	private static int cnt;
	private static int max;

	private static boolean isBreak= false;
	
	public static void main(String[] args) throws FileNotFoundException {

		System.setIn(new FileInputStream("res\\17135.txt"));
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		D = sc.nextInt();

		map = new int[N + 1][M]; // 궁수 자리 추가.
		visited = new boolean[M];

		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				map[r][c] = sc.nextInt();
			}
		}

		getArcher(0, 0, visited);

	}

	private static void bfs() {

	
	}

	private static boolean isIn(int x, int y) {
		return x >= 0 && x < N && y >= 0 && y < N;

	}

	private static void getArcher(int start, int n, boolean[] visited) {
		if (n == 3) {
			
		
			return;

		}
		for (int i = start; i < M; i++) {

			map[N][i] = 1;
			getArcher(i + 1, n + 1, visited);
			map[N][i] = 0;

		}
	}

	static class Pair {
		int x, y;

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
