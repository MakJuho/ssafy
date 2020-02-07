package com.ssafy;

import java.util.Arrays;

public class CarMgr {
	private Car[] cars = new Car[100];
	private int index=0;
	
	// 싱글톤
	private static CarMgr instance;
	
	public static CarMgr getinstance() {
		
		if(instance == null) {
			instance = new CarMgr();
		}	
		
		return instance;
		
	}
	
	public CarMgr() {}
	
	public void add(Car c){
		cars[index] = c;
		index ++;
	}
	
	public Car[] search(){
		
		for(int i=0; i<index; i++) {
			System.out.println("=====차량 정보 출력=====");
			System.out.println("차량번호:"+cars[i].getNum());
			System.out.println("모델명:"+cars[i].getModel());
			System.out.println("가격:"+cars[i].getPrice());
		}
		
		
		return cars;
	}
	
	public Car search(String num) {
		for(int i=0; i<index; i++) {
			if(num.equals(cars[i].getNum())) {
				System.out.println("=====차량번호로 검색 결과=====");
				System.out.println("차량번호:"+cars[i].getNum());
				System.out.println("모델명:"+cars[i].getModel());
				System.out.println("가격:"+cars[i].getPrice());
				return cars[i];
			}
		}
		System.out.println("해당 차량번호는 존재하지 않습니다.");
		return null;
	}
	
	public Car[] search(int price) {
		System.out.println("=====해당 가격보다 낮은 차량 List=====");
		for(int i=0; i<index; i++) {
			if(price > cars[i].getPrice()) {
				System.out.println("차량번호:"+cars[i].getNum());
				System.out.println("모델명:"+cars[i].getModel());
				System.out.println("가격:"+cars[i].getPrice());
				
			}
		}
		return cars;
	}
	
	public void update(String num, int price) {}
	
	public void delete(String num) {
		int pick_index=0;
		
		for(int i=0; i<index; i++) {
			if(num.equals(cars[i].getNum())) {
				pick_index=i;	
			}
		}
		for(int i=pick_index; i<index; i++) {
			cars[i] = cars[i+1];
		}
		index--;
		System.out.println(Arrays.toString(cars));
	}
	
	public int size() {
		System.out.println("저장된 차량 수는 :"+index+"입니다.");
		return index;
	}
	
	public int totalPrice() {
		int tot=0;
		for(int i=0; i<index; i++) {
			tot += cars[i].getPrice();
		}
		System.out.println("저장된 차량의 금액의 합은:"+tot+"입니다.");
		
		return tot;
		
	}
	
}
