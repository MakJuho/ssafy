package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class SWEA_1220_Magenetic {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\1220.txt"));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> st = new Stack<>();

		for (int t = 1; t <= 10; t++) {
			sb.append("#").append(t).append(" ");
			int N = sc.nextInt();
			int[][] map = new int[N][N];

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					map[r][c] = sc.nextInt();
				}
			}

			int cnt = 0;
			for (int c = 0; c < N; c++) {
				for (int r = 0; r < N; r++) {
					if (st.isEmpty()) {
						if (map[r][c] == 1) {
							st.push(map[r][c]);
							continue;
						}
					} else {

						if (st.peek() == 1 && map[r][c] == 2) {
							cnt++;
							while (!st.isEmpty()) {
								st.pop();
							}

						}
					}

				}
				while (!st.isEmpty())
					st.pop();
			}
			// System.out.println(cnt);
			sb.append(cnt).append("\n");

		}
		System.out.println(sb);
	}

	
}
