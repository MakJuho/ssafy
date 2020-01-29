package day3;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class RecursionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[1];
		recur2(5);
	
	}
	@Test
	public void recur3Test() {
		int[] arr =new int[1];
		recur3(0,3,arr);
	}
	
	@Test
	public void recur4Test() {
		System.out.println(recur4(3));
	}
	
	public int recur4(int n) {
		if( n <=0) {
			return 0;
		}
		else {
			return n+recur4(n-1);
		}
	}
	
	int cnt2;
	@Test
	public void recur6Test() {
		recur6(0,3);
		System.out.println("cnt2:"+cnt2);
	}
	
	public void recur6(int k, int n) {
		if(k <= n) {
			cnt2++;
			return ;
		}
		recur6(k+1, n);
		recur6(k+1, n);
	}
	
	@Test
	public void recur7Test() {
//		System.out.println(getMulti(2,4));
		assertEquals(getMulti(3,4), 12);
		
	}
	public int getMulti(int n, int m) {
		if(n == m)
			return m;
		else
			return n*getMulti(n+1,m);
	}
	
	@Test
	public void recur8Test() {
//		System.out.println(getMulti(2,4));
		System.out.println(getPower(2,4));
		
	}
	public int getPower(int n, int m) {
		if(m == 1)
			return n;
		else
			return n*getPower(n,m-1);
	}
	
	
	@Test
	public void recur9Test() {
//		System.out.println(getMulti(2,4));
		int sum=0;
		System.out.println(getDigitSum(12321, sum));
		
	}
	public int getDigitSum(int n, int sum) {
		if( n >= 0 && n <10 ) {
			System.out.println(n+sum);
			return 0;
		}
		else
			return getDigitSum(n/10, sum+n%10);
	}
	
	@Test
	public void recur10Test() {
//		System.out.println(getMulti(2,4));
		
		System.out.println(getlen("Hello"));
		
	}
	public int getlen(String str) {
		// base case
		if( str.equals("")) {
			return 0;
		}
		// recur case
		else
			return 1+getlen(str.substring(1));
	}
	
	@Test
	public void recur11Test() {
//		System.out.println(getMulti(2,4));
		
		printStr("HEHE");
	}
	public void printStr(String str) {
		// base case
		if( str.equals("")) {
			return ;
		}
		// recur case
		else
			System.out.print(str.charAt(0));
			printStr(str.substring(1));
	}
	
	@Test
	public void recur12Test() {
//		System.out.println(getMulti(2,4));
		
		printreStr("HELLO WORLD");
	}
	public void printreStr(String str) {
		// base case
		if( str.equals("")) {
			return ;
		}
		// recur case
		else
			System.out.print(str.charAt(str.length()-1));
			printreStr(str.substring(0,str.length()-1));
	}
	
	@Test
	public void recur13Test() {
//		System.out.println(getMulti(2,4));
		
		ToBinary(10);
	}
	public int ToBinary(int n) {
		// base case
		if(n <= 1 ) {
			System.out.print(n);
			return 1;
		}
		// recur case
		ToBinary(n/2);
		System.out.print(n%2);
		return n%2;
	
		
	}
	
	// 크기가 n인 배열 int [] arr의 합을 반환하세요.
	@Test
	public void recur14Test() {
//		System.out.println(getMulti(2,4));
		int[] arr= {1,2,3,4};
		int n = 0;
		System.out.println(sumAry(arr, n));
	}
	public int sumAry(int[] arr, int len) {
		// base case
		int sum=0;
		if(len == arr.length  ) {
			return sum;
		}
		else {
			
			sum+=arr[len];
			return arr[len]+sumAry(arr, len+1);
		}
	}
	
	// int [] arr에서 최대값을 찾아서 반환하시오.
	@Test
	public void recur15Test() {
		int[] arr= {1,2,3,4};
		int n = 0;
		System.out.println(maxIndex(arr, n));
	}
	public int maxIndex(int[] arr, int len) {
		// base case
		int max=Integer.MIN_VALUE;
		if(len == arr.length-1  ) {
			return arr[arr.length-1];
		}
		else {
			if(max < arr[len]) {
				max = arr[len];
			}
			return maxIndex(arr, len+1);
		}
	}
	
	
	// binarySearch 구현
	@Test
	public void recur16Test() {
		int[] arr= {1,2,3,4};
		int n = 0;
		System.out.println(binarySearch(arr, 2, 1, arr.length));
	}
	public int binarySearch(int[] arr, int target, int start, int end) {
		// base case
		Arrays.sort(arr);
		int index = (start+end)/2;
		if( start > end ) {
			return -1;
		}
		if( target == arr[index]) {
			return index;
		}
		else if( target > arr[index]){
			return binarySearch(arr, target, index+1, end);
		}
		else{
			return binarySearch(arr, target, start, index-1);
		}
		
	}
	
	// binarySearch 구현
		@Test
		public void recur17Test() {
			String arr= "소주만병만주소" ;
		
			System.out.println(ispalindrome(arr, 2, 4));
		}
		public boolean ispalindrome(String str, int from, int to) {
			// base case
			
			if(from == to) {
				return true;
			}
			else if(from+1 == to) {
				return str.charAt(from) == str.charAt(to);
			}
			else {
				return str.charAt(from) == str.charAt(to) && ispalindrome(str, from+1, to-1);
			}
			
		}
	
	
	public static void recur3(int k, int n, int[] arr) {
		if(k == n) {
			return;
		}
		arr[0] = k;
		System.out.println(k + " : "+ arr[0]);
		recur3(k+1, n, arr);
		arr[0] = k;
		System.out.println(k+ " : "+ arr[0]);
	}
	
	public static void recur2(int k) {
		// base case : 종료 조건
		if(k==0) {
			System.out.println("재귀 종료");
			return ;
		}else {
			
			// recur case: base case에 수렴하도록 자기 호출
			System.out.println("before: "+k);
			recur2(k-1);
			System.out.println("after: "+k);
			
		}
		
		
	}

}
