package day4;

import java.util.Arrays;

public class baby_gin {
//	private static String[] nums = {"101123", "667767", "054060"};
	private static String nums = "101123";
	private static int[] num = {1,0,1,1,2,3};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		checkBaby_gin(0, new char[6], new boolean[6]);
		greedyBaby_gin();
//		System.out.println(nums+"은 isBabyGin이 아닙니다.");
	}
	
	public static void checkBaby_gin(int current, char[] temp, boolean[] visited) {
		//base case
		if(current == 6) {
			if(isBabyGin(temp)) {
				System.out.println(nums+"는 isBabyGin입니다.");
				System.exit(0);
			}
			return ;
		}
		else {
			for(int i=0; i< nums.length(); i++) {
				if(!visited[i]) {
					visited[i] = true;
					temp[current] = nums.charAt(i);
					checkBaby_gin(current+1, temp, visited);
					visited[i] = false;
				}
			}
		}
		// recur case
	}
	
	private static boolean isBabyGin(char[] temp) {
		int cnt = 0;

		if(temp[0]==temp[1] && temp[1]==temp[2]) { 		// triplet
			cnt++;
		}else if(temp[0]+1 == temp[1] && temp[1]+1 == temp[2]) { // run
			cnt++;
		}
		
		if(temp[3]==temp[4] && temp[4]==temp[5]) { 		// triplet
			cnt++;
		}else if(temp[3]+1 == temp[4] && temp[4]+1 == temp[5]) { // run
			cnt++;
		}
		
		return cnt ==2;
		
	}

	public static void greedyBaby_gin() {
		int[] checkBox = new int[10];
		
		for(int i=0; i<num.length; i++) {
			checkBox[num[i]]++;
		}
		
//		System.out.println(Arrays.toString(checkBox));
		if(checkgBg(checkBox)) {
			System.out.println(Arrays.toString(num)+"은 baby_gin 입니다.");
		}else
			System.out.println(Arrays.toString(num)+"은 baby_gin이 아닙니다.");
		
	}
	private static boolean checkgBg(int[] checkBox) {
		int cnt = 0;
		for(int i=0; i<checkBox.length; i++) {
			if(checkBox[i] == 3) {
				
				checkBox[i] =-3;
				cnt++;
			}else if(checkBox[i] >= 1) {
				if(checkBox[i+1]>=1 && checkBox[i+2]>=1) {
					// run , pass
					cnt++;
					checkBox[i]--;
					checkBox[i+1]--;
					checkBox[i+2]--;
				}else {
					return false;
				}
			}
		}
		
		if(cnt == 2) {
			return true;
		}
		return false;
	}
	
}
