package day6;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq = new PriorityQueue<>(new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				
				// TODO Auto-generated method stub
				Integer len1 = o1.length();
				Integer len2 = o2.length();
				if(len1 == len2) {
					return o1.compareTo(o2);
				}
				return len1.compareTo(len2);
			}
		}); 
		
		pq.offer("true");
		pq.offer("my");
		pq.offer("dream");
		pq.offer("is");
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		
	}

}
