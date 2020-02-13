package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SWEA_1258_행렬찾기 {

	private static int[] dx = { 0, 1 };
	private static int[] dy = { 1, 0 };

	public static void main(String[] args) throws FileNotFoundException {

		System.setIn(new FileInputStream("res\\1258.txt"));
		Scanner sc = new Scanner(System.in);
		Pair pos;

		int TC = sc.nextInt();

		for (int t = 1; t <= TC; t++) {
			int N = sc.nextInt();

			List<Pair> queue = new LinkedList<Pair>();
			pos = new Pair(0, 0);
			int[][] map = new int[N][N];

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					map[r][c] = sc.nextInt();

				}
			}

			while (true) {
				int x_cnt = 0;
				int y_cnt = 0;
				int start_x = pos.x;
				int start_y = pos.y;
				// 오른쪽
				while (true) {
					if (isOut(pos.x + dx[0], pos.y + dy[0], N))
						break;
					if (map[pos.x + dx[0]][pos.y + dy[0]] == 0) {
						break;
					}
					pos.x = pos.x + dx[0];
					pos.y = pos.y + dy[0];
					x_cnt++;
				}

				// 아래쪽
				while (true) {
					if (isOut(pos.x + dx[1], pos.y + dy[1], N))
						break;
					if (map[pos.x + dx[1]][pos.y + dy[1]] == 0) {
						break;
					}
					pos.x = pos.x + dx[1];
					pos.y = pos.y + dy[1];
					y_cnt++;
				}
				Pair rlt = new Pair(0, 0);
				rlt.x = y_cnt + 1;
				rlt.y = x_cnt + 1;
				// System.out.println(rlt);
				queue.add(rlt);

				// System.out.println("x_cnt:"+x_cnt+"||"+"y_cnt:"+y_cnt);

				for (int r = start_x; r <= start_x + y_cnt; r++) {
					for (int c = start_y; c <= start_y + x_cnt; c++) {
						if (isOut(r, c, N))
							break;
						map[r][c] = -1;
					}
				}
				/*
				 * for(int r=0; r<N; r++) { for(int c=0; c<N; c++) {
				 * System.out.print(map[r][c]+" ");
				 * 
				 * } System.out.println(); }
				 */

				boolean isFinish = true;
				boolean isFirst = true;

				for (int r = 0; r < N; r++) {
					for (int c = 0; c < N; c++) {
						if (map[r][c] != 0 && map[r][c] != -1 && isFirst) {
							pos.x = r;
							pos.y = c;
							isFirst = false;
							isFinish = false;
						}
					}
				}

				if (isFinish) {
					break;
				}

			}
			// for(int i=0; i<queue.size(); i++){
			Collections.sort(queue);

			System.out.print("#" + t + " " + queue.size() + " ");
			for (int i = 0; i < queue.size(); i++) {
				Pair tx = queue.get(i);
				System.out.print(tx.x + " " + tx.y + " ");
			}
			System.out.println();
			// System.out.println(queue);
			// }

		}

	}

	private static boolean isOut(int x, int y, int n) {
		return !(x < n && x >= 0 && y < n && y >= 0);
	}

	static class Pair implements Comparable<Pair> {
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

		@Override
		public int compareTo(Pair o) {

			if (o.x * o.y == this.x * this.y) {
				return Integer.compare(this.x, o.x);
			}

			return Integer.compare(this.x * this.y, o.x * o.y);
		}

	}

}
