package day6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CRUD 생성, 읽기, 업데이트, 제거
		addTest();
		updateTest();
		search();
		remove();
		sequencialAdd(new ArrayList<>(), 1);
		sequencialAdd(new LinkedList<>(), 1);
		sequencialAdd(new ArrayList<>(), 2);
		sequencialAdd(new LinkedList<>(), 2);
	}
	
//	static List<Integer> list = new ArrayList<>(); // 순차적 리스트
	static List<Integer> list = new LinkedList<>(); // 비순차적 리스트
	
	
	
	public static void sequencialAdd(List<Integer> list, int type) {
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			if(type == 1) {
				list.add(i); // sequential
			}else {
				list.add(0, i); // non sequencial
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getName()+" : "+(end-start));
		
		
	}
	
	public static void addTest() {
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		list.add(0, -1);
		list.add(0, -2);
		System.out.println(list);
	}
	
	private static void updateTest() {
		list.set(0, -100);
		System.out.println("수정 결과:"+list);
	
	}
	

	private static void search() {
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		Integer num = list.get(1);
		System.out.println(num);
		System.out.println(list.contains(1));
	}
	
	private static void remove() {
		
		int i = Integer.valueOf(1);
		Integer i2 = 3;
		
		System.out.println("삭제 전:"+ list);
		list.remove(i2);
		System.out.println("삭제 후:"+ list);
		
		list.clear();
//		list.remove(index)
	}

}
