package day6;

import java.util.LinkedList;
import java.util.Queue;

public class P304_myzoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Pair> pq = new LinkedList<>();
		int goal = 20;
		int cnt= 1;
		int index = 1;
		// 맨 처음에 하나를 넣는다.
		pq.add(new Pair(index,cnt));
		// 자기 자신을 뺴면서 cnt +1을 한다.
		Pair tmp = new Pair(0,0);
//		goal -= 1;
		while(goal > 0) {
			
			//pq.add(new Pair(index,cnt));
			
			tmp = pq.poll();
			pq.add(new Pair(tmp.index,tmp.cnt+1));
			goal -= tmp.cnt;
			System.out.println(tmp.toString());
			pq.add(new Pair(++index, 1));
			
		}
		// 다음 큐를 넣으면서 cnt에 시작을 한다.
		System.out.println(tmp.index);
	
	}
	
	
	
	static class Pair{
		int index;
		int cnt;
		
		public Pair(int index, int cnt) {
		
			this.index = index;
			this.cnt = cnt;
		}

		@Override
		public String toString() {
			return "Pair [index=" + index + ", cnt=" + cnt + "]";
		}
		
	}

	

}
