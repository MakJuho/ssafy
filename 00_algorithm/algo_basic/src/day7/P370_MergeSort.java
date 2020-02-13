package day7;

import java.util.Arrays;

public class P370_MergeSort {

	public static void main(String[] args) {
		int[] arr = { 69, 10, 30, 2, 16, 8, 31, 22};
		// arr�� ���� �����ϰ� ����� ����Ͻÿ�.
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	// ����� �������� ���¸� ��Ÿ����.!!!
	public static void mergeSort(int []arr, int startI, int endI) {
		if(startI == endI) {
			return ;
		}
		// recur case : divide �κ�
		int midI = (startI + endI) / 2;
		mergeSort(arr,startI, midI);
		mergeSort(arr,midI+1, endI);
		
		//�ɰ��� �Ϸ�! ������ ���� �� ��ġ��
		merge(arr, startI, midI, endI);
	
	}

	private static void merge(int[] arr, int startI, int midI, int endI) {
		// ���� ������ ���� - �߰����� �޸� ���.!!
		int [] temp = new int[arr.length];
		
		// ���� �迭�� ����
		int li = startI;
		// ���� �� �迭�� ����
		int ri = midI + 1;
		// �ӽ� �迭�� ����
		int ti = startI;
		
		// ���� ������ ��� ���� �ִٸ� - �� �� ���ͼ� ����
		while(li <= midI && ri <=endI) {
			if(arr[li] <= arr[ri]) {
				temp[ti++] = arr[li++];
			}else {
				temp[ti++] = arr[ri++];				
			}
		}
		
		// ��� �� �ʿ��� ������ �����ִ� ��Ȳ...
		while(li <= midI) {
			temp[ti++] = arr[li++];
		}
		
		while(ri <= endI) {
			temp[ti++] = arr[ri++];
		}
		
		// temp�� �ִ� ������ �ٽ� arr�� �־��ֱ�
		for(int i=startI; i<=endI; i++) {
			arr[i] = temp[i];
		}
		
		
		
		
	}
	
	
}
