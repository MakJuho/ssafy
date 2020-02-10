package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_1225_암호생성기 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res//1225.txt"));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb =new StringBuilder();
		
		Queue <Integer> queue = new LinkedList<>();
		
		int TC = 10;
		
		for(int t=1; t<=TC; t++) {
			sb.append("#").append(t).append(" ");
			boolean isFinish = false;
			int i = sc.nextInt();
			int first=1;
			for(int cnt =0; cnt<8; cnt++) {
				queue.add(sc.nextInt());
			}
			
			while(true) {
				for(int sub=1; sub<=5; sub++) {
					
					
					// queue에서 마지막 뺀 숫자가 0일 때까지
					if(first <=0) {
						
						isFinish = true;
						break;
					}
					
					// queue에서 값을 뺸다.
					first = queue.poll();
					first = first - sub;
					
					if(first <=0) {
						
						first =0;
					}
					queue.add(first);
					
					
					
				}
				
				if(isFinish) {
					break;
				}
			}
			
			while(!queue.isEmpty()) {
				//System.out.print(queue.poll());
				sb.append(queue.poll()+" ");
			}
		
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}
