package JungOl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JA_1863_Á¾±³ {

	public static void main(String[] args) throws FileNotFoundException {
	
		System.setIn(new FileInputStream("res\\1136.txt"));
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
	
		List[] arr = new List[n];
		
		List<Integer> li = new LinkedList<Integer>();
		
		for(int i=0; i<m; i++) {
			
			int first = sc.nextInt();
			int second = sc.nextInt();
			
			
			
			
			li.add(first);
			li.add(second);
			
			arr[0] = li;
			
			
			
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
	

}
