package com.method;

import java.util.Arrays;


public class MethodTest {
	

	static void getGreeting() {
		System.out.println("...be happy!");
	}
	
	static boolean reverse(boolean a) {
		return !a;
	}
	
	static String result(boolean a, boolean b) {
		return a && b ? "ok" : "cancel";
	}
	
	static void loopString(int a, String b) {
		for(int i=0; i<a; i++) {
			System.out.println(b);
		}
	}
	
	static float getArea(float a) {
		return (float) (Math.PI*a*a);
	}
	
	static float printCircum(int a) {
		return (float) (Math.PI*2*a);
	}
	
	static int[] makeArray(int a) {
//		int [] ary = new int[a];
		return new int[a];
	}
	
	static void total(int[] ary) {
		int sum=0;
		for(int a : ary) {
			sum+=a;
		}
		System.out.println(sum);
	}
	
	static int[] swap(int[] data, int a, int b) {
		int temp= data[a];
		data[a] = data[b];
		data[b] = temp;
		return data;
	}
	
	static int findMax(int[] data2) {
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<data2.length; i++) {
			if( max < data2[i]) {
				max = data2[i];
			}
		}
		
		return max;
	}
	
	static int[] reverseArray(int[] data3) {
		int[] temp = new int[data3.length];
		
		for(int i=0; i<data3.length; i++) {
			temp[i] = data3[data3.length-i-1];
			
		}
		for(int i=0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}
		
		return temp;
		
	}
	
	static void isExist(int[] data3, int index) {
		for(int i=0; i<data3.length; i++) {
			if(data3[i]==index) {
				System.out.println("exist");
				return ;
			}
			
		}
		System.out.println("not exist");
		
	}
	
	static boolean equals(int[] a, int[] b) {
		if(Arrays.equals(a, b)) {
			return true;
		}else
		{
			return false;
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getGreeting();
		System.out.println(reverse(true));
		System.out.println(result(true,false));
		loopString(3,"Hello");
		System.out.println(getArea(4));
		System.out.println(printCircum(4));
		System.out.println(makeArray(4));
		
		int[] test= {1,2,3};
		total(test);
		
		
		int[] data = {1,2,3,4};
		int[] rlt = swap(data,1,3);
		System.out.println(rlt[3]);
		
		int[] data2 = {1,213,52,35,235,31,321,31245};
		System.out.println(findMax(data2));
		
		int[] data3 = {4,2,32,123,25,21,521,521,213};
		reverseArray(data3);
		
		isExist(data3, 2);
		
		int[] sample = {4,2,32,123,25,21,521,521,213};
		System.out.println(equals(data3, sample));
		
		 System.out.println("Working Directory = " +
      System.getProperty("user.dir"));
	}
	
	

}
