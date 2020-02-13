package day7;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class P367_Exercise {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] data = new int[1000];
		List<Integer> list= new LinkedList<>();
		
		
		for(int i=0; i< 1000; i++) {
			list.add(rand.nextInt(1000));
			
		}
//		insertionSort(data, 1000);
		insertionSortList(list);
		for(int i=0; i< 999; i++) {
			if(list.get(i)> list.get(i+1)) {
				
				System.out.println("Error");
				System.exit(0);
			}
		}
		
	
		
		
		
	}
	
	public static void insertionSortList(List<Integer> data) {
		for(int i=1; i<data.size(); i++) {
			for(int j=i; j>0; j--) {
				if(data.get(j-1) > data.get(j) ) {
					int temp = data.get(j);
					data.set(j, data.get(j-1));
					data.set(j-1,  temp);
				}else {
					break;
				}
			}
		}
	}
	
	
	public static void insertionSort(int[] data, int cnt) {
		for(int i=1; i<cnt; i++) {
			for(int j=i; j>0; j--) {
				if(data[j-1] > data[j])
				{
					int temp = data[j];
					data[j] = data[j-1];
					data[j-1] = temp;
				}else {
					break;
				}
			}
			
			
			
		}
		
		
	}
}
