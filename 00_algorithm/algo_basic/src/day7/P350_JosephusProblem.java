package day7;

import java.util.LinkedList;
import java.util.List;

public class P350_JosephusProblem {

	private static int n = 24;
	private static int k = 3;
	
	
	
	public static void main(String[] args) {
		// 살아남는 병사의 위치  2개는?
		List<Integer> solders = new LinkedList<>();
		
		for(int i=0; i<24; i++) {
			solders.add(i);
		}
		
		while( solders.size()>2) {
			solders.remove(0);
			solders.add(solders.remove(0));
			solders.add(solders.remove(0));
			
		}
		
		System.out.println(solders);
		
		
		
	}

}
