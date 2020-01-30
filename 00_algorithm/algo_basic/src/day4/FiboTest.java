package day4;

import java.util.Arrays;

public class FiboTest {

	
	static long [] memo = new long[100];
	
	public static void main(String[] args) {
		// fibo(10)을 구해보자
		memo[0] = 0;
		memo[1] = 1;
		System.out.println(fibo(50));
		System.out.println(Arrays.toString(memo));
		
	}
	
	private static long fibo(int num) {
		if(memo[num] ==0 && num>1) {
			memo[num] = fibo(num-1) + fibo(num-2);
		}
		
		return memo[num];
		
	}

}
