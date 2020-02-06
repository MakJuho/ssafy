package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SWEA_6808_카드게임 {

	private static int [] iyCards, kyCards;
	private static int iyWin, kyWin;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\6808.txt"));
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
/*		1. 남은 카드의 순서대로 정렬
		2. 규영이와 비교 점수 계산
		3. 이겼을 때와 졌을 떄 +1*/
		int TC = sc.nextInt();
		
		for(int t=1; t<=TC; t++) {
			sb.append("#").append(t).append(" ");
			kyCards = new int[9];
			iyCards = new int[9];
			
			// 모든 카드 번호를 저장할 배열
			int []cb = new int[18+1];
			
			// 테스트 케이스마다 멤버 변수들 초기화 하기!!
			iyWin =0;
			kyWin =0;
			
			for(int i=0; i<9; i++) {
				kyCards[i] = sc.nextInt();
				cb[kyCards[i]] =1;
			}
			int cnt=0;
			for(int j=1; j<=18; j++) {
				
				if(cb[j] == 0 ) {
					iyCards[cnt] = j;
					cnt++;
				}
			}
			//System.out.println(Arrays.toString(iyCards));
			
//			Arrays.sort(iyCards);
			do {
				//System.out.println(Arrays.toString(iyCards));
				check();
			}while(nextPermutation());
			
			//nextPermutation();
			sb.append(kyWin+" "+iyWin).append("\n");
			

			
		}
		System.out.println(sb);	
	}
	private static void check() {
		
		int iyScore = 0;
		int kyScore = 0;
		
		for(int i=0; i<9; i++) {
			
			int iCard = iyCards[i];
			int kCard = kyCards[i];
			
			if(iCard > kCard) {
				iyScore += iCard + kCard;
			}else {
				kyScore += iCard + kCard;
			}
			
		}
		
		if(iyScore > kyScore) {
			iyWin++;
		}else if(iyScore < kyScore) {
			kyWin++;
		}
		
	}
	
	
	private static boolean nextPermutation() {
		int i;
		
		for(i = iyCards.length-1-1; i>=0; i--) {
			if(iyCards[i] < iyCards[i+1]) { // i가 결정
				break;
			}
		}
		// i가 0보다 작으면
		if( i<0) {
			return false;
		}
		
		int j;
		for(j = iyCards.length-1; j>=0; j--) {
			if(iyCards[i] < iyCards[j]) {
				break;
			}
		}
		
		
		int temp = iyCards[i];
		iyCards[i] = iyCards[j];
		iyCards[j] = temp;
		
		for(int k=i+1, l = iyCards.length-1; k<l; k++, l--) {
			temp = iyCards[k];
			iyCards[k] = iyCards[l];
			iyCards[l] = temp;
		}
		return true;
		
		
	}

}
