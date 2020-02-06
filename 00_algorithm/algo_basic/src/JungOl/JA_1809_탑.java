package JungOl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class JA_1809_탑 {

	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("res\\1809.txt"));
		Scanner sc = new Scanner(System.in);
		
		Stack<Wall> st = new Stack<>();
		
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
				
		for(int i=0; i<N; i++) {
			int newHeight = sc.nextInt();
			while(!st.isEmpty()) {
				if(st.peek().height < newHeight) {
					st.pop();
				}else {
					break;
				}
			}
			if(st.isEmpty()) {
				sb.append("0 ");
			}else {
				sb.append((st.peek().index+1)+" ");
			}
			
			st.push(new Wall(newHeight, i));
		}	
		
		System.out.println(sb);
	
	}
	
	static class Wall{
		int height;
		int index;
		
		public Wall(int height, int index) {
			super();
			this.height = height;
			this.index = index;
		}
		
		
	}
	

}
