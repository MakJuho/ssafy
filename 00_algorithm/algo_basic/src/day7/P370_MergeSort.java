package day7;

import java.util.Arrays;

public class P370_MergeSort {

	public static void main(String[] args) {
		int[] arr = { 69, 10, 30, 2, 16, 8, 31, 22};
		// arr을 병합 정렬하고 결과를 출력하시오.
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	// 재귀의 변수들은 상태를 나타낸다.!!!
	public static void mergeSort(int []arr, int startI, int endI) {
		if(startI == endI) {
			return ;
		}
		// recur case : divide 부분
		int midI = (startI + endI) / 2;
		mergeSort(arr,startI, midI);
		mergeSort(arr,midI+1, endI);
		
		//쪼개기 완료! 이제는 정렬 및 합치기
		merge(arr, startI, midI, endI);
	
	}

	private static void merge(int[] arr, int startI, int midI, int endI) {
		// 병합 정렬의 단점 - 추가적인 메모리 사용.!!
		int [] temp = new int[arr.length];
		
		// 왼쪽 배열의 기점
		int li = startI;
		// 오른 쪽 배열의 기점
		int ri = midI + 1;
		// 임시 배열의 기점
		int ti = startI;
		
		// 양쪽 베열에 모두 값이 있다면 - 한 놈씩 나와서 경합
		while(li <= midI && ri <=endI) {
			if(arr[li] <= arr[ri]) {
				temp[ti++] = arr[li++];
			}else {
				temp[ti++] = arr[ri++];				
			}
		}
		
		// 어느 한 쪽에만 선수가 남아있는 상황...
		while(li <= midI) {
			temp[ti++] = arr[li++];
		}
		
		while(ri <= endI) {
			temp[ti++] = arr[ri++];
		}
		
		// temp에 있는 내용을 다시 arr에 넣어주기
		for(int i=startI; i<=endI; i++) {
			arr[i] = temp[i];
		}
		
		
		
		
	}
	
	
}
