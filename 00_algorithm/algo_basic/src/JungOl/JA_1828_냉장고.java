package JungOl;

import java.awt.image.Raster;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class JA_1828_냉장고 {

	public static void main(String[] args) throws FileNotFoundException {

		System.setIn(new FileInputStream("res\\1828.txt"));
		Scanner sc = new Scanner(System.in);
		List<Pair> li = new LinkedList<Pair>();
		Pair temps = new Pair(0, 0);
		Stack<Pair> st = new Stack<>();
		int TC = sc.nextInt();

		for (int t = 1; t <= TC; t++) {

			li.add(new Pair(sc.nextInt(), sc.nextInt()));

		}

		Collections.sort(li, new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				return o1.low < o2.low ? -1 : 1;
			}
		});
		boolean isFirst = true;
		int cnt = 0;
		for (int i = 0; i < li.size(); i++) {
			Pair tx = li.get(i);
			Pair rx = new Pair(0,0);
			
			if(isFirst == true) {
				st.push(tx);
				isFirst = false;
				continue;
			}
			if (!st.isEmpty()) {
				
				
				if(st.peek().high < tx.low){
					st.pop();
					cnt++;
				}
				
				// 최고 온도 비교
				if (st.peek().high > tx.high) {
					rx.high = tx.high;
					
				}else {
					rx.high = st.peek().high;
				}
				// 최저 온도 비교
				if (st.peek().low > tx.low) {
					rx.low = st.peek().low;
				}else {
					rx.low = tx.low;
				}
				

			}

			st.push(rx);

		}

		System.out.println(cnt + 1);

	}

	static class Pair {
		int low;
		int high;

		public Pair(int low, int high) {
			super();
			this.low = low;
			this.high = high;
		}

		@Override
		public String toString() {
			return "Pair [low=" + low + ", high=" + high + "]";
		}

	}

}
