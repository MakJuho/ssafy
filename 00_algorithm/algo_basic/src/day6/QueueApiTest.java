package day6;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new LinkedList<>();
		
		// 데이터 넣기
		queue.offer(1);
		queue.add(1);
		
		// 확인
		System.out.println(queue.peek()+" : "+queue.size());
		System.out.println(queue.element()+" : "+queue.size());
		
		// 삭제
		System.out.println(queue.poll()+" : "+queue.size());
		System.out.println(queue.remove()+" : "+queue.size());
		
		System.out.println(queue.isEmpty());
		queue.clear();
		
	}

}
