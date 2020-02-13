package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA_1231_중위순회 {

	public static void main(String[] args) throws FileNotFoundException {

		System.setIn(new FileInputStream("res\\1231.txt"));
		
		Scanner sc = new Scanner(System.in);
		
		int TC = 10;
		
		for(int t=1; t<=TC; t++) {
			int N = sc.nextInt();
			for(int i=0; i<N; i++) {
				int nodeNum= sc.nextInt();
				char ch = sc.next().charAt(0);
				String nums = sc.nextLine();
				nums.split(" ");
				System.out.println(nums);
			}
		}
		
	}

	static class Node{
		char v;
		Node l, r;
		
		
		
		public Node(char v, Node l, Node r) {
	
			this.v = v;
		}
		
	}
	
}
