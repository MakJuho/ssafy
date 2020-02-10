package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SWEA_4408_자기방으로돌아가기 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("res\\4408.txt"));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int TC = sc.nextInt();

		for (int t = 1; t <= TC; t++) {
			sb.append("#").append(t).append(" ");
			// 돌아갈 학생수
			int N = sc.nextInt();

			int[] cor = new int[200];

			for (int i = 0; i < N; i++) {
				int room1 = sc.nextInt();
				int room2 = sc.nextInt();

				int min = Math.min(room1, room2);
				int max = Math.max(room1, room2);

				room1 = (min - 1) / 2;
				room2 = (max - 1) / 2;

				for (int j = room1; j <= room2; j++) {
					cor[j]++;
				}

			}
			Arrays.sort(cor);
			System.out.println("#" + t + " " + cor[199]);

		}
		// System.out.println(sb);

	}

}
