package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SWEA_1229_¾ÏÈ£¹®2 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("res\\1229.txt"));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int TC = 10;
		
		for(int t=1; t<=TC; t++) {
			sb.append("#").append(t).append(" ");
			int N = sc.nextInt();
			
			List<Integer> list = new LinkedList<Integer>();
			for(int i=0; i<N; i++) {
				list.add(sc.nextInt());
			}
			
			int cNum = sc.nextInt();
			
			for(int i=0; i<cNum; i++) {
				char command = sc.next().charAt(0);
				
				if(command =='I') {
				
					int index = sc.nextInt();
					int chNum = sc.nextInt();
					List<Integer> add_list = new LinkedList<Integer>();
					
					for(int j=0; j<chNum; j++) {
						
						add_list.add(sc.nextInt());
					}
					
					list.addAll(index, add_list);					
					
				}
				else if(command == 'D') {
					int remove_idx = sc.nextInt();
					int remove_cnt = sc.nextInt();
					for(int j=remove_idx; j<remove_idx+remove_cnt; j++)
						list.remove(remove_idx);
				}
				
			}
			
			for(int i=0; i<10; i++) {
				sb.append(list.get(i)+" ");
				
			}

			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}
